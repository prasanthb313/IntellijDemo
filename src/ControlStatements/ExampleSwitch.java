package ControlStatements;

public class ExampleSwitch {
    public static void main(String[] args) {
        /*
          switch(expression)
          {
            case value1:
                 break;
            case value2:
                 break;
            case value3:
                 break;

            default:
               //default will be executed if any of case did not match means
          }
         */

        int num = 3;

        switch(num)
        {
            case 10:
                System.out.println("printing number 10");
                break;
            case 101:
                System.out.println("printing number 101");
                break;
            case 1:
                System.out.println("printing number 1");
                break;
            default:
                System.out.println("executing default condition");
                break;

        }

    }
}
