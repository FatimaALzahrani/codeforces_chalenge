//https://codeforces.com/problemset/problem/546/A
import java.util.*;;
public class Soldier_and_Bananas {
        public static void main(String[] args) {
          Scanner input=new Scanner(System.in);
          int k =input.nextInt();
          int n=input.nextInt();
          int w=input.nextInt();
          int sum=0;
            for (int i = 1; i < w+1; i++) {
                sum+=i*k;
            }
            int re=sum-n;
            if(re<=0)
                re=0;
            System.out.println(re);
        }
}
