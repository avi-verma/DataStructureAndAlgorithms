import java.util.HashSet;
import java.util.stream.Collectors;

public class TwoString {

	public static void main(String[] args) {
		System.out.println(twoString("hi","world"));

	}

	private static String twoString(String string, String string2) {
		HashSet<Character> ch=new HashSet<>(string2.chars().mapToObj(mapper->(char)mapper).collect(Collectors.toSet()));
		for(int i=0;i<string.length();i++) {
			if(ch.contains(string.charAt(i))){
				return "YES";
			}
		}
		return "NO";
	}

}
