import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Properties;
import java.util.stream.IntStream;

/**
 *
 * @author avinverm
 */
public class Test {
    public static void main(String... args) {
        List<Integer> a=Arrays.asList(1,1,2,2);
        		
        System.out.println(getMinimumUniqueSum(a));
}
    public static int getMinimumUniqueSum(List<Integer> arr) {
    	HashSet<Integer> set=new HashSet<>();
    	int m=Integer.MAX_VALUE;
        for(int i=0;i<arr.size();i++) {
        	m=arr.get(i);
        	if(set.isEmpty()) {
        		set.add(arr.get(i));
        	}
        	else {
        	if(set.contains(m)) {
        		m=m+1;
        		while(set.contains(m))
        			m=m+1;
        		set.add(m);
        	}
        	else {
        		set.add(arr.get(i));
        		
        	}
        	
        	
        }
        }
        int sum=0;
        for( int i : set) {
        	  sum += i;
        	}
    	
    	return sum;
        }
}