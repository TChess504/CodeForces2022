// https://codeforces.com/contest/1566/problem/A
import java.util.Scanner;

public class MedianMaximization {
    public static void main(String[] args){

        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int i = 0; i < t; i++){
            int a = in.nextInt(), b = in.nextInt();
            int x = (a/2) + 1;
            System.out.println(b/x);

        }

    }
}