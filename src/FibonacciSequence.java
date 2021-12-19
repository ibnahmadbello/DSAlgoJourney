
public class FibonacciSequence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(fib(5));
		System.out.println(fib(8));
		
	}
	
	public static int fib(int n) {
		if(n <= 2)
			return 1;
		return fib(n -1) + (n - 2);
	}

}
