package fibonacci;
import java.util.HashMap;
import java.util.Map;

public class FibSeqWithMemoization {

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
		long fibArray[] = new long[(int)(n + 2)];
		fibArray[0] = 0;
		fibArray[1] = 1;
		for (int i = 2; i <= n; i++) {
			fibArray[i] = fibArray[i -1] + fibArray[i - 2];			
		}
		
		return fibArray[n];
	}

	/*
	 * Another method that uses map
	 * */
	public static long fibWithMap(long i) {
		Map<Long, Long> fibMap = new HashMap<Long, Long>();
		if(i == 0 || i == 1) {
			return i;
		}
		if (fibMap.containsKey(i)) {
				return fibMap.get(i);
			}
		
		long fibForN = fibWithMap(i - 1) + fibWithMap(i - 2);
		fibMap.put(i, fibForN);
		
		return fibForN;
	}

}
