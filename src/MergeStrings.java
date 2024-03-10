
public class MergeStrings {

	public static void main(String[] args) {
		MergeStrings ms = new MergeStrings();
		String res = ms.mergeAlternately("ab", "pqrs");
		System.out.println(res);
	}
	
	public String mergeAlternately(String word1, String word2) {
        int counter =0;
        String res = "";
        while(counter < word1.length() && counter < word2.length()) {
            res = res+word1.charAt(counter)+word2.charAt(counter);
            counter++;
        }
        if(counter < word1.length()) {
            res = res+ word1.substring(counter);
        } if(counter < word2.length()) {
            res = res+word2.substring(counter);
        }
        return res;
    }

}
