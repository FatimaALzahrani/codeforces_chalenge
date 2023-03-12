//https://codeforces.com/problemset/problem/266/B
import java.util.Scanner;
public class Queue_at_the_School {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int size=input.nextInt();
        int x=input.nextInt();
        String s=input.next();
        String ss[]=s.split("");
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < ss.length-1; j++) {
                if(ss[j].equals("B") && ss[j+1].equals("G")){
                String tmp=ss[j];
                ss[j]=ss[j+1];
                ss[j+1]=tmp;
                j++;
                }
            }
        }
        System.out.println(String.join("", ss));
    }
}