import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        String str = "Wooden Spoon";
        String reverse = "";
        String reverse1 = "";


        for (int i = str.length() - 1; i >= 0; i--) {
            reverse += str.charAt(i);
            reverse1 += str.toCharArray()[i];
        }

        System.out.println("-----------------------------------------");

        Scanner scan = new Scanner(System.in);
        System.out.println("Ekrana metni girin");
        String word = scan.nextLine();
        String reverse2 = "";

        for (int i = word.length()-1; i >=0 ; i--) {
            reverse2 += word.charAt(i);
        }
        System.out.println(reverse2);
    }


}
