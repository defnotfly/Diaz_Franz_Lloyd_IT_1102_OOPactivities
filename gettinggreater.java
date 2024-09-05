import java.util.Scanner;
import java.io.*;
public class gettinggreater {
    public static void main (String[]args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Getting the Greater Value");
        System.out.print("Enter first character: ");
        char first = input.next().charAt(0);
        System.out.print("Enter second character: ");
        char second = input.next().charAt(0);

        int ch1 = first;
        int ch2 = second;
        int greaterascii = Math.max(first, second);
        System.out.println("----------");
        System.out.println("The character with greater value is: " + greaterascii );
        System.out.println("----------");


        System.out.println("Showing the ASCII Codes");
        System.out.println(first + " : " + ch1);
        System.out.println(second + " : " + ch2);
    }
}
