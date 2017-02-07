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

    public static void main(String[] args)
    {
        System.out.println(Integer.MAX_VALUE+",");
        System.out.println(16*16*16*16*16*16*16*4*2);
    }

    public static int sqrt(int x) {
        if (x == 0)
            return 0;
        int left = 1, right = Integer.MAX_VALUE;
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
}
