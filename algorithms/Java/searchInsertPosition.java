/**
 * Created by codingBoy on 17/2/6.
 */
public class searchInsertPosition
{
    /**
     * Given a sorted array and a target value, return the index if the target is found.
     * If not, return the index where it would be if it were inserted in order.
     * @param args
     * 给定排序的数组和目标值，如果找到目标，则返回索引。如果没有，返回它被插入顺序数组中的索引。
     */
    public static void main(String[] args)
    {
        System.out.println(searchInsert(new int[]{1,3,5,6,8,10,12,16,18,20},9));
    }
    public static int searchInsert(int[] nums, int target) {

        if (target<nums[0])
        {
            return 0;
        }

        if (target>nums[nums.length-1])
        {
            return nums.length;
        }

        for (int i=0;i<nums.length;i++)
        {
            if (nums[i]==target)
            {
                return i;
            }
            if (target>nums[i]&&target<nums[i+1])
            {
                return i+1;
            }
        }
        return 0;
    }

    /**
     * 另外下面这个是我在网上看到的一个效率更高的使用二分法解决 的
     * public int searchInsert(int[] A, int target) {
        int low = 0, high = A.length-1;
        while(low<=high){
            int mid = (low+high)/2;
            if(A[mid] == target) return mid;
            else if(A[mid] > target) high = mid-1;
                else low = mid+1;
        }
        return low;
     }
     */
}
