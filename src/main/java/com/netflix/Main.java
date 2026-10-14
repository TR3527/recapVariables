package com.netflix;
import java.util.ArrayList;
public class Main {


    public static void main(String[] args) {

    System.out.println("*PERSONAL MOVIE PROFILE*");
    String movieTitle = "Step Brothers";
    String movieGenre = "Horror";
    int releaseYear = 2008;
    int movieDuration = 90;
    int timesWatched = 12;
    String streamingService = "Netflix";
    int hoursSpent = 4;
    double movieRating = 9.5;

        System.out.println("My favorite movie is " + movieTitle + "!");
        System.out.println("My favorite movie genre is " + movieGenre + "!");
        System.out.println("Step Brothers was released in " + releaseYear + "!");
        System.out.println("Step Brothers is  " + movieDuration + " minutes long!");
        System.out.println("I have watched Step Brothers " + timesWatched + " times!");
        System.out.println("My favorite streaming service is " + streamingService + "!");
        System.out.println("I spend " + hoursSpent + " hours a week watching shows and movies!");
        System.out.println("I rate my movie a " + movieRating + " out of 10!");

        int monthCount = hoursSpent * 4;
        String interestingFact = "Will Ferrel was 40 while filming Step Brothers!";

        System.out.println("I spend " + monthCount + " hours a month watching movies and shows!");
        System.out.println(interestingFact);

        //Arrays

        ArrayList<String>movies = new ArrayList<>();
        movies.add("Avatar");
        movies.add("Titanic");
        movies.add("Halloween");
        movies.add("Grown ups");

        System.out.println(movies);


















    }
}
