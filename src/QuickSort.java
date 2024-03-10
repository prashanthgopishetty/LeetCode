import java.util.Arrays;

public class QuickSort {

	public static void main(String[] args) {
		int[] arr = new int[] {10,9,4,12,18,13};
		int low =0;
		int high = arr.length-1;
		quicksort(arr, low, high);
		Arrays.stream(arr).forEach(System.out::println);
	}

	public static void quicksort(int[] arr, int low, int high) {
		if(low < high) {	
			int paritionIndex = paritition(arr, low, high);
			quicksort(arr, low, paritionIndex-1);
			quicksort(arr, paritionIndex+1, high);
		}
		
		
		
	}

	public static int paritition(int[] arr, int low, int high) {
		int pivot = arr[low];
		int i = low;
		int j = high;

		while (i < j) {
			while (i < high && arr[i] <= pivot) {
                i++;
            }
            while (j > low && arr[j] > pivot) {
                j--;
            }
			if (i < j) {
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}
		}

		int temp = arr[j];
		arr[j] = arr[low];
		arr[low] = temp;

		return j;
	}

}
