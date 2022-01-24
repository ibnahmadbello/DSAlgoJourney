package bestSum;

import java.util.ArrayList;
import java.util.List;

public class BestSum {
	
	public static void main(String args[]) {
		System.out.println(bestSum(7, new int[] {5, 3, 4, 7}));
		System.out.println(bestSum(8, new int[] {2, 3, 5}));
		System.out.println(bestSum(8, new int[] {5, 1, 4}));
		System.out.println(bestSum(100, new int[] {5, 1, 2, 25}));
	}
	
	public static List<Integer> bestSum(int targetSum, int[] numbers){
		if(targetSum == 0) return new ArrayList<>();
		if(targetSum < 0) return null;
		
		List<Integer> shortestCombination = null;
		List<Integer> combination = null;
		
		for(int num : numbers) {
			int remainder = targetSum - num;
			var remainderCombination = bestSum(remainder, numbers);
			if(remainderCombination != null) {
				remainderCombination.add(num);
				combination = remainderCombination;
				if(shortestCombination == null || combination.size() < shortestCombination.size()) {
					shortestCombination =combination;
				}
			}
		}
		
		return shortestCombination;
	}
}
