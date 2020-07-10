/**
 * @author [Della A. Izzah]
 * @email [adellaiz@student.ub.ac.id]
 * @create date 2020-07-10 11:22:15
 * @modify date 2020-07-10 11:24:21
 * @desc [(Compute the volume of a cylinder) Write a program that reads in the radius
and length of a cylinder and computes the area and volume using the following
formulas:
area = radius * radius * p
volume = area * length
]
 */
package Chapter_2_Section;
import java.util.Scanner;
public class Section_2_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the radius and length of a cylinder = ");
        double radius = input.nextDouble();
        double length = input.nextDouble();
        double area = radius * radius * Math.PI;
        double volume = area * length;
        System.out.println("The area is = " + area);
        System.out.println("The volume is  = " + volume);
    }
}