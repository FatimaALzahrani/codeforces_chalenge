//https://codeforces.com/problemset/problem/467/A
import java.util.*;
public class George_and_Accommodation {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        int n=in.nextInt();
        int re =0;
        for (int i = 0; i < n; i++) {
            int p=in.nextInt();
            int q=in.nextInt();
            if(p<q-1)
                re++;
        }
        System.out.println(re);
    }
    }
 