/**
 * @author [Della A. Izzah]
 * @email [adellaiz@student.ub.ac.id]
 * @create date 2020-07-09 15:07:02
 * @modify date 2020-07-10 10:20:57
 * @desc [(Current time) Listing 2.7, ShowCurrentTime.java, gives a program that displays
the current time in GMT. Revise the program so that it prompts the user to enter
the time zone offset to GMT and displays the time in the specified time zone]
 */
package Chapter_2_Section;
import java.util.Scanner;
public class Section_2_8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the tima zone offset to GMT = ");
        int offset = input.nextInt();
        offset = offset * 60 * 60;
        long totalMiliSeconds = System.currentTimeMillis(); 
        long totalSeconds = totalMiliSeconds/1000 + offset;
        long currentSecond = totalSeconds%60;
        long totalMinutes = totalSeconds/60;
        long currentMinutes = totalMinutes%60;
        long totalHours = totalMinutes/60;
        long currentHours = totalHours%24;
        System.out.println("The current time is = " + currentHours + ":" + currentMinutes + ":" + currentSecond);
    }
}