package allconstruct;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class AllConstructMemoization {
	public static void main(String args[]) {
		System.out.println(allConstruct("purple", new String[] {"purp", "p", "ur", "le", "purpl"}));
		System.out.println(allConstruct("abcdef", new String[] {"ab", "abc", "cd", "def", "abcd", "ef", "c"}));
		System.out.println(allConstruct("skateboard", new String[] {"bo", "rd", "ate", "t", "ska", "sk", "boar"}));
		System.out.println(allConstruct("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaz", new String[] {"a", "aa", "aaa", "aaaa", "aaaaa"}));
	}
	
	public static List<List<String>> allConstruct(String target, String[] wordbank){
		return allConstruct(target, wordbank, new HashMap<>());
	}
	
	public static List<List<String>> allConstruct(String target, String[] wordbank, HashMap<String, List<List<String>>> memo){
		if(memo.containsKey(target)) return memo.get(target);
		if(target == "") return new ArrayList<>(Arrays.asList(new ArrayList<>()));
		
		List<List<String>> result = new ArrayList<>();
		
		for (String word : wordbank) {
			if(target.indexOf(word) == 0) {
				var suffix = target.substring(word.length());
				var suffixWays = allConstruct(suffix, wordbank, memo);
				List<List<String>> targetWays = new ArrayList<>();
				
				for(int i =0; i <suffixWays.size(); i++) {
					var temp = new ArrayList<>(suffixWays.get(i));
					temp.add(word);
					targetWays.add(temp);
				}
				
				for(int i =0; i < targetWays.size(); i++) {
					result.add(new ArrayList<>(targetWays.get(i)));
				}
			}
		}
		memo.put(target, result);
		return result;
	}
}
