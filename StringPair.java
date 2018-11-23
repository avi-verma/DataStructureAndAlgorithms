import java.util.Scanner;

public class StringPair {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int T=Integer.parseInt(sc.nextLine());
		while(T-->0) {
		String a=sc.nextLine();
		for(int i=0;i<a.length();i=i+2)
		System.out.print(a.charAt(i));
		System.out.print(" ");
		for(int i=1;i<a.length();i=i+2)
			System.out.print(a.charAt(i));
	}
	}

}
