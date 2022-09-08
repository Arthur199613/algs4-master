package Chapter2;

import edu.princeton.cs.algs4.*;

import java.awt.*;

public class ex1 {
    public static void main(String[] args){

        int n = 30;
        Point2D[] points = new Point2D[n];
        Interval1D xint = new Interval1D(0.3,0.6);
      Interval1D yint = new Interval1D(0.5, 0.6);
      Interval2D box = new Interval2D(xint,yint);
      box.draw();
        for(int i=0; i<n; i++) {
            double valx = StdRandom.uniform(0.1, 1);
            double valy = StdRandom.uniform(0.1,1);

            Point2D xy = new Point2D(valx,valy);

            if(box.contains(xy)) {
                 points[i] = xy;
                StdDraw.point(xy.x(), xy.y());

            }
        }

        StdOut.printf("The shortest distance is: %.3f", findShortestPoints(points));



    }

    private static double  findShortestPoints(Point2D[] points){
        double shortestDistance = Double.MAX_VALUE;
        double currentDistance;
        for(int i =0; i < points.length-1;i++){
            for(int j =i+1; j < points.length;j++ ){
                if(points[i]==null){
                    continue;
                }
                if(points[j]==null){
                    continue;
                }
                currentDistance= points[i].distanceTo(points[j]);
                if(currentDistance < shortestDistance){
                    shortestDistance = currentDistance;
                }
            }
        }
        return shortestDistance;

    }

    public static void testPointsDist(Point2D a, Point2D b){
        a.distanceTo(b);
    }
}
