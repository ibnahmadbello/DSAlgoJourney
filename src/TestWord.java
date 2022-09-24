import java.util.Random;

public class TestWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] res = generateRandomWords(3);
		for (int i = 0; i < res.length; i++) {
			System.out.println(res[i]);
		}
	}

	public static String[] generateRandomWords(int numberOfWords)
	{
	    String[] randomStrings = new String[numberOfWords];
	    Random random = new Random();
	    for(int i = 0; i < numberOfWords; i++)
	    {
	        char[] word = new char[random.nextInt(1)+3]; // words of length 3 through 10. (1 and 2 letter words are boring.)
	        for(int j = 0; j < word.length; j++)
	        {
	            word[j] = (char)('a' + random.nextInt(26));
	        }
	        randomStrings[i] = new String(word);
	    }
	    return randomStrings;
	}
	
}
