//https://codeforces.com/problemset/problem/236/A
import java.util.*;
public class Boy_or_Girl {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String s=input.next();
        HashMap<Character,Integer> m=new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            if(m.containsKey(s.charAt(i))){
            m.put(s.charAt(i), Integer.parseInt(""+m.get(s.charAt(i))));
            }
            else 
                m.put(s.charAt(i), 0);
        }
        int n=0;
        for (Map.Entry w : m.entrySet()) {
            if(Integer.parseInt(""+w.getValue())==0)
                n++;
        }
        if(n%2==0)
        System.out.println("CHAT WITH HER!");
        else
            System.out.println("IGNORE HIM!");
    }
}