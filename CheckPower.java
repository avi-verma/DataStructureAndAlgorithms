import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CheckPower {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		   int T=Integer.parseInt(br.readLine());
		    while(T-->0) {
			String input=br.readLine();
			String[] inputArray=input.split(" ");
			int x1=Integer.parseInt(inputArray[0]);
			int y1=Integer.parseInt(inputArray[1]);
		System.out.println(isPowerOf(x1,y1));

	}
	}

	private static int isPowerOf(int i,int j) {
		
		while(j%i==0 && i!=1 && i!=0) {
			j=j/i;
		}
			if(j==1) {
			
			return 1;
		}
		else {
			
			return 0;
		}
	}

}
