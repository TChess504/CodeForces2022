//https://codeforces.com/contest/158/problem/A
import java.util.Scanner;

public class NextRound {
    public static void main(String args[]){

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();

        int arr[] = new int[n];

        int sum = 0;


        for(int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }

        int num = arr[k-1];



        for(int i = 0; i <arr.length ; i++){
            if(arr[i] > 0)
            if(arr[i] >= num )
                sum++;
        }



        System.out.println(sum);

    }

}
