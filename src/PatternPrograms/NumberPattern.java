package PatternPrograms;

public class NumberPattern {
    public static void main(String[] args) {
        for (int i=1;i<=5;i++)
        {
            for (int j=1;j<=i;j++)
            {
                System.out.print(j);
            }
            System.out.println(" ");
        }
    }

    /*
        i=2 2<=5
        j=2 2<=2


        print
        1
        1 2



     */
}


