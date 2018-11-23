import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PrimeNumber {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int T=Integer.parseInt(br.readLine());
		while(T-->0) {
			int num=Integer.parseInt(br.readLine());
			if(isPrime(num)){
				System.out.println("Prime");
			}
			else
				System.out.println("Not prime");
				
		}
	}

	private static boolean isPrime(int num) {
		if(num==1)
			return false;
		for(int i=2;i<=Math.sqrt(num);i++) {
			if(num%i==0) {
				return false;
			}
		}
		return true;
	}

}
