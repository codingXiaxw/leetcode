/**
 * Created by codingBoy on 17/2/7.
 */
public class lengthOfLastWord
{
    /**
     * Given a string s consists of upper/lower-case alphabets and empty space characters ' ', return the length of last word in the string.
     * If the last word does not exist, return 0.
     * @param args
     */

    public static void main(String[] args)
    {
        System.out.println(lengthOfLastWord(" "));



    }

    public static int lengthOfLastWord(String s) {
        return s.trim().length()-s.trim().lastIndexOf(" ")-1;
    }
    //我的错误做法，错在:理解错题目了，题目要求的是当字符串中最后一个字符为空字符时返回这个空字符前面的单词，而我直接返回0了。
//    public static int lengthOfLastWord(String s) {
//
//        if (s.length() == 0) {
//            return 0;
//        }
//
//        if (s.charAt(s.length()-1)==' ')
//        {
//            s.lastIndexOf(' ');
//            return 0;
//
//        }
//
//        while(s.indexOf(' ')!=-1)
//        {
//            s=s.substring(s.indexOf(' ')+1,s.length());
//        }
//
//        return s.length();
//
//
//    }
}
