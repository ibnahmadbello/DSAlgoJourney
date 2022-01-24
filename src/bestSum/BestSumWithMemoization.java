package bestSum;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class BestSumWithMemoization {
	public static void main(String args[]) {
		System.out.println(bestSum(7, new int[] {5, 3, 4, 7}));
		System.out.println(bestSum(8, new int[] {2, 3, 5}));
		System.out.println(bestSum(8, new int[] {1, 4, 5}));
		System.out.println(bestSum(100, new int[] {1, 2, 5, 25}));
	}
	
	private static List<Integer> bestSum(int targetSum, int[] numbers){
		return bestSum(targetSum, numbers, new HashMap<>());
	}
	
	private static List<Integer> bestSum(int targetSum, int[] numbers, HashMap<Integer, List<Integer>> bestMap) {
		if(bestMap.containsKey(targetSum)) return bestMap.get(targetSum);
		if(targetSum == 0) return new ArrayList<Integer>();
		if(targetSum < 0) return null;
		
		List<Integer> shortestCombination = null;
		
		for (Integer num : numbers) {
			int remainder = targetSum - num;
			List<Integer> remainderCombination = bestSum(remainder, numbers, bestMap);
			if(remainderCombination != null) {
				List<Integer> combination = new ArrayList<>(remainderCombination);
//				remainderCombination.add(num);
				combination.add(num);
//				combination.addAll(shortestCombination);
				if(shortestCombination == null || combination.size() < shortestCombination.size()) {
					shortestCombination = combination;
				}
			}
		}
		bestMap.put(targetSum, shortestCombination);
		return shortestCombination;
	}	
	
}
