//
import java.util.*;
public class In_Search_of_an_Easy_Problem {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        int n=in.nextInt();
        String r="";
        for (int i = 0; i < n; i++) {
        int p=in.nextInt();
        r+=""+p;
        }
        if(r.contains("1")){
            System.out.println("HARD");}
        else
            System.out.println("EASY");
    }
}
