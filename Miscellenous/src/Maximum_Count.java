//#2529 : https://leetcode.com/problems/maximum-count-of-positive-integer-and-negative-integer/description/

public class Maximum_Count {
    public int maximumCount(int[] nums) {
        int[] result = count(nums);
        return Math.max(result[0],result[1]);
    }

    static int[] count(int[] nums){
        int neg = 0;
        int pos = 0;
        for(int i : nums){
            if(i == 0) continue;
            if(i < 0){
                neg++;
            }else{
                pos++;
            }
        }
        return new int[]{pos,neg};
    }
}
