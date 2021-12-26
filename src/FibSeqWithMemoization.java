
public class FibSeqWithMemoization {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(fib(6));
		System.out.println(fib(7));
		System.out.println(fib(8));
		System.out.println(fib(50));
	}
	
	public static int fib(int n) {
		if(n <= 2)
			return 1;
		return fib(n - 1) + fib(n - 2);
	}

}
