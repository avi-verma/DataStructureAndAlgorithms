
public class JumpingOnClouds {

	public static void main(String[] args) {
		System.out.println(jumpingOnClouds(new int[] {0 ,0 ,0, 1 ,0 ,0}));

	}

	private static int jumpingOnClouds(int[] is) {
		int i=0;
		int count=0;
		while(i<is.length-1 )
		{
			if(i<is.length-2 && is[i+2]==0) {
				i=i+2;
				count+=1;
				System.out.println("two");
			}
			else if(is[i+1]==0) {
				i=i+1;
				count+=1;
				System.out.println("One");
			}
		}
		return count;
	}

}
