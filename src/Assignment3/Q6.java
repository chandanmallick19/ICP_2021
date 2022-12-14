/*
You can use Cramerβs rule to solve the following 2 X 2 system of linear equation:
ππ₯ + ππ¦ = π
ππ₯ + ππ¦ = π
π₯ =(ππ β ππ)/(ππ β ππ)
π¦ =(ππ β ππ)/(ππ β ππ)
Write a java program that prompts the user to enter a, b, c, d, e, and f and displays the result.
If ad - bc is 0, report that βThe equation has no solution.β
Enter a, b, c, d, e, f: 9.0 4.0 3.0 -5.0 -6.0 -21.0
x is -2.0 and y is 3.0
Enter a, b, c, d, e, f: 1.0 2.0 2.0 4.0 4.0 5.0
The equation has no solution
 */

package Assignment3;
import java.util.Scanner;
public class Q6 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double a,b,c,d,e,f,x,y;
        System.out.print("Enter the value of a,b,c,d,e,f: ");
        a=sc.nextDouble();
        b=sc.nextDouble();
        c=sc.nextDouble();
        d=sc.nextDouble();
        e=sc.nextDouble();
        f=sc.nextDouble();
        if(a*d-b*c==0){
            System.out.println("The equation has no solution.");
        }else{
            x=(e*d-b*f)/(a*d-b*c);
            y=(a*f-e*c)/(a*d-b*c);
            System.out.println("X is: "+x+" and Y is "+y);

        }
    }
}
