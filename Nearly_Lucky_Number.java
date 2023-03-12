//https://codeforces.com/problemset/problem/110/A
import java.util.Scanner;
public class Nearly_Lucky_Number {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        Long n=input.nextLong();
        String ts=""+n;
        int re=0;
        for (int i = 0; i < ts.length(); i++) {
         if(ts.charAt(i)=='4' || ts.charAt(i)=='7')
             re++;
    }
        if(re==4 || re==7)
                System.out.println("YES");
        else
                    System.out.println("NO");}
            
}