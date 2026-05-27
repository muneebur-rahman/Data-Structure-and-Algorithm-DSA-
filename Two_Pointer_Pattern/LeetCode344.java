import java.util.Scanner;

class LeetCode344{

    public void reverseString(char[] s) {

        int i = 0;
        int j = s.length - 1;

        while (i < j) {

            char temp = s[i];
            s[i] = s[j];
            s[j] = temp;

            i++;
            j--;
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        // Convert string to character array
        char[] arr = str.toCharArray();

        LeetCode344 obj = new LeetCode344();

        // Call reverse function
        obj.reverseString(arr);

        // Convert character array back to string
        String reversed = new String(arr);

        System.out.println("Reversed String: " + reversed);

        sc.close();
    }
}