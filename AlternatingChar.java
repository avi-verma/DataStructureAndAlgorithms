import java.util.Stack;

public class AlternatingChar {

	public static void main(String[] args) {
		System.out.println(alternatingCharacters("AAABBB"));
	}
	static int alternatingCharacters(String s) {
		Stack<Character> stack=new Stack<>();
		int current=1;
		int count=0;
		stack.push(s.charAt(0));
		while(current <s.length()) {
			if(stack.peek()!=s.charAt(current)) {
				stack.push(s.charAt(current));
			}else{
				count++;
			}
			current++;
		}
		return count;

    }

}
