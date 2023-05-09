//https://codeforces.com/contest/750/problem/A
import java.util.Scanner;
public class NewYearAndHurry {
    public static void main(String args[]){
 
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt(), k = scanner.nextInt();
 
        int  time = 0, max = 0;
 
        for(int i = 1; i <= n; i++){
            time += 5 * i;
            if(time <= (240- k)){
 
                max +=1;
            }
        }
        System.out.println(max);
 
    }
}
