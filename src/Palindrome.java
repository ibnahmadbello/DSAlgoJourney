
public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(isPalindrome(123521));
	}

	private static boolean isPalindrome(int x) {
		// TODO Auto-generated method stub
		int reversedNumber = 0;
		while(x > reversedNumber) {
			reversedNumber = reversedNumber * 10 + x % 10;
			x /= 10;
		}
		System.out.println(reversedNumber);
		return x == reversedNumber || x ==reversedNumber/10;
	}
}