/*
Write a java program that takes two positive integers as command-line arguments and prints
true if either evenly divides the other
 */

package Assignment2;
public class Q14 {
    public static void main(String[] args) {
        System.out.print("Enter two numbers: ");
        int a=Integer.parseInt(args[0]);
        int b=Integer.parseInt(args[1]);
        boolean ans=((a%b==0)||(b%a==0));
        System.out.println(ans);
    }
}