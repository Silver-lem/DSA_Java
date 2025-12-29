public class Cyclic {
    public int[] cycleSort(int[] arr){
        int i = 0;
        while(i < arr.length){
            int check = arr[i] - 1;
            if(arr[i] != arr[check]){
                swap(arr,i,check);
            }else{
                i++;
            }

        }
        return arr;
    }

    static void swap(int[] arr,int i,int check){
        int temp = arr[check];
        arr[check] = arr[i];
        arr[i] = temp;
    }
}
