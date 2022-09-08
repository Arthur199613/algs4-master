package Chapter1;

import edu.princeton.cs.algs4.StdOut;

public class ex24 {

    public static void main(String[] args){

        int gcd = gcd(105,24);

        StdOut.println("GDC 1: " + gcd);

        StdOut.println();

        int argument1 = Integer.parseInt(args[0]);
        int argument2 = Integer.parseInt(args[1]);

        int gc2 = gcd(argument1,argument2);

    }

    public static int gcd(int p, int q)
    {

        StdOut.println("p: " + p + " - q: " + q);

        if (q == 0) return p;
        int r = p % q;

        return gcd(q, r);
    }

}
