/**
 * Created by codingBoy on 17/2/7.
 */
public class sqrt
{
    /**
     *
     * Implement int sqrt(int x).
     * Compute and return the square root of x.
     *
     * 计算并返回x的平方根
     */

    //二分查找法

    public static int mySqrt(int x) {
        if (x == 0)
            return 0;
        int left = 1, right = x;
        while (true) {
            int mid = left + (right - left)/2;
            if (mid > x/mid) {
                right = mid - 1;
            } else {
                if (mid + 1 > x/(mid + 1))
                    return mid;
                left = mid + 1;
            }
        }
    }

    //方法二
//    Explanation
//
//    Apparently, using only integer division for the Newton method works. And I guessed that if I start at x, the root candidate will decrease monotonically and never get too small.
//
//    The above solutions all got accepted, and in C++ I also verified it locally on my PC for all possible inputs (0 to 2147483647):


    /**
     * long r = x;
     while (r*r > x)
     r = (r + x/r) / 2;
     return (int) r;
     */
}
