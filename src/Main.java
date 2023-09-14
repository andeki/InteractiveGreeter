import java.sql.SQLOutput;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main
{
    public static void main(String[] args)
    {

        Scanner s = new Scanner(System.in);

        //gui and inputs for each question
        System.out.println("What is your name?");
        String name = s.next();
        System.out.println("Where are you from?");
        String location = s.next();
        System.out.println("How old are you (in years)?");
        int age = s.nextInt();
        //output the results of the method
        System.out.println(greetTask.firstSetOfAnswers(name, location, age));
        
        System.out.println("What's your favorite thing to do?");
        String activity = s.next();
        //output the results of the method relating to activity
        System.out.println(greetTask.activityResponse(activity));
        
        System.out.println("How much would you like to donate today?");
        int donation = s.nextInt();
        //output the results of the method relating to donations
        System.out.println(greetTask.donationMessage(donation));

    }
}