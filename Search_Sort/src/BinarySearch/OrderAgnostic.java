package BinarySearch;

public class OrderAgnostic {
    public static void main(String[] args) {
        int[] arr = {0,1,6};
                int target = 6;
        orderagnosticbinarySearch(arr,target);
    }

    static int orderagnosticbinarySearch(int[] arr, int target){

        int start=0;
        int end =arr.length-1;
        boolean isAsc = arr[start] <arr[end];

        while(start <= end){
            int mid = start + (end-start)/2;
            if(arr[mid] == target){
                return mid;
            }

            if(isAsc) {
                if (arr[mid] > target) {
                    end = mid - 1;
                } else if (arr[mid] < target) {
                    start = mid + 1;
                }
            }else{
                if (arr[mid] < target) {
                    end = mid - 1;
                } else if (arr[mid] > target) {
                    start = mid + 1;
                }

            }
        }
        return -1;
    }
}
