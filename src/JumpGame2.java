
public class JumpGame2 {

	public static void main(String[] args) {
		JumpGame2 j = new JumpGame2();
		int res = j.jump(new int[] { 1, 2 });
		System.out.println(res);

	}

	public int jump(int[] nums) {
	       int counter = 0;
	       int current_index=0;
	       boolean first = true;
	       while(current_index<nums.length-1) {
	    	  
	    	   current_index+= nums[current_index];
	    	   if(first) {
	    		   current_index = current_index-1;;
	    		   first = false;
	    	   }
	           
	           counter++;
	       }
	       return counter;
	    }

}
