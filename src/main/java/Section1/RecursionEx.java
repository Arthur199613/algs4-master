package Chapter1;

import edu.princeton.cs.algs4.StdOut;

public class RecursionEx {

    public static void main(String[] args){
        int N = 5;
        int[] a = new int[N];
        System.out.println(Rec(a,5,5));
    }

    public static int Rec(int[] arr,int N, int k) {


        if ((N == 0) && (k == 0)) return 1;
        if ((N < 0) || (k < 0)) return 0;
        arr[N] = (2)* Rec(arr,N-1,k-1);

        return arr[N];

    }
}
