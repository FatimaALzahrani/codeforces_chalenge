import java.util.*;
public class Presents {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t=input.nextInt();
        int arr1[]=new int[t+1];
        int arr2[]=new int [t+1];
            for (int i = 1; i <= t; i++) {
            int user=input.nextInt();
            arr1[i]=user;
            arr2[arr1[i]]=i;
            }
        for (int i = 1; i < arr2.length; i++) {
            System.out.print(arr2[i]+" ");
        }
    }
}
