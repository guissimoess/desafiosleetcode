public class PalindromeNumber {
    public static void main(String[] args) {
        System.out.println(isPalindrome(4040404));
    }

    public static boolean isPalindrome(int x) {
        int original = x;
        int invertido = 0;

        while (x > 0) {
            int digito = x % 10;
            invertido = invertido * 10 + digito;
            x = x / 10;
        }

        return original == invertido;
    }
}
