//https://codeforces.com/contest/263/problem/A
import java.util.Scanner;

public class BeautifulMatrix {
    public static void main(String[] args){

        Scanner in = new Scanner(System.in);

        int x = 0;
        int y = 0;
        for(int i = 1; i <= 5; i++ ){
            for(int j = 1; j <= 5; j++ ){
                int n = in.nextInt();
                if(n == 1){
                    x = i;
                    y = j;
                }

            }
        }

        int sum = Math.abs(3 - x) + Math.abs(3 - y);
        System.out.println(sum);

    }

}

