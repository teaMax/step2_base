package topic7_Methods.task8_PalindromeChecker;

public class PalindromeChecker {
    public static void main(String[] args) {
        String str1 = "palindrome";
        String str2 = "map Am";
        System.out.println(isPalindrome(str1));
        System.out.println(isPalindrome(str2));
    }

    public static boolean isPalindrome(String text) {
        String replaced = text.replaceAll(" ","").toLowerCase();
        String reversedString = new StringBuilder(replaced).reverse().toString();
        for(int i = 0; i < reversedString.length(); i++) {
            if(replaced.charAt(i) != reversedString.charAt(i)) {
                return false;
            }
        }
        return true;
    }
}
