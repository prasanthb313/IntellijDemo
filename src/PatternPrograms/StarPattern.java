package PatternPrograms;

public class StarPattern {
    public static void main(String[] args) {
        for(int i=0;i<4;i++)   //i=0
        {
           for(int j=0;j<=i;j++) //j=0 ,0<=0||
           {
               System.out.print("*");
           }
            System.out.println(" ");
        }
    }
}
