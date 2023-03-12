//https://codeforces.com/problemset/problem/4/A
import java.util.Scanner;
public class standard {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int W=input.nextInt();
        int y=W/2;
        int x=W-y;
        if(W%2==0 && W!=2){
            System.out.println("YES");
        }else if(y!=0 && x%2==0 && y%2==0){
        System.out.println("YES");
    }else 
        System.out.println("NO");
    }
}

