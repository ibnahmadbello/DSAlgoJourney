package howsum;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class HowSumWithMemoization {
	public static void main(String args[]) {
	System.out.println(howSum(7, new int[] {2, 3}));
	System.out.println(howSum(7, new int[] {5, 3, 4, 7}));
	System.out.println(howSum(7, new int[] {2, 4}));
	System.out.println(howSum(8, new int[] {2, 3, 5}));
	System.out.println(howSum(300, new int[] {7, 14}));
	System.out.println(howSum(12, new int[] {2, 3, 1}));
	}

	private static List<Integer> howSum(int targetSum, int[] numbers){
		return howSum(targetSum, numbers, new HashMap<>());
	}
	
	private static List<Integer> howSum(int targetSum, int[] numbers, HashMap<Integer, List<Integer>> sumMap) {
		if(sumMap.containsKey(targetSum)) return sumMap.get(targetSum);
		if(targetSum == 0) return new ArrayList<Integer>();
		if(targetSum < 0) return null;
		
		for (Integer num : numbers) {
			int remainder = targetSum - num;
			List<Integer> remainderResult = howSum(remainder, numbers, sumMap);
			if(remainderResult != null) {
				remainderResult.add(num);
				sumMap.put(targetSum, remainderResult);
				return sumMap.get(targetSum);
			}
		}
		sumMap.put(targetSum, null);
		return null;
	}
	 
}
