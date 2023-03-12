//https://codeforces.com/problemset/problem/791/A
import java.util.Scanner;
public class Bear_and_Big_Brother {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int s =input.nextInt();
        int b=input.nextInt();
        int n=0;
          while (s<=b) {
              s=s*3;
              b=b*2;
              n++;
          }
                          System.out.println(n);
   
      }  
}
