import java.util.Arrays;
import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {

        String str = "Wooden Spoon";
        String reverse = "";
        String reverse1 = "";

        for (int i = str.length() - 1; i >= 0; i--) {
            reverse += str.charAt(i);
            reverse1 += str.toCharArray()[i];
        }
        System.out.println(reverse);
        System.out.println(reverse1);
        System.out.println("-------------------------------");

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a word or sentence");
        String quote = scan.next();
        String reverse2 = "";

        for (int i = quote.length() - 1; i >= 0; i--) {
            reverse2 += quote.charAt(i);
        }
        System.out.println(reverse2);
        System.out.println("-------------------------------");
        int number = 52;
        if (number < 10 && number >= 0) {
            System.out.println(number);
        }

        int result = 0;
        while (number != 0) {
            result = result * 10 + number % 10;
            number /= 10;
        }
        System.out.println(result);

        System.out.println("-------------------------------");

        Scanner scan1 = new Scanner(System.in);
        System.out.println("Enter a number");
        int number1 = scan.nextInt();

        if (number1 < 10 && number1 >= 0) {
            System.out.println(number1);
        }

        int resultRev = 0;
        while (number1 != 0) {
            resultRev = resultRev * 10 + number1 % 10;
            number1 /= 10;
        }
        System.out.println(resultRev);

        System.out.println("-------------------------------");
        int[] numbers = {10, 20, 30, 40};
        //               0    1   2   3

        int[] reversed = new int[numbers.length];

        for (int i = numbers.length - 1, j = 0; i >= 0; i--, j++) {
            reversed[j] = numbers[i];
        }


        System.out.println(Arrays.toString(reversed));
    }
}
