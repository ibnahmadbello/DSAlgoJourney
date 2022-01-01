package fibonacci;

import java.util.HashMap;

public class FibSeqWithMemoizationUsingMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(fib(6));
		System.out.println(fib(7));
		System.out.println(fib(8));
		System.out.println(fib(46));
		System.out.println(fib(47));
		System.out.println(fib(50));
		System.out.println(fib(100));
		
		System.out.println();
	}

	public static long fib(int n) {
		return fib(n, new HashMap<>());
	}
	
	public static long fib(int n, HashMap<Integer, Long> fibMap) {
		if (fibMap.containsKey(n)) return fibMap.get(n);
		if (n <= 2) return 1;
		fibMap.put(n, fib(n - 1, fibMap) + fib(n - 2, fibMap));
		return fibMap.get(n);
	}

}
