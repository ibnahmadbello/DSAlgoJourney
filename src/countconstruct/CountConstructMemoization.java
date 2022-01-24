package countconstruct;

import java.util.HashMap;

public class CountConstructMemoization {
	public static void main(String args[]) {
		System.out.println(countConstruct("purple", new String[] {"purp", "p", "ur", "le", "purpl"}));
		System.out.println(countConstruct("abcdef", new String[] {"ab", "abc", "cd", "def", "abcd"}));
		System.out.println(countConstruct("skateboard", new String[] {"bo", "rd", "ate", "t", "ska", "sk", "boar"}));
		System.out.println(countConstruct("enterapotentpot", new String[] {"a", "p", "ent", "enter", "ot", "o", "t"}));
		System.out.println(countConstruct("eeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeef", new String[] {"e", "ee", "eee", "eeee", "eeeee", "eeeeee"}));
	}
	
	public static int countConstruct(String target, String[] wordbank) {
		return countConstruct(target, wordbank, new HashMap<>());
	}
	
	public static int countConstruct(String target, String[] wordbank, HashMap<String, Integer> memo) {
		if(memo.containsKey(target)) return memo.get(target);
		if(target == "") return 1;
		
		var totalCount = 0;
		
		for (String word : wordbank) {
			if(target.indexOf(word) == 0) {
				var numWayForRest = countConstruct(target.substring(word.length()), wordbank, memo);
				totalCount += numWayForRest;
//				memo.put(target, numWayForRest);
			}
		}
		memo.put(target, totalCount);
		return totalCount;
	}
}
