public class PalindromeCheckerApp {
    interface PalindromeStrategy {
        boolean check(String word);
    }

    static class StackStrategy implements PalindromeStrategy {
        public boolean check(String word) {
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

    static class DequeStrategy implements PalindromeStrategy {
        public boolean check(String word) {
            java.util.Deque<Character> deque = new java.util.ArrayDeque<>();

            for (int i = 0; i < word.length(); i++) {
                deque.addLast(word.charAt(i));
            }

            while (deque.size() > 1) {
                if (deque.removeFirst() != deque.removeLast()) {
                    return false;
                }
            }

            return true;
        }
    }

    static class PalindromeContext {
        private PalindromeStrategy strategy;

        public PalindromeContext(PalindromeStrategy strategy) {
            this.strategy = strategy;
        }

        public boolean execute(String word) {
            return strategy.check(word);
        }
    }

    public static void main(String[] args) {

        String word = "madam";

        PalindromeContext context = new PalindromeContext(new StackStrategy());

        if (context.execute(word)) {
            System.out.println(word + " is a palindrome");
        } else {
            System.out.println(word + " is not a palindrome");
        }
    }
    }