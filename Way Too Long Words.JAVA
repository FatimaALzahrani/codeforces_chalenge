//https://codeforces.com/problemset/problem/71/A
import java.util.Scanner;
public class standard {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int n=input.nextInt();
        for (int i = 0; i < n; i++) {
        String W=input.next();
       if(W.length()>10){
           int f=W.length()-2;
       System.out.println(W.charAt(0)+""+f+""+W.charAt(W.length()-1));
       }else
            System.out.println(W);
    }
    }
}