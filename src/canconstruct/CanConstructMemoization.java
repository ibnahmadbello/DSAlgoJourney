package canconstruct;

import java.util.HashMap;

public class CanConstructMemoization {
	public static void main(String args[]) {
		System.out.println(canConstruct("abcdef", new String[] {"ab", "abc", "cd", "def", "abcd"}));
		System.out.println(canConstruct("skateboard", new String[] {"bo", "rd", "ate", "t", "ska", "sk", "boar"}));
		System.out.println(canConstruct("enterapotentpot", new String[] {"a", "p", "ent", "enter", "ot", "o", "t"}));
		System.out.println(canConstruct("eeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeef", new String[] {"e", "ee", "eee", "eeee", "eeeee", "eeeeee"}));
	}
	
	private static boolean canConstruct(String target, String wordbank[]) {
		return canConstruct(target, wordbank, new HashMap<>());
	}

	private static boolean canConstruct(String target, String wordbank[], HashMap<String, Boolean> memo) {
		if(memo.containsKey(target)) return memo.get(target);
		if(target == "") return true;
		
		for (String word : wordbank) {
			if(target.indexOf(word) == 0) {
				var suffix = target.substring(word.length());
				if(canConstruct(suffix, wordbank, memo) == true) {
					memo.put(target, true);
					return true;
				}
			}
		}
		memo.put(target, false);
		return false;
	}
}
