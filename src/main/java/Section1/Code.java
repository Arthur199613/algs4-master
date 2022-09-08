package Chapter1;


import edu.princeton.cs.algs4.StdOut;

public class Code {
    public static void main (String args[]){
        StdOut.printf("% d",mystery(3,11));
    }

    public static int mystery(int a,int b){
        int pass =0;
        StdOut.println("Pass " + pass + " " + "value of a =" + a+ "value of b =" + b);
        if(b==0){
            pass++;
            return 1;}
        if(b%2 ==0){
            pass++;
            return mystery(a*a,b/2);}
        pass++;
        return mystery(a*a,b/2) * a;
    }
}
