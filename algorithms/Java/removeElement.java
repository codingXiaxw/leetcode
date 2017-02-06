/**
 * Created by codingBoy on 17/2/6.
 */
public class removeElement
{
    /***
     * Given an array and a value, remove all instances of that value in place and return the new length.

     Do not allocate extra space for another array, you must do this in place with constant memory.

     The order of elements can be changed. It doesn't matter what you leave beyond the new length.

     Example:
     Given input array nums = [3,2,2,3], val = 3

     Your function should return length = 2, with the first two elements of nums being 2.

     给定数组和值，删除该值的所有实例并返回新长度。
     不要为另一个数组分配额外的空间，必须使用常量内存。
     元素的顺序可以改变。不管你离开了什么新的长度。
     例子:
     给定的输入数组数组= [ 3,2,2,3 ]，val = 3
     你的函数应该返回长度为2的数组为2，与前两个元素
     * @param args
     */
    public static void main(String[] args)
    {
        System.out.println(removeElement(new int[]{3, 2, 2, 3,3,4,3},3));
    }

    public static int removeElement(int[] A, int elem) {
        int m = 0;
        for(int i = 0; i < A.length; i++){

            if(A[i] != elem){
                A[m] = A[i];
                m++;
            }
        }

        return m;
    }


    //我之前的错误解法，错在只输出了去掉给定值后数组应该有的长度，而没有实际改变它的长度。
//    public static int removeElement(int[] nums, int val) {
//        int len=0;
//        for (int i=0;i<nums.length;i++)
//        {
//            if (nums[i]==val)
//            {
//                len++;
//            }
//        }
//        int result;
//        result=nums.length-len;
//
//        return result;
//    }
}
