package Chapter1;

import edu.princeton.cs.algs4.StdOut;

public class ex33 {
    //Write a matrix library implementing the following API:

    public static void main(String[] args) {

        double[] x = {2, 3, 5};
        double[] y = {4, 5, 6};
        System.out.println(dot(x, y));

        double[][] a = {{1, 2},
                       {-1, 0}};


        double[][] b = {{1, 2, 0},
                        {1, -1, 3}};
        double[][] c = mult(a,b);

        for(int i=0; i < c.length; i++){
            for(int j=0; j < c[0].length; j++){
                System.out.println(c[i][j]+ " ");
            }
            System.out.println();
        }

        double[][] f = {
                {1, 2, 3},
                {4, 5, 6}
        };

        double[] g = {1, 2, 3};

        double[] h = mult(f, g);

        StdOut.println("\nMatrix-vector product:");
        for (int i = 0; i < h.length; i++) {
            StdOut.print(h[i] + " ");
        }
    }
    private static double[][] mult2(double[][] a, double[][] b) {

        // To multiply matrixes the number of columns in the first matrix must be the same
        // as the number of rows on the second matrix
        if (a == null || b == null || a.length == 0 || b.length == 0 || a[0].length != b.length) {
            throw new IllegalArgumentException();
        }

        // Result will always have the same number of rows as the first matrix and
        // the same number of columns as the second matrix
        double[][] c = new double[a.length][b[0].length];

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < b[0].length; j++) {
                for (int k = 0; k < a[0].length; k++) {
                    c[i][j] += a[i][k] * b[k][j];
                }
            }
        }

        return c;
    }

        public static double dot ( double[] x, double[] y){

            double res = 0;
            for (int i = 0; i < x.length; i++) {
                res += x[i] * y[i];

            }
            return res;
        }


        static double[][] mult ( double[][] a, double[][] b){

            int newRow = a.length;
            int newCol = b[0].length;
            double[][] newArray = new double[newRow][newCol];

            for (int i = 0; i < a.length; i++) {
                for (int j = 0; j < b[i].length; j++) {
                    for (int k = 0; k < a.length; k++) {
                        newArray[i][j] += a[i][k] * b[k][j];
                        //System.out.println(newArray[i][j]);
                    }
                }
            }
            return newArray;
        }

        static double[] mult(double[][] a, double[] x){
        int row = a.length;
        int col = a[0].length;

        double[] newArray = new double[row];

        for(int i=0; i < a.length; i++){
            for(int j=0; j < x.length;j++){
             newArray[i] += a[i][j] * x[j];
            }
        }
        return newArray;
        }


        public static double[][] transpose ( double[][] a){
            //to transpose, we need the matrix to be inversed?
            //so we get an 1x2 becomes 2x1
            //the old arrays rows become the new arrays columns
            int n = a.length;
            int m = a[0].length;
            double[][] copy = new double[n][m];

            for (int i = 0; i < a.length; i++) {
                for (int j = 0; j < a[i].length; j++) {
                    copy[j][i] = a[i][j];

                }
            }
            return copy;
        }

    }

