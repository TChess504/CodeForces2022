//https://codeforces.com/contest/279/problem/B
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Books {
    public static void main(String args[]) {

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt(), t = scanner.nextInt();

       int[] books = new int[n+1];
       int low = 0;
       int max = 0;

        for(int i = 1; i <= n; i++){
            int b = scanner.nextInt();
            books[i] = books[i-1]+ b;
            if(books[i]-books[low]>t)
                low++;
            max = Math.max(max,i -  low );
        }


        System.out.println(max);
    }
}
