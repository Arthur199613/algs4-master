package Chapter2;

import edu.princeton.cs.algs4.Interval1D;
import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.StdRandom;

public class ex2 {

    public static void main(String[] args) {

        int n = Integer.parseInt(args[0]);
        Interval1D[] intervals = new Interval1D[n];

        initiateIntervals(intervals);
        printIntervalsIntersections(intervals);
    }

    private static void printIntervalsIntersections(Interval1D[] intervals) {
        for(int i=0; i < intervals.length-1; i++){
            for(int j = 1 + 1; j < intervals.length; j++) {

                if(intervals[i].intersects(intervals[j])) {
                    StdOut.printf("Interval 1 - Min: %.3f Max: %.3f \n",intervals[i].min(),intervals[j].max());
                    StdOut.printf("Interval 2 - Min: %.3f Max: %.3f \n",intervals[j].min(),intervals[j].max());
                    StdOut.println();
                }
            }
        }
    }

    private static void initiateIntervals(Interval1D[] intervals) {
        for (int i = 0; i < intervals.length; i++) {
            double x = StdRandom.uniform(0.1, 100);
            double x1 = StdRandom.uniform(0.1, 100);

            if (x > x1) {
                double temp = x;
                x = x1;
                x1 = temp;
            }

            intervals[i] = new Interval1D(x, x1);
        }

    }


}



