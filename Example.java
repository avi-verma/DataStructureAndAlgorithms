import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Example {
public static void main(String[] args) {
	try {
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int T=Integer.parseInt(br.readLine());
		for(int i=0;i<T;i++) {
			int n=Integer.parseInt(br.readLine());
			String[] horizaontal=new String[n];
			String[] vertical=new String[n];
 			String result="";
			for(int j=0;j<n;j++) {
				horizaontal[j]=br.readLine();
			}
			for(int l=0;l<n/2;l++) {
				if(!horizaontal[l].equals(horizaontal[n-l-1])) {
					break;
				}
				else
					result="Horizontal";
			}
			System.out.println(result);
		}
		
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
}
