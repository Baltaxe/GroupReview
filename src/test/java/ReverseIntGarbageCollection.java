public class ReverseIntGarbageCollection {

    public static void main(String[] args) {

        int number = 45238;
        String reverse2 = "";

        String num1 = String.valueOf(number);

        for (int i = num1.length() - 1; i >= 0; i--) {
            reverse2 += num1.charAt(i);
        }
        // aşağısı String sonuç verir.
        System.out.println(reverse2);
        System.out.println(reverse2+5);

        // Buradan aşağısı int olarak dönüşüm yapıldı.
        int a = Integer.parseInt(reverse2);
        System.out.println(a);
        System.out.print(a+5);
    }
}