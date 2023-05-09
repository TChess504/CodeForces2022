//https://codeforces.com/contest/4/problem/A
import java.util.Scanner;

public class Watermelon {
    public static void main(String args[]) {

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        if(n > 2) {
            if (n % 2 == 0)
                System.out.println("YES");
            else
                System.out.println("NO");
        }else{
            System.out.println("NO");
        }
    }
}
