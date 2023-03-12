//https://codeforces.com/problemset/problem/59/A
import java.util.*;
public class Word {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        int upper=0;
        int lower=0;
        String re;
        for (int i = 0; i < s.length(); i++) {
        if(Character.isLowerCase(s.charAt(i)))
            lower++;
        else upper++;
            }
        if(upper>lower)
            re=s.toUpperCase();
        else re=s.toLowerCase();
        System.out.println(re);
    }
}