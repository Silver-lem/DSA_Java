package BinarySearch.LeetCode;

public class InfiniteArray {
    public static void main(String[] args) {
        int[] arr= {3,5,7,9,10,90,100,130,140,160,170};
        int target = 10;
        System.out.println(ans(arr,target));
    }

    static int ans(int[] arr,int target){
        int s = 0;
        int e = 1;

        while(target > arr[e]){
            int newS = e + 1;
            e = e + (e - s + 1)*2;
            s = newS;
        }
        return Binary(arr,target,s,e);
    }

    static int Binary(int[] arr,int target,int start1,int end1){
        while(start1 <= end1){
            int mid = start1 + (end1-start1)/2;
            if(arr[mid] > target){
                end1 = mid-1;
            }else if(arr[mid] < target){
                start1 = mid+1;
            }else{
                return mid;
            }
        }
        return -1;
    }
}
