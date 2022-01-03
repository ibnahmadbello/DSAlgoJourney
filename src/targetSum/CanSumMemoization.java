package targetSum;

import java.util.HashMap;

public class CanSumMemoization {

	public static void main(String[] args) {
		System.out.println(canSum(7, new int[] {2, 3}));
		System.out.println(canSum(7, new int[] {5, 3, 4, 7}));
		System.out.println(canSum(7, new int[] {2, 4}));
		System.out.println(canSum(8, new int[] {2, 3, 5}));
		System.out.println(canSum(300, new int[] {7, 14}));
		System.out.println(canSum(12, new int[] {2, 3, 1}));
	}
	
	public static boolean canSum(int targetSum, int[] numbers) {
		return canSum(targetSum, numbers, new HashMap<>());
	}
	
	public static boolean canSum(int targetSum, int[] numbers, HashMap<Integer, Boolean> sumMap) {
		if(sumMap.containsKey(targetSum)) return sumMap.get(targetSum);
		if(targetSum == 0) return true;
		if(targetSum < 0) return false;
		for (int i = 0; i < numbers.length; i++) {
			int remainder = targetSum - numbers[i];
			if(canSum(remainder, numbers, sumMap) == true) { 
				sumMap.put(targetSum, true);
				return true;
			}
		}
		sumMap.put(targetSum, false);
		return false;
	}

}
