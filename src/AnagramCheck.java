import java.util.Arrays;

public class AnagramCheck {

	public static void main(String[] args) {
		String str1 = "ab c";
		String str2 = "bcaaas";
		
		str1 = str1.replaceAll("\\s", "");
		str2 = str2.replaceAll("\\s", "");
		if (str1.length() != str2.length()) {
			System.out.println("not anagram");
		}
		
		char[] str1Char =str1.toCharArray();
		char[] str2Char = str2.toCharArray();
		
		Arrays.sort(str1Char);
		Arrays.sort(str2Char);
		
		if(Arrays.equals(str1Char, str2Char)) {
			System.out.println("anagram");
		} else {
			System.out.println("not anagram");
		}
		

	}

}
