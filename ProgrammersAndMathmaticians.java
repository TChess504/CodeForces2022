//https://codeforces.com/contest/1611/problem/B
import java.util.Scanner;

public class ProgrammersAndMathmaticians {
    public static void main(String args[]) {

        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        for(int i = 0; i < t; i++) {
            long a = scanner.nextInt();
            long b = scanner.nextInt();

            System.out.println( Math.min(a, Math.min(b, (a + b) / 4)));
        }
    }
}
