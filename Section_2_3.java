/**
 * @author [Della A. Izzah]
 * @email [adellaiz@student.ub.ac.id]
 * @create date 2020-07-10 11:25:00
 * @modify date 2020-07-10 11:26:35
 * @desc [(Convert feet into meters) Write a program that reads a number in feet, converts it
to meters, and displays the result. One foot is 0.305 meter]
 */
package Chapter_2_Section;
import java.util.Scanner;
public class Section_2_3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a value for feet = ");
        double feet = input.nextDouble();
        double meter = feet * 0.305;
        System.out.println(feet + " feet is " + meter + " meters");
    }
}