import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class NegativeSubarray {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
		int T=Integer.parseInt(reader.readLine());
		String[] array=reader.readLine().split(" ");
		int count=0;
		int[] arr=Arrays.stream(array).mapToInt(mapper->Integer.parseInt(mapper)).toArray();
		for(int i=0;i<T;i++) {
			for(int j=i;j<T;j++) {
				int sum=0;
				for(int k=i;k<=j;k++) {
					sum+=arr[k];
				}
				if(sum<0) {
					count++;
				}
			}
		}
		System.out.println(count);
	}

}
