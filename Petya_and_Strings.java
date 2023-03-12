//https://codeforces.com/problemset/problem/112/A
import java.util.*;
public class Petya_and_Strings {
     public static void main(String[] args) {
          Scanner input=new Scanner(System.in);
          String s1=input.next().toLowerCase();
          String s2=input.next().toLowerCase();
          if(s1.compareTo(s2)==0)
            System.out.println("0");
          else if(s1.compareTo(s2)>0)
            System.out.println("1");
          else if(s1.compareTo(s2)<0)
            System.out.println("-1");
        }
}
