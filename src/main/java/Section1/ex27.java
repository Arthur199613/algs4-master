package Chapter1;

public class ex27 {
    public static void main(String[] args){

        int n = 5;
        int k = 2;
        double p = 0.5;

        System.out.println(binomial(n,k,p));

    }

    public static double binomial(int N, int k, double p){

        //if ((N == 0) && (k == 0)) return 1.0;
        //if ((N < 0) ||  (k < 0))  return 0.0;
       // return (1 - p)*binomial(N-1,k,p) + p*binomial(N-1,k-1,p);
        int a[];
        double p1 = 1-p;
        double acc=0.0;
        while(N!=0 && k!=0){
            if(N < 0 || k<0){
                acc+=0.0;
            }
           acc = p1 + p1;

            N--;
        }
   return 0; }
}
