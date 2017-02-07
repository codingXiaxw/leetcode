/**
 * Created by codingBoy on 17/2/7.
 */
public class climbingStairs
{
    /**
     * Total Accepted: 153092
     Total Submissions: 394417
     Difficulty: Easy
     Contributors: Admin
     You are climbing a stair case. It takes n steps to reach to the top.

     Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top?

     Note: Given n will be a positive integer.
     */

    public static void main(String[] args)
    {
        System.out.println(climbStairs(6));

    }

    //
//解法1
//    public static int climbStairs(int n) {
//        int a = 1, b = 1;
//        while (n-- > 0)
//            a = (b += a) - a;
//        return a;
//    }

    //解法2
    //解题思路:在纸上依次列举出当楼梯为0、1、2、3、4、5的走法分别为:0、1、2、3、5、8
    //发现每多一阶楼梯，它的走法为前两次相加，所以采用下面这种算法，当然下面这个时间复杂度较上面的时间复杂度高
    public static int climbStairs(int n) {
        if(n == 0 || n == 1 || n == 2){return n;}
        int[] mem = new int[n];
        mem[0] = 1;
        mem[1] = 2;
        for(int i = 2; i < n; i++){
            mem[i] = mem[i-1] + mem[i-2];
        }
        return mem[n-1];
    }

}
