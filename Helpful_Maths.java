//https://codeforces.com/problemset/problem/339/A
import java.util.*;
public class Helpful_Maths {
    public static void main(String[] args) {
          Scanner input=new Scanner(System.in);
          String tmp="";
          String re;
          String s1=input.next().toLowerCase();
          String []s=s1.split("");
            for (int i = 0; i < s.length; i++) {
                for (int j = 0; j < s.length; j++) {
                 if(s[i].equals("+"))
                     continue;
                 if(s[i].compareTo(s[j])<0){
                 tmp=s[i];
                 s[i]=s[j];
                 s[j]=tmp;
                 }
                     }
            }
            re=s[0];
            for (int i = 1; i < s.length; i++) {
                re+=s[i];
            }
            System.out.println(re);
        }
    }
