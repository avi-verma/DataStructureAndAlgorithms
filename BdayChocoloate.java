import java.util.Arrays;
import java.util.List;

public class BdayChocoloate {

	public static void main(String[] args) {
	System.out.println(birthday((List<Integer>) Arrays.asList(1, 2, 1 ,3 ,2), 3, 2));

	}
	 static int birthday(List<Integer> s, int d, int m) {
		 int count=0;
		 for(int i=0;i<s.size()-m;i++) {
			 int sum=0;
			 for(int j=i;j<m+i;j++) {
				 sum+=s.get(j);
			 }
			 if(sum==d)
				 count++;
		 }
		 return count;
	    }
}
