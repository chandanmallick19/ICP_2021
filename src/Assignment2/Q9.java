/*
Write a java program that prompts the user to enter two points (x1, y1) and (x2, y2) and
displays their distance between them. The formula for computing the distance is √(𝑥2−𝑥1)2+(𝑦2−𝑦1)2.
Note that you can use Math.pow (a, 0.5) to compute √𝑎.
Here is a sample run:
Enter x1 and y1: 1.5 -3.4
Enter x2 and y2: 4 5
The distance between the two points is 8.764131445842194
 */

package Assignment2;
import java.util.Scanner;
public class Q9 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double x1,x2,y1,y2;
        System.out.print("Enter x1 and y1: ");
        x1=sc.nextDouble();
        y1=sc.nextDouble();
        System.out.print("Enter x2 and y2: ");
        x2=sc.nextDouble();
        y2=sc.nextDouble();
        double distance=Math.pow(Math.pow(x2-x1,2)+Math.pow(y2-y1,2),0.5);
        System.out.println("The distance between the two points is "+distance);
    }
}
