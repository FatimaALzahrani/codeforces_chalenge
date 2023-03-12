//https://codeforces.com/problemset/problem/705/A
import java.util.*;;
public class Hulk {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int T=input.nextInt();
        for (int i = 1; i <=T; i++) {
        if(T-i==0){
        if(i%2==0){
            System.out.print("I love it ");
        }else
                System.out.print("I hate it ");
        }else{
            if(i%2==0){
            System.out.print("I love that ");
        }else
                System.out.print("I hate that ");
        }
                }
    }
}