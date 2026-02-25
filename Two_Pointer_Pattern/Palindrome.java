package Two_Pointer_Pattern;

// without using two pointer | (PCS) Comparision Searching Partitioning
public class Palindrome {
    public static void main(String[] args) {
        StringBuilder s=new StringBuilder("level");
        StringBuilder s_rev=s.reverse();
        
        if(s==s_rev){
            System.out.println(s+" is Palindrome");
        }else{
            System.out.println(s+" is Not Palindrome");
        }

    }
}
