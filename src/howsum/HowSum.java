package howsum;

import java.util.ArrayList;
import java.util.List;

public class HowSum {
	public static void main(String args[]) {
	System.out.println(howSum(7, new int[] {2, 3}));
	System.out.println(howSum(7, new int[] {5, 3, 4, 7}));
	System.out.println(howSum(7, new int[] {2, 4}));
	System.out.println(howSum(8, new int[] {2, 3, 5}));
	System.out.println(howSum(300, new int[] {7, 14}));
	System.out.println(howSum(12, new int[] {2, 3, 1}));
	}

	private static List<Integer> howSum(int targetSum, int[] numbers) {
		if(targetSum == 0) return new ArrayList<Integer>();
		if(targetSum < 0) return null;
		
		for (Integer num : numbers) {
			int remainder = targetSum - num;
			List<Integer> remainderResult = howSum(remainder, numbers);
			if(remainderResult != null) {
				remainderResult.add(num);
				return remainderResult;
			}
		}
		
		return null;
	}
}
