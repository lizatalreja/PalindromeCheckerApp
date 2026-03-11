public class PalindromeCheckerApp {
    static class PalindromeChecker {

        public boolean checkPalindrome(String word) {

            java.util.Stack<Character> stack = new java.util.Stack<>();

            for (int i = 0; i < word.length(); i++) {
                stack.push(word.charAt(i));
            }

            String reversed = "";

            while (!stack.isEmpty()) {
                reversed = reversed + stack.pop();
            }

            return word.equals(reversed);
        }
    }

    public static void main(String[] args) {

        String word = "madam";

        PalindromeChecker checker = new PalindromeChecker();

        if (checker.checkPalindrome(word)) {
            System.out.println(word + " is a palindrome");
        } else {
            System.out.println(word + " is not a palindrome");
        }
    }
    }