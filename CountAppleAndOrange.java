import java.util.Arrays;

public class CountAppleAndOrange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
countApplesAndOranges(7, 11, 5, 15, new int[] {-2, 2 ,1}, new int[] {5, -6});
	}
	static void countApplesAndOranges(int s, int t, int a, int b, int[] apples, int[] oranges) {
		System.out.println(Arrays.stream(apples).map(mapper->mapper+a).filter(predicate->predicate>=s
				&&predicate<=t).count());
		System.out.println(Arrays.stream(oranges).map(mapper->mapper+b).filter(predicate->predicate>=s
				&&predicate<=t).count());

    }

}
