package Chapter1;

import edu.princeton.cs.algs4.StdOut;

public class ex20 {

    //N factorial n! = n* (n-1)!

    public static void main(String[] args){
        int N = 5;
        StdOut.println("Factorial of " + N + " = " + Fact(N));

    }

    public static int Fact(int N){
        int v;
        if(N==1) return 1;

        return N* Fact(N-1);

    }
}
