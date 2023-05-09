//https://codeforces.com/contest/71/problem/A
import java.util.Scanner;

public class WayTooLongWords {
    public static void main(String args[]) {

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        for(int i = 0; i <= n; i++){
            String word = scanner.nextLine();
            if(word.length() > 10){

                int number = word.length()-2;
                System.out.println(word.substring(0,1) + number + word.substring(word.length()-1,word.length()) );

            }else{
                System.out.println(word);
            }


        }

    }

}
