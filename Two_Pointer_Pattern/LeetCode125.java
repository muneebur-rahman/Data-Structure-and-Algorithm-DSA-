import java.util.Scanner;

public class LeetCode125 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String s;
        s=sc.nextLine();

        int i=0,j=s.length()-1;

        while(i<j){
            char right=s.charAt(i);
            char left=s.charAt(j);

            if(!Character.isLetterOrDigit(right)){
                i+=1;
                continue;
            }

            if(!Character.isLetterOrDigit(left)){
                left-=1;
                continue;
            }

            if(Character.toLowerCase(right)!=Character.toLowerCase(left)){
                System.out.println("Not Palindrome");
            }
            i++;
            j--;
        }
        System.out.println("Palindrome");

        sc.close();
    }
}
