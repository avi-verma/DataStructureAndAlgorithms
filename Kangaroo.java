
public class Kangaroo {

	public static void main(String[] args) {
		System.out.println(kangaroo(1571 ,4240 ,9023 ,4234));

	}
	 static String kangaroo(int x1, int v1, int x2, int v2) {
		 
		 for(int i=0;i<10000;i++) {
			 x1+=v1;
			 x2+=v2;
			 if(x1==x2)
				 return "YES";
		 }
		 return "NO";
	    }

}
