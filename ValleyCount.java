
public class ValleyCount {

	public static void main(String[] args) {
		System.out.println(valleyCount(8,"UDDDUDUU"));

	}

	private static int valleyCount(int i, String string) {
		int temp=0;
		int count=0;
		for(int j=0;j<i;j++) {
			if(string.charAt(j)=='U') {
				temp+=1;
			if(temp==0) {
				count+=1;
			}
			}
			else {
				temp-=1;
				
			}
			
		}
		return count;
	}

}
