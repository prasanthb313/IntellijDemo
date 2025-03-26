package Strings;

public class FirstExampleString {
    public static void main(String[] args) {
        /* creation of strings
        String str = "welcome to java demo";
        2) using new key word
        String s = new String("prasanth");

         */
        //index starts from 0 in strings
        //example for character w index will be 0
        String str = "welcome";

        //index starts from 0
        System.out.println(str.indexOf("w"));

        //length function starts from 1
        int length = str.length()-1;

        System.out.print("length of given string is   "+length);
    }
}
