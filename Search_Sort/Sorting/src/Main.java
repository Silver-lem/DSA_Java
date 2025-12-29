//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Bubble b = new Bubble();
        Selection s = new Selection();
        Insertion in = new Insertion();
        Cyclic c = new Cyclic();

        int[] arr = {6,5,4,0,10,3,2,7};
        int[] result = b.bubbleSort(arr);
        //Bubble Sort
//        for(int i = 0;i<result.length;i++){
//            System.out.print(result[i] + " ");
//        }
        int nums[] = {3,5,2,1,4};
        int[] re = c.cycleSort(nums);
        for(int i=0;i<re.length;i++)
            System.out.print(re[i] + " ");

        }
}