//https://codeforces.com/problemset/problem/50/A
import java.util.Scanner;;
public class Domino_piling {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int N=input.nextInt();
        int M=input.nextInt();
        int b=N*M;
        System.out.println(b/2);
    }
}