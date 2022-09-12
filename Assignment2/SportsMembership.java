package Assignment2;

import java.text.DecimalFormat;
import java.util.Objects;
import java.util.Scanner;

/***************************************************************
 Filename: SportsMembership
 Created by: Ruby Dowds
 Comment: read in key membership details and then identify and inform them
 of any discounts they are entitled to depending on personal details input
 ***************************************************************/
public class SportsMembership
{
    public static void main(String []args)
    {
        //declare constants
        final int GOLDDISCOUNT = 50, SILVERDISCOUNT = 30, BRONZEDISCOUNT = 10;
        final int GOLDLEVEL = 60;

        //declare variables
        String initials;
        String answer;
        int pin, discount, noOfSwims, noOfGyms, overallActivities;

        Scanner keyboard = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00");

        do {
            //read in data from first user
            System.out.println("PLease enter you initials: ");
            initials = keyboard.next();

            System.out.println(initials + ", please enter your pin: ");
            pin = keyboard.nextInt();

            System.out.println(initials +", please enter number of swims you have completed: ");
            noOfSwims = keyboard.nextInt();
            System.out.println(initials +", please enter number of gym sessions you have attended: ");
            noOfGyms = keyboard.nextInt();

            overallActivities = noOfGyms + noOfSwims;

            //print out customer data
            System.out.println("CLIENT ID\t\t\tSwim\t\tGym\t\t\tOverall Activities");
            System.out.println(initials + "\t" +pin + "\t\t\t" +noOfSwims + "\t\t\t" + noOfGyms + "\t\t\t" + overallActivities);

            //apply if statement to work out discount for customer
            if (overallActivities >= GOLDLEVEL)
            {
                discount = GOLDDISCOUNT;
                System.out.println("Congratulations, you have been awarded Gold discount of " + discount +"%");
            }//if
                else if ((noOfSwims >= 20 && noOfSwims <= 30) && (noOfGyms >= 20 && noOfGyms <= 30))
                {
                    discount = SILVERDISCOUNT;
                    System.out.println("Congratulations, you have been awarded Silver discount of " + discount + "%");
                }//else if
                    else if ((noOfSwims >= 10 && noOfGyms >= 10))
                        {
                         discount = BRONZEDISCOUNT;
                            System.out.println("Congratulations, you have been awarded Bronze discount of " + discount + "%");
                        }//else
            System.out.println("Do you wish to enter data for another customer? (yes or no)");
            answer = keyboard.next();


        }//do
        while (Objects.equals(answer, "yes"));









    }//main

}//class
