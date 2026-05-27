import java.util.Scanner;

class LeetCode680 {

    // Helper function to check palindrome
    public boolean palindromeHelper(int i, int j, String s) {

        while (i < j) {

            char left = s.charAt(i);
            char right = s.charAt(j);

            if (left != right) {
                return false;
            }

            i++;
            j--;
        }

        return true;
    }

    // Time Complexity: O(n)
    // Space Complexity: O(1)

    public boolean validPalindrome(String s) {

        int i = 0;
        int j = s.length() - 1;

        while (i < j) {

            char left = s.charAt(i);
            char right = s.charAt(j);

            // If characters are not equal
            if (left != right) {

                // Remove one character either from left or right
                return palindromeHelper(i + 1, j, s) ||
                       palindromeHelper(i, j - 1, s);
            }

            i++;
            j--;
        }

        return true;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        LeetCode680 obj = new LeetCode680();

        if (obj.validPalindrome(str)) {
            System.out.println("Valid Palindrome");
        } else {
            System.out.println("Not a Valid Palindrome");
        }

        sc.close();
    }
}