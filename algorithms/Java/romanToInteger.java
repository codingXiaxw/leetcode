/**
 * Created by codingBoy on 17/2/5.
 */
public class romanToInteger {

    /**
     * 罗马数字共有7个，即Ⅰ（1）、Ⅴ（5）、Ⅹ（10）、Ⅼ（50）、Ⅽ（100）、Ⅾ（500）和Ⅿ（1000）。按照下述的规则可以表示任意正整数。需要注意的是罗马数字中没有“0”，与进位制无关。一般认为罗马数字只用来记数，而不作演算。
     * 重复数次：一个罗马数字重复几次，就表示这个数的几倍。
     * 右加左减：
     * 在较大的罗马数字的右边记上较小的罗马数字，表示大数字加小数字。
     * 在较大的罗马数字的左边记上较小的罗马数字，表示大数字减小数字。
     * 左减的数字有限制，仅限于I、X、C。比如45不可以写成VL，只能是XLV
     * 但是，左减时不可跨越一个位值。比如，99不可以用IC（ {\displaystyle 100-1} 100-1）表示，而是用XCIX（ {\displaystyle [100-10]+[10-1]} [100-10]+[10-1]）表示。（等同于阿拉伯数字每位数字分别表示。）
     * 左减数字必须为一位，比如8写成VIII，而非IIX。
     * 右加数字不可连续超过三位，比如14写成XIV，而非XIIII。（
     * @param args
     */
    public static void main(String[] args)
    {
        System.out.println(romanToInt("DCXXI"));
    }
    public static int romanToInt(String s) {
        int res = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            char c = s.charAt(i);
            switch (c) {
                case 'I':
                    res += (res >= 5 ? -1 : 1);
                    break;
                case 'V':
                    res += 5;
                    break;
                case 'X':
                    res += 10 * (res >= 50 ? -1 : 1);
                    break;
                case 'L':
                    res += 50;
                    break;
                case 'C':
                    res += 100 * (res >= 500 ? -1 : 1);
                    break;
                case 'D':
                    res += 500;
                    break;
                case 'M':
                    res += 1000;
                    break;
            }
        }
        return res;
    }

}


