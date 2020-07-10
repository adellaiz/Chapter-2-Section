/**
 * @author [Della A. Izzah]
 * @email [adellaiz@student.ub.ac.id]
 * @create date 2020-07-10 11:27:06
 * @modify date 2020-07-10 11:28:21
 * @desc [(Convert pounds into kilograms) Write a program that converts pounds into kilograms. The program prompts the user to enter a number in pounds, converts it
to kilograms, and displays the result. One pound is 0.454 kilograms. ]
 */
package Chapter_2_Section;
import java.util.Scanner;
public class Section_2_4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number in pounds = ");
        double pound = input.nextDouble();
        double kilograms = pound * 0.454;
        System.out.println(pound + " pounds is " + kilograms + "");
    }
}