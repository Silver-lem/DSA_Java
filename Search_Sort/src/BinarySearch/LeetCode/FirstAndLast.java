package BinarySearch.LeetCode;

public class FirstAndLast {
    public static void main(String[] args) {
        Solution1 s = new Solution1();
        int[] arr = {5,7,7,7,8,8,10};
        int target = 7;
        int[] ans = s.searchRange(arr,target);
        for (int an : ans) {
            System.out.println(an + " ");
        }
    }
}

class Solution1{
    public int[] searchRange(int[] nums, int target) {
        int n1 = binaryfirst(nums,target,true);
        int n2 = binaryfirst(nums,target,false);
        return new int[]{n1,n2};
    }
    //to return the first index
    static int binaryfirst(int[] nums,int target,boolean first){
        int start = 0;
        int end = nums.length - 1;
        int ans = -1;

        while(start <= end){
            int mid = start + (end - start)/2;

            if(nums[mid] > target){
                end = mid - 1;
            }else if(nums[mid] < target){
                start = mid + 1;
            }else{
                ans = mid;
                if(first) {
                    end = mid - 1;
                }else{
                    start = mid + 1;
                }
            }

        }
        return ans;
    }

    //to return the last index
//    static int binarylast(int[] nums,int target){
//        int start = 0;
//        int end = nums.length - 1;
//        int ans = -1;
//
//        while(start <= end){
//            int mid = start + (end - start)/2;
//            if(nums[mid] > target){
//                end = mid - 1;
//            }else if(nums[mid] < target){
//                start = mid + 1;
//            }else{
//                ans = mid;
//                start = mid + 1;
//            }
//        }
//        return ans;
//    }
}
