package canconstruct;

public class CanConstruct {
	public static void main(String args[]) {
		System.out.println(canConstruct("abcdef", new String[] {"ab", "abc", "cd", "def", "abcd"}));
		System.out.println(canConstruct("skateboard", new String[] {"bo", "rd", "ate", "t", "ska", "sk", "boar"}));
		System.out.println(canConstruct("enterapotentpot", new String[] {"a", "p", "ent", "enter", "ot", "o", "t"}));
		System.out.println(canConstruct("eeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeef", new String[] {"e", "ee", "eee", "eeee", "eeeee", "eeeeee"}));
	}

	private static boolean canConstruct(String target, String wordbank[]) {
		if(target == "") return true;
//		if(targetWord < 0) return false;
		
		for (String word : wordbank) {
			if(target.indexOf(word) == 0) {
				var suffix = target.substring(word.length());
				if(canConstruct(suffix, wordbank) == true) {
					return true;
				}
			}
		}
		return false;
	}
}



