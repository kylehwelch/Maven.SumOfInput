import java.util.Scanner;

/**
 * Created by iyasuwatts on 10/17/17.
 */
public class Main {

    public static void main(String[] args){

        System.out.println("Enter a number, any number. I will add all of the numbers from 1 up to your number!");

        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();

        int sum = 0;
        int x = 0;
        while (x <= n) {
            sum += x;
            x++;
        }

        System.out.println(sum);

    }
}
