/**
 * Created by codingBoy on 17/2/7.
 */
public class addBinary
{
    /**
     * Given two binary strings, return their sum (also a binary string).

     For example,
     a = "11"
     b = "1"
     Return "100".
     * @param args
     *
     * 即二进制的加法
     */

    public static void main(String[] args)
    {
        System.out.println(addBinary("11011","101"));

    }


    /**
     * carry用于纪录超过该位数字超过2的，向前进1
     *
     * @param a
     * @param b
     * @return
     */
    public static String addBinary(String a, String b) {
        StringBuilder sb = new StringBuilder();
        int i = a.length() - 1, j = b.length() -1, carry = 0;
        while (i >= 0 || j >= 0) {
            int sum = carry;//将进的1赋给sum
            //这里需要注意的是，字符'1'的ASCAI＝49，'0'＝48，当然我不清楚这里后面为啥要减去一个'0'，因为直接输入'1'的话输出的是0而不是49.
            if (j >= 0) sum += b.charAt(j--) - '0';
            if (i >= 0) sum += a.charAt(i--) - '0';
            sb.append(sum % 2);//将两个二进制从右向左进行求和，并将每次结果纪录在sb中，所以最后肯定要将sb逆转。
            carry = sum / 2;
        }
        if (carry != 0) sb.append(carry);
        return sb.reverse().toString();
    }
}
