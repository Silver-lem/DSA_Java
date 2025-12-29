package LinearSearch;

public class EvenDigits {
    public static void main(String[] args) {
        Solution s = new Solution();
        int[] nums = {12,9,304,45334};
        System.out.println(s.findNumbers(nums));
    }
}

class Solution{
    public int findNumbers(int[] nums){
        int count = 0;
        for (int num : nums) {
            if (even(num)) {
                count++;
            }
        }
        return count;
    }

    static boolean even(int n){
        return countMethod(n)%2 == 0;
    }

    static int countMethod(int n){

        //Negative case
        if(n < 0){
            n *= -1;
        }

        //Zero Only
        if(n == 0){
            return 1;
        }

        //Optimized counting method
        return (int)Math.log10(n) + 1;
    }
}

