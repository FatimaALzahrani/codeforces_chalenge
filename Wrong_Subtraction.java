//https://codeforces.com/problemset/problem/977/A
import java.util.Scanner;
public class Wrong_Subtraction {
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int k=sc.nextInt();
    String t=""+n;
    for (int i = 0; i < k; i++) {
        if(t.charAt(t.length()-1)=='0'){
            t=t.substring(0,t.length()-1);
    }else{
         int f=Integer.parseInt(t)-1;
         t=""+f;
        }
    }
    System.out.println(Integer.parseInt(t));
}
}
