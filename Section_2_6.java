/**
 * @author [Della A. Izzah]
 * @email [adellaiz@student.ub.ac.id]
 * @create date 2020-07-10 11:33:36
 * @modify date 2020-07-10 11:37:14
 * @desc [(Sum the digits in an integer) Write a program that reads an integer between 0 and
1000 and adds all the digits in the integer. For example, if an integer is 932, the
sum of all its digits is 14.]
 */
package Chapter_2_Section;
import java.util.Scanner;
public class Section_2_6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number between 0 and 1000 = ");
        int digits = input.nextInt();
        int a = digits%10;// 932 % 10 = 2
        int b = digits/10;// 932 / 10 = 93
        int c = b/10;// 93 / 10 = 9
        int d = b%10;// 93 % 10 = 3;
        System.out.println("The sum of the digits is = " + a + "+" + c + "+" + d + " = " + (a+c+d));
    }
}
