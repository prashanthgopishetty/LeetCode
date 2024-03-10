
public class BinarySearchPrgm {

	public static void main(String[] args) {
		int[] a = new int[] {3,6,7,10,11,23,34,43,45,54};
		int key = 34;
		int result = binarySearchImpl(a, key);
		System.out.println(result);

	}

	private static int binarySearchImpl(int[] a, int key) {
		int low = 0;
		int high = a.length;
		
		while(low <=high) {
			int mid = (low+high)/2;
			if(a[mid] == key) {
				return mid;
			} else if(a[mid] > key) {
				high = mid-1;
			} else {
				low = mid+1;
			}
		}
		
		
		return -1;
	}

}
