//https://codeforces.com/contest/282/submission/162379111
import java.util.Scanner;
public class Q1 {
        public static void main(String[] args) {
            Scanner in= new Scanner(System.in);
            int x=0;
            int n=in.nextInt();
            for (int i = 0; i <n; i++) {
            String s=in.next();
            if(s.equals("X++") || s.equals("++X")){
               x=++x;
            }else if(s.equals("X--") || s.equals("--X")){
            x=x-1;}
        }
            System.out.println(x);
    }
}