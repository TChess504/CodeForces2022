//https://codeforces.com/contest/282/problem/A
import java.util.Scanner;

public class BitPlusPlus {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int sum = 0;

        for(int i = 0; i < n; i++){
            String line = scanner.next();
            if(line.equals("X++") || line.equals("++X"))
                sum++;
            if(line.equals("X--") || line.equalsIgnoreCase("--X"))
                sum--;

        }

        System.out.println(sum);
    }
}
