import java.util.HashMap;
import java.util.Map;

public class MatchingPair {

	public static void main(String[] args) {
	System.out.println(sockMerchant(5,new int[] {10 ,20 ,20 ,10 ,10 ,30 ,50 ,10 ,20}));
		
	}
	  static int sockMerchant(int n, int[] ar) {
		  HashMap<Integer,Integer> map=new HashMap<>();
		for(int i:ar) {
			if(!map.isEmpty() && map.containsKey(i)) {
				map.put(i,map.get(i)+1);
			}
			else 
				map.put(i,1);
		}
		int count=0;
		for(Map.Entry<Integer,Integer> j:map.entrySet()) {
			count=count+j.getValue()/2;
			
		}
	     return count;   

	    }

}
