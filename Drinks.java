//https://codeforces.com/problemset/problem/200/B
import java.util.Scanner;
public class Drinks {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        int n=in.nextInt();
        String r="";
        double sum=0;
        double num;
        for (int i = 0; i < n; i++) {
        int q=in.nextInt();
        sum+=q;
        }     
        num =sum/n;
        System.out.println(num);
    }
    }