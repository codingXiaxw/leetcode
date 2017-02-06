/**
 * Created by codingBoy on 17/2/6.
 */
public class implementStrStr
{
    /**
     * mplement strStr().
     * Returns the index of the first occurrence of needle in haystack, or -1 if needle is not part of haystack.
     * 返回needle在haystack中第一次出现的下标，这个题未免也太简单了吧！！！！
     * 看了很多人的答案，发现这样做就可以了。。。
     * @param args
     *
     */
    public static void main(String[] args)
    {
        String s1="asdfghjksdfghjk";
        String s2="sdfghjk";

        System.out.println(strStr(s1,s2));
    }
    public static int strStr(String haystack, String needle) {
        int index=haystack.indexOf(needle);
        return  index;
    }


}
