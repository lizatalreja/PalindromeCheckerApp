public class PalindromeCheckerApp {
    public static void main(String[] args) {

        String word = "Madam In Eden Im Adam";

        String normalized = word.replaceAll("\\s+", "").toLowerCase();

        int start = 0;
        int end = normalized.length() - 1;
        boolean isPalindrome = true;

        while (start < end) {
            if (normalized.charAt(start) != normalized.charAt(end)) {
                isPalindrome = false;
                break;
            }
            start++;
            end--;
        }

        if (isPalindrome) {
            System.out.println("\"" + word + "\" is a palindrome");
        } else {
            System.out.println("\"" + word + "\" is not a palindrome");
        }
    }
    }