
public class InsertPlace {

	public static void main(String[] args) {
		InsertPlace ip = new InsertPlace();
		int res = ip.execute(new int[] {1, 3,5,6,7,8},2);
		System.out.println(res);
		
	}
	public int execute(int[] arr, int target) {
		int start=0, end=arr.length;
		int ans= 0;
		
		while(start < end) {
			int mid = (end+start)/2;
			if(arr[mid]<target) {
				start = mid+1;
				ans = start;
			} else if(arr[mid] > target) {
				end= mid-1;
			} else {
				return mid;
			}
		}
		
		
		return ans;
	}

}
