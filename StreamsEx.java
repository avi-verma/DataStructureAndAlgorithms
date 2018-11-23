import java.util.stream.Stream;

public class StreamsEx {
	public static void main(String[] args) {
		//Stream.iterate(new BigInteger[] {BigInteger.ONE,BigInteger.ONE},e->new BigInteger[]{e[1],e[0].add(e[1])}).limit(1).forEach(e->System.out.println(e[0]));;
		Stream.iterate(1,a->a+1).filter(e->isPrimeNumber(e.intValue())).limit(100).forEach(System.out::println);
	}

	public static boolean isPrimeNumber(int number)
	{
		if (number == 2 || number == 3){ 
			return true; 
			} 
		if (number % 2 == 0) { 
			return false; 
			} 
		int sqrt = (int) Math.sqrt(number) + 1; 
		for (int i = 3; i < sqrt; i += 2) { 
			if (number % i == 0) {
				return false; 
				}
			} 
		return true; 
			}

}
