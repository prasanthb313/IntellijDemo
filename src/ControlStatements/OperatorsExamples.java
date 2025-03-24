package ControlStatements;

public class OperatorsExamples {
    public static void main(String[] args) {
        /* operators
          less than <
          greater than >
          equalto ==
          less or equal to <=
          greater or equal to >=
          not equal !=
         */

        //Int
        int a = 10;
        int b =8;

        if (a<b)
        {
            System.out.println("a is smaller than b");
        }
        else if(a>b)
        {
            System.out.println("a is greater than b and a value is  "+a);
        } else if (a == b) {
            System.out.println("a is equal to b");
        } else if (a<=b) {
            System.out.println("a is equal or less than b");
        } else if (a!=b) {
            System.out.println("a is not equal to b");
        }
        else
        {
            System.out.println("executing else block as no condition is matching   ");
        }
    }
}
