package Chapter1;

import edu.princeton.cs.algs4.StdDraw;

public class ex32 {
    //Suppose the standard input stream is a sequence of double values
    //Write a program that takes an integer N and two double values l and r
    //from the cmd and uses StdDraw to plot a histogram of the count of numbers
    //in the standard input stream that fall in each of the N intervals defined by dividing
    //(l,r) into N equal sized intervals

    public static void main(String[] args){

        int n =0;
        double l = 0.0;
        double r = 0.0;

        drawHistogram(l,r,n);

    }

    private static void drawHistogram(double l, double r, int n) {

        StdDraw.setCanvasSize(1240,1220);
        StdDraw.setXscale(0.0,10.0);
        StdDraw.setYscale(0.0,10.0);


    }
}
