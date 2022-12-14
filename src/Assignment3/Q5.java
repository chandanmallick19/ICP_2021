/*
The two roots of a quadratic equation ππ₯2 + ππ₯ + π = 0 can be obtained using the
following formula:
π1 =(βπ+βπ2β4ππ)/2π
and π2 =(βπββπ2β4ππ)/2π
b2 - 4ac is called the discriminant of the quadratic equation. If it is positive, the equation has
two real roots. If it is zero, the equation has one root. If it is negative, the equation has no real
roots.
Write a java program that prompts the user to enter values for a, b, and c and displays the result
based on the discriminant. If the discriminant is positive, display two roots. If the discriminant
is 0, display one root. Otherwise, display βThe equation has no real rootsβ
Note that you can use Math.pow(x, 0.5) to compute βπ₯
Here are some sample runs.
Enter a, b, c: 1.0 3 1
The equation has two roots -0.381966 and -2.61803
Enter a, b, c: 1 2.0 1
The equation has one root -1
Enter a, b, c: 1 2 3
The equation has no real roots
 */

package Assignment3;
import java.util.*;
public class Q5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double a,b,c,discriminant,r1,r2;
        System.out.print("Enter the value of a,b,c: ");
        a=sc.nextDouble();
        b=sc.nextDouble();
        c=sc.nextDouble();
        discriminant=Math.pow(b,2)-(4*a*c);
        if(discriminant>0){
            r1=(-b+Math.pow(discriminant,0.5))/(2*a);
            r2=(-b-Math.pow(discriminant,0.5))/(2*a);
            System.out.println("The equation has two roots "+r1+" and"+r2);
        }else if(discriminant==0){
            r1=(-b+Math.pow(discriminant,0.5))/(2*a);
            System.out.println("The equation has one root "+r1);
        }else{
            System.out.println("The equation has no roots");
        }
    }
}
