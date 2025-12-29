//do this question again
//https://leetcode.com/problems/find-the-duplicate-number/
public class Duplicates_287 {
    public int findDuplicate(int[] nums) {
        int i = 0;
        while(i < nums.length){
            int check = nums[i] - 1;
            if(nums[i] != nums[check]){
                swap(nums,i,check);
            }else{
                i++;
            }
        }

        //finding missing number
        for(int in = 0;in<nums.length;in++){
            if(nums[in] != in+1){
                return nums[in];
            }
        }
        return nums.length;
    }

    static void swap(int[] arr,int i,int check){
        int temp = arr[check];
        arr[check] = arr[i];
        arr[i] = temp;
    }
}
