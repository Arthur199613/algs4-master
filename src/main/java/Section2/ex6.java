package Chapter2;

public class ex6 {
    //Detecting circular shift
    public static void main(String[] args) {
        String a = "AABCD";
        String b = "CDAAC";

        System.out.println(circularString(a,b));


        }
    public static boolean circularString(String a, String b){
        if(a.equals(b)){
            return true;
        }
        String c = "";
        c = c+b.charAt(b.length()-1);

        for(int i =0;i<b.length()-1;i++){
            c = c+b.charAt(i);
        }
        b=c;

        return circularString(a,b);
    }
}


