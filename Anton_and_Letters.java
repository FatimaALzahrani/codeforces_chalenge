//https://codeforces.com/problemset/problem/443/A
import java.util.Scanner;
public class Anton_and_Letters {
    public static void main(String[] args) {
      Scanner input=new Scanner(System.in);
      String s =input.nextLine();
      String s2=s.substring(1,s.length()-1);
      String AS[]=s2.split(", ");
      int n=0;
      int re=0;
      int f=0;
      String A[]=new String[AS.length];
        for (int i = 0; i < A.length; i++) {
            A[i]=" ";
        }
        for (int i = 0; i < AS.length; i++) {
            n=0;
            for (int j = 0; j < AS.length; j++) {
                if(AS[i].equals(A[j]) )
                    n++;
            }
            if(n<1){ re++; A[f]=AS[i];f++;}
        }
              if(s2.length()<=1){
            re=s2.length();
      }
        System.out.println(re);
    }
}