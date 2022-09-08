package Chapter1;

public class ex26 {

    public static void main(String[] args){
        int a = 5;
        int b = 6;
        int c = 7;


    }

    public static void Sort(int a, int b, int c ){
        int t;
        if(a>b) {t=a; a=b; b=t;}
        if(a>c) {t=a; a=c; c=t;}
        if(b>c) {t=b; b=c; c=t;}


    }
}
