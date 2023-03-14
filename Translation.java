//https://codeforces.com/problemset/problem/41/A
import java.util.*;
public class Translation {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        String s=input.next();
        String t=input.next();
        String r="";
        for (int i = s.length()-1; i >=0; i--) {
          r+=s.charAt(i);
                  }
        if(r.equals(t))
                    System.out.println("YES");
        else
                    System.out.println("NO");
            }
}
