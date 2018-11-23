import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.regex.*;

public class RegEx {



    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int N = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        List<String> list=new ArrayList<>();
        for (int NItr = 0; NItr < N; NItr++) {
            String[] firstNameEmailID = scanner.nextLine().split(" ");

            String firstName = firstNameEmailID[0];

            String emailID = firstNameEmailID[1];
            if(Pattern.matches("[a-zA-Z0-9.]*@gmail.com",emailID)){
                list.add(firstName);
            }
        }
        Collections.sort(list);
        for(String s:list){
            System.out.println(s);
        }

        scanner.close();
    }
}