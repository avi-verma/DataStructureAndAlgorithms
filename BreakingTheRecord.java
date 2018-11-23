import java.util.Arrays;

public class BreakingTheRecord {

	public static void main(String[] args) {
		
System.out.println(breakingRecords(new int[] {3, 4 ,21, 36, 10, 28, 35, 5 ,24 ,42}));
	}
	static int[] breakingRecords(int[] scores) {
		int min=scores[0];
		int max=scores[0];
		int[] result=new int[] {0,0};
		for(int i=1;i<scores.length;i++) {
			if(scores[i]>max) {
				result[0]++;
				max=scores[i];
			}else if(scores[i]<min) {
				result[1]++;
				min=scores[i];
			}
		}
	
return result;
    }
}
