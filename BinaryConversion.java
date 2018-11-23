
public class BinaryConversion {

	public static void main(String[] args) {
		int n=5;
		StringBuilder builder=new StringBuilder("");
		int max=0;
		int count=0;
		
		while(n>0) {
			if(n%2==1) {
				count++;
				max=Math.max(count, max);
			}
			else {

				count=0;
			}
			builder.append(n%2);
			n=n/2;
		}
		System.out.println(max);
		
	}

}
