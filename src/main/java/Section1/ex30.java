package Chapter1;

import edu.princeton.cs.algs4.StdOut;

public class ex30 {
    public static void main(String[] args){

        int n = 5;

        boolean[][] array = createCoprimeArray(n);


        printArray(array);
    }

    public static boolean[][] createCoprimeArray(int n){
        boolean[][] array = new boolean[n][n];
        for(int i = 0;i < n;i++){
            for(int j = 0;j < n;j++){
                if(HasCommonFac(i,j)==1 ){
                    array[i][j]=true;
                }
                else
                array[i][j]=false;

            }
        }
        return array;
    }

    public static void printArray(boolean[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                StdOut.printf("%6b", array[i][j]);
            }
            StdOut.println();
        }
    }

    public static int HasCommonFac(int i,int j){
        StdOut.println("i: " + i + " - j: " + j);

        if (j == 0) return i;
        int r = i % j;

        return HasCommonFac (j, r);
    }
}
