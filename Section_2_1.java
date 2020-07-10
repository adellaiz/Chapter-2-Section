/**
 * @author [Della A. Izzah]
 * @email [adellaiz@student.ub.ac.id]
 * @create date 2020-07-10 11:18:23
 * @modify date 2020-07-10 11:19:55
 * @desc [(Convert Celsius to Fahrenheit) Write a program that reads a Celsius degree in
a double value from the console, then converts it to Fahrenheit and displays the
result]
 */
package Chapter_2_Section;
import java.util.Scanner;
public class Section_2_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a degree in Celsius = ");
        double celcius = input.nextDouble();
        double fahrenheit = (9.0/5)*celcius+32;
        System.out.println(celcius + " Celcius is " + fahrenheit + " Fahrenheit");
    }
}