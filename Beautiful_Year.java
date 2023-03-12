//https://codeforces.com/problemset/problem/271/A
import java.util.*;
public class Beautiful_Year {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        String s=input.next();
        String r="";
        int te=0;
        Boolean f=false;
        int b=Integer.parseInt(s);
        String s2=""+b;
        while (f!=true){
         b++;
         s2=""+b;
        int count=0;
        String test=""+s2.charAt(0);
            for (int i = 0; i < s2.length(); i++) {
                count=0;
                for (int j = 0; j < s2.length(); j++){
               if(s2.charAt(i)==s2.charAt(j) && i!=j)
                count++;
            }
                if(count>0)
                    break;
                else if(count ==0)
                    test+=s2.charAt(i);
                 if(count==0 && i==s2.length()-1)
                    f=true;
            }
        }
                System.out.println(s2);
            }
}