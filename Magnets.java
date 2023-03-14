//https://codeforces.com/problemset/problem/344/A
import java.util.Scanner;
public class Magnets {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        int n=in.nextInt();
        String r="";
        int num=0;
        for (int i = 0; i < n; i++) {
        String p=in.next();
        if(!p.equals(r)){
            r=p;
            num++;
        }
        }        
        System.out.println(num);
    }
    }