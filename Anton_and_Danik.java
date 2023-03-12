//https://codeforces.com/problemset/problem/734/A
import java.util.*;
public class Anton_and_Danik {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int n=input.nextInt();
        String s=input.next();
        int A=0;
        int D=0;
        for (int i = 0; i < s.length(); i++) {
        if(s.charAt(i)=='A')
             A++;
        else 
            D++;
        }
       if(A>D)
        System.out.println("Anton");
       else if(D>A)
        System.out.println("Danik");
       else
        System.out.println("Friendship");
        }
}
