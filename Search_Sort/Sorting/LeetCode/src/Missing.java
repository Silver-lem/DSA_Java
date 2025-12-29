//Problem 268 - LC
public class Missing {

    public int missingNumber(int[] nums) {
        return sort(nums);
    }

    static int sort(int[] nums){
        int i = 0;

        while(i<nums.length){
            int check = nums[i];

            if(check < nums.length && nums[i] != nums[check]){
                int temp = nums[check];
                nums[check] = nums[i];
                nums[i] = temp;
            }else{
                i++;
            }
        }
        for(int in = 0;in<nums.length;in++){
            if(nums[in] != in){
                return in;
            }
        }
        //return i;
        return nums.length;
    }
}
