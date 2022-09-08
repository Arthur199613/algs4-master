package Chapter1;

import edu.princeton.cs.algs4.Point2D;
import edu.princeton.cs.algs4.StdDraw;

import java.awt.*;

public class ex31 {

    //Program takes command line args of integer N and double val P (between 0 and 1).
    //Plots N equally spaced dots of size .05 on the circumference of a circle, with probability p for each set of points,
    //draws a gray line connecting them.

public static void main(String[] args){

    //int n = Integer.parseInt(args[0]);
    //int p = Integer.parseInt(args[1]);
    StdDraw.setCanvasSize(1280,1200);

    int N=360;
    double step =0.5;
    double cx=0.5;
    double cy=0.5;
    double circ = Math.PI*0.4;
    Point2D center = new Point2D(cx,cy);
    drawCircle(N,center);


}

public static void drawCircle(int N,Point2D center){
    for(double i=0; i<=N;i++){
        StdDraw.point(returnPointsOnCircumference(0.2,i,center).x(),returnPointsOnCircumference(0.2,i,center).y());

    }

 }

 public static Point2D returnPointsOnCircumference(double r, double angleInDegrees,Point2D origin){


    double x = origin.x() + r * Math.cos(angleInDegrees * Math.PI / 180.0);
    double y = origin.y() + r * Math.sin(angleInDegrees * Math.PI / 180.0);

    return new Point2D(x,y);
 }
}
