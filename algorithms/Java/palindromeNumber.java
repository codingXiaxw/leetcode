/**
 * Created by codingBoy on 17/2/4.
 */
public class palindromeNumber
{
    /**
    *this is my first wrong solution.
    */
    // public static void main(String[] args) {
    //     boolean isPalindrome = isPalindrome(2345432);
    //     System.out.println(isPalindrome);
    // }
    // public static boolean isPalindrome(int x) {
    //     if(x % 10 == 0)
    //     {
    //         return false;
    //     }

    //     int y=0;

    //     int z=x;
    //     while(z!=0)
    //     {
    //         y=y*10+z%10;
    //         z=z/10;
    //     }

    //     System.out.println(y);
    //     if(y==x)
    //     {
    //         return true;
    //     }else{
    //         return false;
    //     }

    // }

    //this is the right solution.
    public static void main(String[] args)
    {

        boolean isPalindrome=isPalindrome(5);
        System.out.println(isPalindrome);
    }

    public static boolean isPalindrome(int x) {
        if(x<0 || (x!=0 && x%10==0))
        {
            return false;
        }

        int rev=0;
        while(x>rev)
        {
            rev=rev*10 + x%10;
            x=x/10;
        }

        return (x==rev||x==rev/10);

    }

}
