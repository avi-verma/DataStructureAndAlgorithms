import java.util.Scanner;

public class DataTypes {

	public static void main(String[] args)  {
		   int i = 4;
	        double d = 4.0;
	        String s = "HackerRank ";
			
	        Scanner scan = new Scanner(System.in);
	        System.out.println(i+Integer.parseInt(scan.nextLine()));
	        System.out.println(d+Double.parseDouble(scan.nextLine()));
	        System.out.println(s+scan.nextLine());
	}

}
