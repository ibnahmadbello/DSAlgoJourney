import java.util.BitSet;

public class Sieve {

	public static void main(String[] s) {
		int n = 2000000;
		long start = System.currentTimeMillis();
		var bitSet = new BitSet(n + 1);
		int count = 0;
		int i;
		for (i = 2; i <= n; i++)
			bitSet.set(i);
//		for (i = 0; i <= 10; i++)
//			System.out.println(bitSet.get(i));
		System.out.println(bitSet.get(0, 10));
		i = 2;
		while (i * i <= n) {
			if (bitSet.get(i)) {
				count++;
				int k = 2 * i;
				while (k <= n) {
					bitSet.clear(k);
					k += i;
				}
			}
			i++;
		}
		while (i <= n) {
			if (bitSet.get(i))
				count++;
			i++;
		}
		long end = System.currentTimeMillis();
		System.out.println(count + " primes");
		System.out.println((end - start) + " milliseconds");
	}

}
