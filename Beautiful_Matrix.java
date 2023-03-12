//https://codeforces.com/contest/263/problem/A
import java.util.*;
public class Beautiful_Matrix {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int row=0;
        int col=0;
        int Array[][]=new int[5][5];
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
            Array[i][j]=input.nextInt();
            if(Array[i][j]==1){
               row=i;
               col=j;
            }
            }
        }
        int re=0;
            for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
            if(row<2){
            row++;
            re++;
             }
            if(row>2){
            row--;
            re++;
             }
            if(col<2){
            col++;
            re++;
             }
            if(col>2){
            col--;
            re++;
             }
            }
        }
            System.out.println(re);
    }
}