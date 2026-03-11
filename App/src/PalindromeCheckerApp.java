public class PalindromeCheckerApp {
    public static boolean reverseMethod(String word) {
        String reversed = "";
        for (int i = word.length() - 1; i >= 0; i--) {
            reversed = reversed + word.charAt(i);
        }
        return word.equals(reversed);
    }

    public static boolean twoPointerMethod(String word) {
        int start = 0;
        int end = word.length() - 1;

        while (start < end) {
            if (word.charAt(start) != word.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }

    public static boolean stackMethod(String word) {
        java.util.Stack<Character> stack = new java.util.Stack<>();

        for (int i = 0; i < word.length(); i++) {
            stack.push(word.charAt(i));
        }

        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) != stack.pop()) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {

        String word = "madam";

        long start1 = System.nanoTime();
        boolean result1 = reverseMethod(word);
        long end1 = System.nanoTime();

        long start2 = System.nanoTime();
        boolean result2 = twoPointerMethod(word);
        long end2 = System.nanoTime();

        long start3 = System.nanoTime();
        boolean result3 = stackMethod(word);
        long end3 = System.nanoTime();

        System.out.println("Reverse Method: " + result1 + " Time: " + (end1 - start1) + " ns");
        System.out.println("Two Pointer Method: " + result2 + " Time: " + (end2 - start2) + " ns");
        System.out.println("Stack Method: " + result3 + " Time: " + (end3 - start3) + " ns");
    }
    }