package Two_Pointer_Pattern;

// without using two pointer | (PCS) Comparision Searching Partitioning
public class Palindrome {
    public static void main(String[] args) {
        // StringBuilder s=new StringBuilder("level");
        // StringBuilder s_rev=s.reverse();
        String s = "leve";
        String s_rev = new StringBuilder(s).reverse().toString();
        int i = 0;

        while (i < s.length()) {

            if (s.charAt(i) != s_rev.charAt(i)) {
                System.out.println(s + " is Not Palindrome");
                return;
            }
            i += 1;
            System.out.println(s + " is Not Palindrome");
            break;

        }

    }
}
