
public class BeautifulDays {

	public static void main(String[] args) {
		System.out.println(beautifulDays(20, 23, 6));

	}
	   static int beautifulDays(int i, int j, int k) {
		   int count=0;
	        for(int x=i;x<=j;x++){
	            String s=String.valueOf(x);
	            StringBuilder str=new StringBuilder(s);
	            str.reverse();
	            int diff=x-Integer.parseInt(str.toString());
	            if(diff%k==0) {
	            	count++;
	            }
	        }
			return count;

	    }

}
