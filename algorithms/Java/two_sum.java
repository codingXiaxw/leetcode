import java.util.HashMap;
import java.util.Map;

/**
 * Created by codingBoy on 17/2/3.
 */
public class two_sum {
    public static void main(String[] args)
    {
        int[] numbers=new int[]{2,7,11,15};
        int target=9;
        int[] result =new int[2];
        result=twoSum(numbers,target);
        System.out.println(result[0]+","+result[1]);
    }

    public static int[] twoSum(int[] numbers, int target) {
        int[] result = new int[2];
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < numbers.length; i++) {
            if (map.containsKey(target - numbers[i])) {
                result[1] = i + 1;
                result[0] = map.get(target - numbers[i]);
                return result;
            }
            map.put(numbers[i], i + 1);
        }
        return result;
    }
}
