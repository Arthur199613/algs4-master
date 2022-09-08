package Chapter1;

import edu.princeton.cs.algs4.Point2D;
import edu.princeton.cs.algs4.StdDraw;
import edu.princeton.cs.algs4.StdRandom;

public class ex31v2 {

    public static void main(String[] args) {

        int n = 10;

        draw(n,0.5,0.5);


    }

    public static void draw(int n,double p,double r){

        StdDraw.setCanvasSize(1200,1280);
        StdDraw.setScale(-1,1);
        StdDraw.point(0.0,0.0);
        Point2D origin = new Point2D(0.5,0.5);
        int angles = 360/n; //e.g. 360/4 = 90
        Point2D[] points = new Point2D[n];

        for(int i=0;i<n;i++){
            double x =  r * Math.cos(2*Math.PI* i/n);
            double y =  r * Math.sin(2*Math.PI* i/n);
            System.out.println("Val x " + x + " Val y " + y +"\n");
            StdDraw.point(x,y);
            points[i] = new Point2D(x,y);

        }

        for(int i=0;i<n;i++){
            for(int j=i+1;j<n; j++){
                if(Math.random() <p){
                    points[i].drawTo(points[j]);
                }

            }
        }



    }
}
