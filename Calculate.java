//Java program to demonstrate static method or Java program to find cube of a given number using static method
import java.io.*;
public class Calculate 
{
    static int cube(int x){
        return x*x*x;
    }
public static void main(String args[]){
    int result = cube(88);
    System.out.println("Cube of 88 is "+result);
}
}
