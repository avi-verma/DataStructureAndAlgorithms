import java.io.*;
import java.time.LocalDate;
import java.util.*;

public class DateEx {

    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
        int Da=sc.nextInt();
        int Ma=sc.nextInt();
        int Ya=sc.nextInt();
        int De=sc.nextInt();
        int Me=sc.nextInt();
        int Ye=sc.nextInt();
        int fine=0;
     LocalDate locale=LocalDate.of(Ya, Ma, Da);
     LocalDate locale1=LocalDate.of(Ye, Me, De);
     System.out.println(locale.getDayOfYear());
    }
}