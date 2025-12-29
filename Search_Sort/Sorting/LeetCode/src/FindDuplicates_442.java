import java.util.ArrayList;

//442
import java.util.List;
public class FindDuplicates_442 {
    public List<Integer> findDuplicates(int[] nums) {

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
        List<Integer> ans = new ArrayList<>();
        for(int in = 0;in<nums.length;in++){
            if(nums[in] != in+1){
                ans.add(nums[in]);
            }
        }
        return ans;
    }

    static void swap(int[] arr,int i,int check){
        int temp = arr[check];
        arr[check] = arr[i];
        arr[i] = temp;
    }
}
