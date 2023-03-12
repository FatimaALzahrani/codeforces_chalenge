//https://codeforces.com/problemset/problem/231/A
import java.util.Scanner;
public class Team {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int n=input.nextInt();
        int b=0;
        int re=0;
        for (int i = 0; i < n; i++) {
            b=0;
            for (int j = 0; j <3; j++) {
            int k=input.nextInt();
            if(k==1){
            b++;
            }
            }
            if(b>=2){
            re++;
            }
    }
        System.out.println(re);
    }
}
