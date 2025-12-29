public class MissingPositive_41 {
    public int firstMissingPositive(int[] nums) {
        return sort(nums);
    }

    static int sort(int[] nums) {
        int i = 0;

        while (i < nums.length) {
            int check = nums[i] - 1;

            if (nums[i] > 0 && nums[i] <= nums.length && nums[i] != nums[check]) {
                int temp = nums[check];
                nums[check] = nums[i];
                nums[i] = temp;
            } else {
                i++;
            }
        }
        for (int in = 0; in < nums.length; in++) {
            if (nums[in] != in + 1) {
                return in + 1;
            }
        }
        //return i;
        return nums.length + 1;
    }
}
