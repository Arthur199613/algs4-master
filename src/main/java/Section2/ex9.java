package Chapter2;

import edu.princeton.cs.algs4.Counter;

import java.util.Arrays;

public class ex9 {
    public static void main(String[] args){
        int[] whitelist = {2,3,4,5};

        int[] keys = {10,12,5};

        Counter counter = new Counter("Operations");

        Arrays.sort(whitelist);

        int lo =0;
        int hi = whitelist.length-1;

        int mid = lo+(hi-lo)/2;

        System.out.println(mid);

    }
}
