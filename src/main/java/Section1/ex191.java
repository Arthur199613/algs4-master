package Chapter1;

import edu.princeton.cs.algs4.StdOut;

public class ex191 {
    public static long F(int N)
    {

        if (N == 0) return 0;
        if (N == 1) return 1;
        return F(N-1) + F(N-2);
    }

    public static long enhancedF(int N, int[] arr){
        if(N==0) return arr[0];
        if(N==1) return arr[1];

        for(int i=2;i<=N;i++) {
            arr[i] = arr[i-2] + arr[i-1];
        }
        return arr[N];
    }

    public static void main(String[] args)
    {

        for(int N=0;N < 100; N++){
            int[] a;

            if(N==0 || N==1){
                a=new int[2];
            }else{
                a = new int[N+1];
            }

            a[0] =0;
            a[1] =1;
            StdOut.println(N + " " + enhancedF(N,a));
        }
    }
}
