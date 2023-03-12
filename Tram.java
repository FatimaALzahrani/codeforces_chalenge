//https://codeforces.com/problemset/problem/116/A
import java.util.*;
public class Tram {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int n=input.nextInt();
        int Ar1[]=new int[n];
        int Ar2[]=new int[n];
        int re[]=new int[n];
        for (int i = 0; i < n; i++) {
            Ar1[i]=input.nextInt();
            Ar2[i]=input.nextInt();
            if(i==0){
            re[i]=Ar2[i];
            }else{
            re[i]=re[i-1]-Ar1[i]+Ar2[i];}
        }
        int max=re[0];
        for (int i = 0; i < re.length; i++) {
            if(re[i]>max){   
                max=re[i];
            }
        }
        System.out.println(max);}
}