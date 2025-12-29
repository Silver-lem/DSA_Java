package BinarySearch;

public class floor {
    static int floor1(int[] arr, int target){

        //If target is greater than the greatest number in the array
        if(target < arr[0]){
            return -1;
        }
        int start = 0;
        int end =arr.length-1;

        while(start<=end){
            int mid = start + (end-start)/2;
            if(arr[mid] > target){
                end = mid-1;
            }else if(arr[mid] < target){
                start = mid+1;
            }else{
                return mid;
            }
        }
        return end;
    }
}

