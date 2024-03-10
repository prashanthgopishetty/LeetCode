import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SwapNumbers {

	public static void main(String[] args) {
		int res = swap(Arrays.asList(10,4,3,2,5));  //2,3,4,5,10
		System.out.println(res);
	}
	
	static int swap(List ip) {
		int result = 0;
		
		if(ip.size() <=1) {
			return 0;
		}
		
		List sList = (List) ip.stream().sorted().collect(Collectors.toList());
		
		
		for(int i=0;i<ip.size(); i++) {
			if(ip.get(i) != sList.get(i)) {
				for(int j=i+1 ;j<ip.size(); j++) {
					if(sList.get(i) == ip.get(j)) {
						int temp = (int) ip.get(i);
						ip.set(i, ip.get(j));
						ip.set(j,  temp);
						result++;
					}
				}
			}
		}
		
		
		
		return result;
		
	}
	

}
