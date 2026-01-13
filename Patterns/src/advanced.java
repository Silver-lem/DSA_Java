public class advanced {

    static void hollowRectangle(int rows,int cols){
        //Outer loop
        for(int i = 1 ; i <= rows ; i++){
            //Inner loop
            for(int j = 1 ; j <= cols ; j++){
                //cell (i,j)
                if(i == 1 || i == rows || j == 1 || j == cols){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    static void inverted_rotatedHalfPyramid(int n){

        for(int i = 1 ; i <= n ; i++){
            //spaces
            for(int j = 1;j <= n-i ;j++) {
                System.out.print(" ");
            }

            //stars
            for(int k = 1;k<=i;k++){
                System.out.print("*");
            }

            System.out.println();
        }
    }

    static void floyd(int n ){
        int k = 1;
        for(int i = 1 ; i <= n ; i++){
            for(int j = 1; j <= i ; j++){
                System.out.print(k + " ");
                k++;
            }
            System.out.println();
        }
    }

    static void ones_zeros(int n){
        int k = 0;
        for(int i = 1 ; i <= n ; i++){
            k++;
            for(int j = 1 ; j <= i ; j++){
                System.out.print(k + " ");
                k--;
            }
            System.out.println();
        }
    }

}
