import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class MigratingBirds {

	public static void main(String[] args) {
		System.out.println(migratoryBirds((List<Integer>) Arrays.asList(1, 2, 3 ,4 ,5 ,4 ,3 ,2 ,1 ,3, 4)));

	}static int migratoryBirds(List<Integer> arr) {
		TreeMap<Integer, Integer> map=new TreeMap<>();
		int max=Integer.MIN_VALUE;
		int min=Integer.MAX_VALUE;
		for(int i:arr) {
			if(map.containsKey(i)) {
				map.put(i, map.get(i)+1);
				max=Math.max(max, map.get(i));
				
			}else {
				map.put(i, 1);
				
			}
		}
		for(Map.Entry<Integer,Integer> e:map.entrySet()) {
			if(map.get(e.getKey())==max) {
				return e.getKey();
			}
		}
		return 0;


    }

}
