import java.util.*;
public class Reverse {
    public static int reverse(int A) {
        int sign=1;
        if(A<0){
            sign = -1;
            A = A* sign;
        }
        long rev = 0;
        while(A>0)
        {
            int rem = A%10;
            rev = rev*10 + rem;
            A = A/10;
        }
         if (rev > Integer.MAX_VALUE || rev < Integer.MIN_VALUE)
            return 0;
        else    
            return (int)rev * sign;
    }

    


    
     public static void main(String []args){
        System.out.println("Enter a number to find tits reverse");
        Scanner sc = new Scanner(System.in);
        int m= sc.nextInt();
        int res = reverse(m);
        
        
            System.out.println(res);
     }
     
     
}
