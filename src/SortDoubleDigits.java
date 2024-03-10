
import java.util.Arrays;
public class SortDoubleDigits {

	 public static void main(String[] args) {
	        int[] array = {2, 1, 0, 2, 0, 1};
	        sortArray(array);
	        System.out.println(Arrays.toString(array));
	    }

	    public static void sortArray(int[] array) {
	        int[] count = new int[3];

	        for (int num : array) {
	            count[num]++;
	        }

	        int index = 0;
	        for (int i = 0; i < count.length; i++) {
	            for (int j = 0; j < count[i]; j++) {
	                array[index++] = i;
	            }
	        }
	    }

}






