//https://codeforces.com/contest/231/problem/A
import java.util.Scanner;

public class Team {
    public static void main(String args[]) {

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int answer = 0;

        for(int i = 0; i < n; i++){

            int sum = 0;
            for(int j = 0; j < 3; j++){

                int m = scanner.nextInt();
                sum += m;
            }
            if(sum > 1)
                answer++;


        }

        System.out.println(answer);

    }
}
