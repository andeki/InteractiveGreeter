import java.util.Scanner;

public class greetTask
{
    //method compiling first personal answers into a response
    public static String firstSetOfAnswers(String name, String location, int age)
    {
        return ("Hello " + name + " from " + location + ", age " + age);
    }
    //method responding to the favorite activity given
    public static String activityResponse(String activity)
    {
        return (activity + ", huh? That's cool.");
    }
    //method responding to the donation, response changing based on amount
    public static String donationMessage(int donation)
    {
        if(donation >  100)
        {
            return "Wow, you're making me rich!";
        }
        if(donation > 20)
        {
            return "That's an insane amount! You're a hero.";
        }
        if(donation > 1)
        {
            return "Thank you!";
        }
        else
        {
            return "That little? Thanks, I guess...";
        }
    }


}
