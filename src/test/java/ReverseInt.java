public class ReverseInt {
    public static void main(String[] args) {
        int number = 152;

        if (number < 10 && number >= 0) {
            System.out.println(number);
        }

        int result = 0;
        while (number != 0) {
            result = result * 10 + number % 10;
            number /= 10;
        }
        System.out.println(result);
        // 152 >>> 251

    }
}
