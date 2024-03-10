import java.util.Arrays;
import java.util.stream.Collectors;

public class ZigzagConversion {

	public static void main(String[] args) {
		ZigzagConversion z = new ZigzagConversion();
		String result = z.convert("AB", 1);
		System.out.println(result);

	}

	public String convert(String s, int numRows) {
		String[] resultArr = new String[numRows];
		Arrays.fill(resultArr, "");
		boolean down = true;
		int counter = 0;
		for (int i = 0; i < s.length(); i++) {

			resultArr[counter] = resultArr[counter] + s.charAt(i);
			if (numRows > 1) {
				if (counter == 0)
					down = true;
				if (counter == numRows - 1)
					down = false;
				if (down) {
					counter++;
				} else {
					counter--;
				}
			}

		}
		
		return Arrays.stream(resultArr).collect(Collectors.joining());
	}

}
