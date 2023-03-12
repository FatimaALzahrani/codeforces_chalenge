//https://codeforces.com/contest/158/submission/162657770
import java.util.Scanner;
public class Next_Round {
    public static void main(String[] args) {
      Scanner input=new Scanner(System.in);
      int n =input.nextInt();
      int k=input.nextInt();
      int Arr[]=new int[n];
      int f=0;
        for (int i = 0; i < n; i++) {
            int t=input.nextInt();
         Arr[i]=t;
        }
        int r=0;
        for (int i = 0; i < Arr.length; i++) {
         if(Arr[k-1]==0 && Arr[i]==0)
         r++;
         else if(Arr[i]>=Arr[k-1])
             f++;
        }
        if(r==Arr.length)
            f=0;
        System.out.println(f);
    }
}