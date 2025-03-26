package Strings;

public class StringUpperCase {
    public static void main(String[] args) {
        String str = "vinay";

        //Vinay

        for (int i=0;i<=str.length()-1;i++)
        {
            char ch = str.charAt(i); //{i=0,v},{i=1,i},{i=2,n}
            if(i == 0)
            {
                System.out.print(Character.toUpperCase(ch));
            }
            else
                System.out.print(ch);

        }

        /*
          vinay ==> VINAY
          vinay ==> vinAy
         */
    }
}
