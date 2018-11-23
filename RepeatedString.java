
public class RepeatedString {

	public static void main(String[] args) {
		
		System.out.println(repeatedString("aba",10l));

	}

	private static long repeatedString(String string, long i) {
		int temp=0;
		for(int l=0;l<string.length();l++) {
			if(string.charAt(l)=='a') {
				temp+=1;
			}
		}
		long count=(i/string.length())*temp;;
		long m=i%string.length();
		for(int f=0;f<m;f++) {
			if(string.charAt(f)=='a') {
				count+=1;
			}
		}
		return count;
	}

}
