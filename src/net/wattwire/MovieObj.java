package net.wattwire;

/**
 * Created by dave on 12/23/16.
 */
public class MovieObj {

    private String movieTitle;
    private String rating;
    private int year; // 4 digit integer for year made
    private int runMinutes;

    MovieObj (String movieTitle, String rating, int year, int runMinutes) {

        this.movieTitle = movieTitle;
        this.rating = rating;
        this.year = year;
        this.runMinutes = runMinutes;

    }

    public String getMovieTitle() {return movieTitle;}
    public void setMovieTitle(String value) {movieTitle=value;}

    public String getRating() {return rating;}
    public void setRating(String value) {rating = value;}

    public int getYear() {return year;}
    public void setYear (int value) {year = value;}

    public int getRunMinutes(){return runMinutes;}
    public void setRunMinutes(int value) {runMinutes = value;}

    public String strungOut() {

        return "*** Movie Info ***\n"
                + "\n     Title: "+movieTitle
                + "\n    Rating: "+rating
                + "\n Year Made: "+year
                + "\nRun Length: "+runMinutes+" minutes. \n\n";

    }

}
