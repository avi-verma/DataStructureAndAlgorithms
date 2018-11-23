import java.util.Arrays;
import java.util.Scanner;

public class HourGlass {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int[][] array=new int[6][6];
		for(int i=0;i<6;i++) {
			for(int j=0;j<6;j++) {
				array[i][j]=sc.nextInt();
			}
		}
		int sum=Integer.MIN_VALUE;
		for(int i=0;i<4;i++) {
			for(int j=0;j<4;j++) {
				sum=Math.max(sum, array[i][j]+array[i][j+1]+array[i][j+2]+
						array[i+1][j+1]+
						array[i+2][j]+array[i+2][j+1]+array[i+2][j+2]);
			}
		}
         System.out.println(sum);
	}
}