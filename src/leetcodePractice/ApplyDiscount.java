package leetcodePractice;

public class ApplyDiscount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(discountPrices("there are $1 $2 abs 5$ candies in the shop", 50));

	}

	public static String discountPrices(String sentence, int discount) {
		String[] words = sentence.split(" "); // T = O(n) where n = sentenceLen
		StringBuffer buff = new StringBuffer();
		int wordsLength = words.length;
		// O(n) * O(m) => O(nm), where n = sentenceLen, m = maxWordLength
		for(int i = 0; i < wordsLength; i++) {
			String word = words[i]; // O(1)
			//"$1000"
			char f = word.charAt(0);
			if (f != '$') {
				append(buff, word, i == wordsLength - 1); // O(m)
				continue;
			}
			if (word.length() < 2) {
				append(buff, word, i == wordsLength - 1);
				continue;
			}
			int index = 1;
			int count = 0;
			boolean shouldContinue = false;
			
			// "$10$"
			while(index < word.length()) { // 10 * O(m) ==> O(10m) => O(m)
				char curr = word.charAt(index);
				if (curr <'0' || curr > '9') {
					append(buff, word, i == wordsLength - 1); //O(m)
					shouldContinue = true;
					break; // exits the first while
				}
				index++;
			}
			if(shouldContinue) {
				continue;
			}
			Double price = Double.parseDouble(word.substring(1)); // O(m)
			Double disc = Double.valueOf(discount) / 100.0; // O(1)
			Double newPrice = price - (disc * price);
			String newPriceStr = String.format("%.2f", newPrice); // O(m)
			append(buff, "$"+newPriceStr, i == wordsLength - 1); //O(m)
		}
		return buff.toString();
	}
	
	private static void append(StringBuffer buff, String word, boolean lastChar) {
		if(lastChar) {
			buff.append(word);
		} else {
			buff.append(word + " ");
		}
	}
	
}
