import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AliHelping {

	public static void main(String[] args) throws IOException {
		BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
		String tag=br.readLine();
		
	if(tag.charAt(2)!='A' && tag.charAt(2)!='E' && tag.charAt(2)!='I' &&
				tag.charAt(2)!='O' &&
				tag.charAt(2)!='U' &&
				tag.charAt(2)!='Y'
				) {
			if((Integer.parseInt(String.valueOf(tag.charAt(0))) +Integer.parseInt(String.valueOf(tag.charAt(1))))%2==0 &&
					(Integer.parseInt(String.valueOf(tag.charAt(1))) +Integer.parseInt(String.valueOf(tag.charAt(3))))%2==0 &&
					(Integer.parseInt(String.valueOf(tag.charAt(3))) +Integer.parseInt(String.valueOf(tag.charAt(4))))%2==0 &&
					(Integer.parseInt(String.valueOf(tag.charAt(4))) +Integer.parseInt(String.valueOf(tag.charAt(5))))%2==0 &&
					(Integer.parseInt(String.valueOf(tag.charAt(5))) +Integer.parseInt(String.valueOf(tag.charAt(7))))%2==0 &&
					(Integer.parseInt(String.valueOf(tag.charAt(7))) +Integer.parseInt(String.valueOf(tag.charAt(8))))%2==0) {
				System.out.println("Valid");
			}
			else 
				System.out.println("Invalid");
			
			
		}
		else {
			System.out.println("Invalid");
		}

	}

}
