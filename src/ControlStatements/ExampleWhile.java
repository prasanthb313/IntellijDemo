package ControlStatements;

public class ExampleWhile {
    public static void main(String[] args) {

        /*
         syntax
         conditioncheck - always must be true
         while(conditioncheck)
         {

         }
         */
        boolean flag = true;
        //case1 true != true --> false
        //case2 false != true --> true
        while(flag != true)
        {
            System.out.println("Executing while loop statement");
            flag = false;
        }
        System.out.println("Executing outside code");
    }
}
