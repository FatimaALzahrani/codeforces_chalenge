//https://codeforces.com/problemset/problem/469/A
import java.util.*;
public class I_Wanna_Be_the_Guy {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n=input.nextInt();
        int re=0;
        int ne[]=new int[(n*2)-1];
        String r="";
            int s1=input.nextInt();
            for (int j = 0; j < s1; j++) {
               int n1=input.nextInt();
               r+=n1;
            }
            int s2=input.nextInt();
            for (int j = 0; j < s2; j++) {
               int n2=input.nextInt();
               r+=n2;
            }
         for (int i = 1; i <= n; i++) {
           if(r.contains(""+i))
               re++;
        }
        if(re==n){
            System.out.println("I become the guy.");}
        else 
            System.out.println("Oh, my keyboard!");
    }
}