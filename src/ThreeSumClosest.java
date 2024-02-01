
public class ThreeSumClosest {

	public static void main(String[] args) {
		int res =threeSumClosest1(new int[] {-1,2,1,4}, 1);
		System.out.println(res);
	}
	
	public static int threeSumClosest1(int[] nums, int target) {
        int closest = -1;
        int sumVal=0;
        for(int i=0; i< nums.length-2;i++) {
            for(int j=i+1; j< nums.length-1;j++){
                for(int k=j+1 ;k< nums.length;k++) {
                    int sum = nums[i]+nums[j]+nums[k];
                    if(closest == -1){
                        closest = Math.abs(sum-target);
                        sumVal = sum;
                    } else {
                    	if(Math.abs(sum-target) < closest) {
                    		closest = Math.abs(sum-target);
                    		sumVal = sum;
                    	}
                        
                    }
                }
            }
        }
        return sumVal;

        
    }

}
