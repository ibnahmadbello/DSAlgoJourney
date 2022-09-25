package leetcodePractice;

import java.util.Arrays;

public class ArrangeArray {

	public static void main(String[] args) {
		System.out.println(Arrays.toString(arrangeArray(new int[]{5, 3, 2, 4, 0, 1})));
	}
	
	private static int [] arrangeArray(int[] nums) {
		int ans[] = new int[nums.length];
		for (int i = 0; i < ans.length; i++) {
			ans[i] = nums[nums[i]];
		}
		return ans;
	}

}
