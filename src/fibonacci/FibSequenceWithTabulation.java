package fibonacci;

import java.util.Arrays;

public class FibSequenceWithTabulation {
	public static void main(String args[]) {
		System.out.println(fib(6));
		System.out.println(fib(7));
		System.out.println(fib(8));
		System.out.println(fib(50));
	}
	
	public static int fib(int n) {
		int[] table = new int[n + 1];
		Arrays.fill(table, 0);
		table[1] = 1;
		for (int i = 2; i <= n; ++i) {
			table[i] = table[i-1] + table[i-2];
		}
		return table[n];
	}
}
