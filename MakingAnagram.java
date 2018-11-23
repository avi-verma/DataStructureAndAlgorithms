import java.util.*;


public class MakingAnagram {
    public static int numberNeeded(String first, String second) {
        int[] charSet = new int[26];
        
        for(int i=0; i<first.length(); i++)
            charSet[first.charAt(i)-'a']++;
        
        for(int i=0; i<second.length(); i++)
            charSet[second.charAt(i)-'a']--;
        
     
        int numberNeeded = 0;
        for(int i=0; i<26; i++)
            numberNeeded += Math.abs(charSet[i]);
        
        return numberNeeded;
     }
  
    public static void main(String[] args) {
   	
        Scanner in = new Scanner(System.in);
        String first = in.next();
        String second = in.next();
        System.out.println(numberNeeded(first, second));
    }
}