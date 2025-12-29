//645
public class SetMisMatch_645 {
    public int[] findErrorNums(int[] nums) {
        int i = 0;
        while(i<nums.length){
            int check = nums[i] - 1;
            if(nums[i] != nums[check]){
                swap(nums,i,check);
            }else{
                i++;
            }
        }

        int[] arr = new int[2];
        //mismatch
        for(int in = 0;in<nums.length;in++){
            if(nums[in] != in + 1){
                return new int[]{nums[in] , in+1};
            }
        }
        return new int[]{-1,-1};
    }

    static void swap(int[] arr,int i,int check){
        int temp = arr[check];
        arr[check] = arr[i];
        arr[i] = temp;

    }
}
