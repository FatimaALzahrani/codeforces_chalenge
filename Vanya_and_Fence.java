//https://codeforces.com/problemset/problem/677/A
import java.util.*;
public class Vanya_and_Fence {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int n=input.nextInt();
        int t=input.nextInt();
        int re=0;
        for (int i = 0; i < n; i++) {
        int s=input.nextInt();
        if(s<=t)
            re++;
        else re+=2;
        }
                System.out.println(re);
   }
}
