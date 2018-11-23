import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RansomNote {

	public static void main(String[] args) {
		
		System.out.println(checkMagazine(new String[] {"give", "me", "one", "today", "night"}, new String[] {"give","one", "grand", "today"}));
	}
	static String checkMagazine(String[] magazine, String[] note) {
		List mag=new ArrayList<>(Arrays.asList(magazine));
		
		for(String s:note) {
			if(!mag.contains(s)) {
				return "No";
			}else {
				mag.remove(mag.indexOf(s));
			}
		}
		return "Yes";

    }

}
