//https://codeforces.com/problemset/problem/281/A
import java.util.*;;
public class Word_Capitalization {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        String s =input.next();
        String c=""+s.charAt(0);
        if(!c.equals(c.toUpperCase()))
        s=c.toUpperCase()+s.substring(1);
          System.out.println(s);
      }
  }