//https://codeforces.com/problemset/problem/266/A
import java.util.Scanner;
public class Stones_on_the_Table {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int num =input.nextInt();
        String s=input.next();
        int n=0;
          for (int i = 0; i < s.length()-1; i++) {
           if(s.charAt(i)==s.charAt(i+1))
           n++;
          }
         System.out.println(n);
   
      }
  }