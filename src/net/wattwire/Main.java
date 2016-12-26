package net.wattwire;


import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
	//**************************************

        Scanner sc = new Scanner(System.in);

        String movieTitle, rating;
        int yearMade, runMinutes;

        System.out.println("\n\n\t\t*** Welcome to the Movies Bitches! ***\n\n");

        System.out.println("Please enter info about your favorite movie:\n");

        System.out.println("Title:");
        movieTitle = sc.nextLine();

        System.out.println("Rating (PG, R, etc.):");
        rating = sc.nextLine();

        System.out.println("Year Released:");
        yearMade = sc.nextInt();

        System.out.println("Run Length (minutes):");
        runMinutes = sc.nextInt();

        MovieObj muve;

        muve = new MovieObj(movieTitle,rating,yearMade,runMinutes);

        System.out.println("\n\n");

        System.out.println(muve.strungOut());


    }
}
