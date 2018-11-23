import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class CountSquares {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	    int T=Integer.parseInt(br.readLine());
	    while(T-->0) {
		String input=br.readLine();
		String[] inputArray=input.split(" ");
		int x1=Integer.parseInt(inputArray[0]);
		int y1=Integer.parseInt(inputArray[1]);
		int x2=Integer.parseInt(inputArray[2]);
		int y2=Integer.parseInt(inputArray[3]);
		int x3=Integer.parseInt(inputArray[4]);
		int y3=Integer.parseInt(inputArray[5]);
		int x4=Integer.parseInt(inputArray[6]);
		int y4=Integer.parseInt(inputArray[7]);
		System.out.println(isSquare(x1,y1,x2,y2,x3,y3,x4,y4));
	}
	}
	private static String isSquare(int x1, int y1, int x2, int y2, int x3, int y3, int x4, int y4) {
		double[] d=new double[6];
		d[0]=Math.sqrt(Math.pow(x1-x2, 2)+Math.pow(y2-y1, 2));
		d[1]=Math.sqrt(Math.pow(x2-x3, 2)+Math.pow(y2-y3, 2));
		d[2]=Math.sqrt(Math.pow(x3-x4, 2)+Math.pow(y3-y4, 2));
		d[3]=Math.sqrt(Math.pow(x1-x4, 2)+Math.pow(y4-y1, 2));
		//diagonal
		d[4]=Math.sqrt(Math.pow(x1-x3, 2)+Math.pow(y1-y3, 2));
		d[5]=Math.sqrt(Math.pow(x2-x4, 2)+Math.pow(y4-y2, 2));
	Arrays.sort(d);
		if(d[0]==d[1] && d[1]==d[2] && d[2]==d[3]  && d[3]==d[0] && d[4]!=0 && d[5]!=0 && d[4]==d[5])
			return "YES";
		else 
			return "NO";
	}

}
