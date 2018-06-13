import java.util.*;
public class Palindrome{
    public static int isPalindrome(int A) {
        if(A<0)
            return 0;
        int orig = A;
        int rev = 0;
        while(A>0){
            int rem = A%10;
            rev = rev*10 +rem;
            A = A/10;
        }
        if(orig==rev)
            return 1;
        
        return 0;
    }


    
     public static void main(String []args){
        System.out.println("Enter two numbers to find GCD");
        Scanner sc = new Scanner(System.in);
        int m= sc.nextInt();
        int res = isPalindrome(m);
        
        if(res == 1)
            System.out.println(m+" is Palindrome");
        else
            System.out.println(m+" is not Palindrome");
     }
     
     
}
