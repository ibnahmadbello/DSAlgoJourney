package leetcodePractice;

import java.util.Arrays;
import java.util.HashMap;

public class ArrangeArray {

	public static void main(String[] args) {
		System.out.println(Arrays.toString(arrangeArray(new int[]{5, 3, 2, 4, 0, 1})));
		System.out.println(arrangeArraywithMap(new int[]{5, 3, 2, 4, 0, 1}));

	}
	
	private static int [] arrangeArray(int[] nums) {
		int ans[] = new int[nums.length];
		for (int i = 0; i < ans.length; i++) {
			ans[i] = nums[nums[i]];
		}
		return ans;
	}
	
	private static HashMap<Integer,Integer> arrangeArraywithMap(int[] nums) {
		HashMap<Integer, Integer> arrangeMap = new HashMap<>();
		for (int i = 0; i < nums.length; i++) {
			arrangeMap.put(i, nums[nums[i]]);
		}
		return arrangeMap;
	}

}
