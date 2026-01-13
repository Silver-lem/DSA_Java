public class basic {

    static void invertedStar(int n){
        for(int i = 0;i < n;i++){
            for(int j = i;j <n;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void halfPyramid(int n){
        for(int i = 1;i <= n;i++){
            for(int j = 1;j<=i;j++){
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }


    static void characterPattern(int n){
        int k = 'A';
        for(int i = 1;i <= n;i++){
            for(int j = 1;j <= i;j++){
                System.out.print((char)k + " ");
                k++;
            }
            System.out.println();
        }
    }
}
