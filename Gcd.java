import java.util.*;
public class Gcd{

// Recursive function to return gcd of a and b
    static int GCD(int a, int b)
    {
        // Everything divides 0 
        if (a == 0 || b == 0)
            return (a>b)?a:b;
 
        // base case
        if (a == b)
            return a;
 
        // a is greater
        if (a > b)
        return GCD(a%b, b);
    return GCD(a, b%a);
}
    
     public static void main(String []args){
        System.out.println("Enter two numbers to find GCD");
        Scanner sc = new Scanner(System.in);
        int m= sc.nextInt();
        int n = sc.nextInt();
        System.out.println(m+" "+n+"  :"+GCD(m,n));
     }
     
     
}
