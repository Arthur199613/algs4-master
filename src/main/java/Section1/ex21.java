package Chapter1;

import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

public class ex21 {

    /*Write a program that reads in lines from standard input with each line containing a name and two integers and then uses printf() to print a table with a column of
    the names, the integers, and the result of dividing the first by the second, accurate to
    three decimal places. You could use a program like this to tabulate batting averages for
    baseball players or grades for students*/

  public static void main(String[] args){
//      A better Solution

      StdOut.printf("%8s %7s %7s %7s","Names","Number1","Number2","Result\n");

      In in = new In();

      while(in.hasNextLine()) {
          String line = in.readLine();
          String[] values = line.split(" ");
          formattedPrint(values);
      }

      /*String name;
      int val1;
      int val2;
      StdOut.println("Enter a name and two values in the console: ");

      while(!StdIn.isEmpty()){

          name = StdIn.readString();
          StdOut.println("Enter value 1");
          val1 = StdIn.readInt();
          StdOut.println("Enter value 2");
          val2 = StdIn.readInt();
       StdOut.printf("%8s %7s %7s",name, val1,val2);*/
      }

      private static void formattedPrint(String[] values){
      StdOut.printf("%8s",values[0]);
      StdOut.printf("%8s",values[1]);
      StdOut.printf("%8s",values[2]);
      StdOut.println();
      }

  }



