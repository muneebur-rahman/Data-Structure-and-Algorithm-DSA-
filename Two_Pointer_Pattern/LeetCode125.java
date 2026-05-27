import java.util.Scanner;

// T: O(n)
// S: O(1)
class LeetCode125 {

    public boolean isPalindrome(String s) {
        int i = 0;
        int j = s.length() - 1;

        while (i < j) {

            char left = s.charAt(i);
            char right = s.charAt(j);

            // Ignore non-alphanumeric characters from left side
            if (!Character.isLetterOrDigit(left)) {
                i++;
                continue;
            }

            // Ignore non-alphanumeric characters from right side
            if (!Character.isLetterOrDigit(right)) {
                j--;
                continue;
            }

            // Compare characters ignoring case
            if (Character.toLowerCase(left) != Character.toLowerCase(right)) {
                return false;
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

        LeetCode125 obj = new LeetCode125();

        if (obj.isPalindrome(str)) {
            System.out.println("The string "+str+" is a Palindrome");
        } else {
            System.out.println("The string "+str+" is NOT a Palindrome");
        }

        sc.close();
    }
}