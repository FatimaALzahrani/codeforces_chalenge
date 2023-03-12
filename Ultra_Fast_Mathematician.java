//https://codeforces.com/problemset/problem/61/A
import java.util.*;
public class Ultra_Fast_Mathematician {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        //int n1=in.nextInt();
        //int n2=in.nextInt();
        String s1=in.next();//""+n1;
        String s2=in.next();//""+n2;
        String re="";
        for (int i = 0; i < s1.length(); i++) {
        if(s1.charAt(i)==s2.charAt(i))
            re+='0';
        else
            re+='1';
        }     
        System.out.println(re);
    }
    }