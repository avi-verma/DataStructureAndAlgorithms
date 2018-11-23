import java.util.Arrays;
import java.util.Stack;

public class SpecialPalindrome {

	public static void main(String[] args) {
		System.out.println(substrCount(4, "aaaa"));

	}
	 static long substrCount(int n, String s) {
		 int count=0;
       for(int i=0;i<n;i++) {
    	   for(int j=i;j<n;j++) {
    			   StringBuilder builder=new StringBuilder(s.substring(i,j+1 ));
    			  if(isPalindrome(builder)) {
    			   count++;
    			  }
    		   }
    		   
    	   }
		 
		 
		 return count;

	    }
	 static boolean isPalindrome(StringBuilder str) {
		
	if(str.length()%2==0) {
		 char[] arr=str.toString().toCharArray();
		 Arrays.sort(arr);
		
		return arr[0]==arr[arr.length-1];
	}
		else {
			if(str.length()==1) {
			return true;
		}else{
			
		str.deleteCharAt(str.length()/2);
		char[] arr=str.toString().toCharArray();
		 Arrays.sort(arr);
		
		return arr[0]==arr[arr.length-1];}
	}
	 }

}
