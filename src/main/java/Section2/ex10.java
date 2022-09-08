package Chapter2;

import edu.princeton.cs.algs4.Point2D;
import edu.princeton.cs.algs4.StdDraw;
import edu.princeton.cs.algs4.StdRandom;

public class ex10 {
    //visual counter
    private int N;
    private int max;
    private int tally;
    private int operationCount;


    public ex10(int N, int max){
        this.N =N;
        this.max=max;

        StdDraw.setCanvasSize(1220,1240);
        StdDraw.setPenRadius(0.015);
        StdDraw.setXscale(0,N+1);
        StdDraw.setYscale(-100,max);

    }

    public void increment(){
        if(operationCount < N && tally < max)
        operationCount++;
        tally ++;
        plot();
    }

    public void decrement(){
        if(operationCount < N && tally < max)
        operationCount++;
        tally--;
        plot();
    }

    public void plot(){
        Point2D xy = new Point2D((operationCount),(tally));
        StdDraw.point(xy.x(),xy.y());
    }

    public static void main(String[] args){
        ex10 a1 = new ex10(30,50);
        a1.increment();
        a1.increment();
        a1.decrement();
        a1.decrement();

    }
}
