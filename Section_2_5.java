/**
 * @author [Della A. Izzah]
 * @email [adellaiz@student.ub.ac.id]
 * @create date 2020-07-10 11:28:49
 * @modify date 2020-07-10 11:32:07
 * @desc [(Financial application: calculate tips) Write a program that reads the subtotal
and the gratuity rate, then computes the gratuity and total. For example, if the
user enters 10 for subtotal and 15% for gratuity rate, the program displays $1.5
as gratuity and $11.5 as total]
 */
package Chapter_2_Section;
import java.util.Scanner;
public class Section_2_5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Ener the subtotal and a gratuity rate = ");
        double r1 = input.nextDouble();
        double r2 = input.nextDouble();
        double gratuity = r1 * (r2/100);
        double subtotal = r1 + gratuity;
        System.out.println("The gratuity is $" + gratuity + " and total is $" + subtotal );
    }
}