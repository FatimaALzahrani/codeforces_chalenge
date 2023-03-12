//https://codeforces.com/problemset/problem/617/A
import java.util.Scanner;
public class Elephant {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int n=input.nextInt();
        int re=0;
        while(n!=0){
        if(n-5>=0){
            re++;
            n-=5;
            continue;
        }else if(n-4>=0){
            re++;
            n-=4;
            continue;
        }else if(n-3>=0){
            re++;
            n-=3;
            continue;
        }else if(n-2>=0){
            re++;
            n-=2;
            continue;
        }else 
            re++;
            n--;
    }
                System.out.println(re);} 
}
