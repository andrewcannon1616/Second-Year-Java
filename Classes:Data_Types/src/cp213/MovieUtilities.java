package cp213;

import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Utilities for working with Movie objects.
 *
 * @author Andrew Cannon, 169066735, cann6735@mylaurier.ca
 * @version 2024-10-08
 */
public class MovieUtilities {

    /**
     * Counts the number of movies in each genre given in Movie.GENRES. An empty
     * movies list should produce a count array of: [0,0,0,0,0,0,0,0,0,0,0]
     *
     * @param movies List of movies.
     * @return Number of genres across all Movies. One entry for each genre in the
     *         Movie.GENRES array.
     */
    public static int[] genreCounts(final ArrayList<Movie> movies) {

	// your code here
    int[] r = new int[11];
    
    for (Movie j: movies)
    {
    	r[j.getGenre()] += 1;
    }
    

	return r;
    }

    /**
     * Creates a Movie object by requesting data from a user. Uses the format:
     *
     * <pre>
    Title:  
    Year:
    Director:
    Rating:
    Genres:
    0: science fiction
    1: fantasy
    ...
    10: mystery

    Enter a genre number:
     * </pre>
     *
     * @param keyboard A keyboard (System.in) Scanner.
     * @return A Movie object.
     */
    public static Movie getMovie(final Scanner keyboard) {

	// your code here
    System.out.print("Title:     ");
    String t = keyboard.nextLine();
    
    System.out.print("Year:      ");
    int y = keyboard.nextInt();
    keyboard.nextLine();
    System.out.print("Director:  ");
    String d = keyboard.nextLine();
    
    System.out.print("Rating:    ");
    double r = keyboard.nextDouble();
    
    System.out.println("Genres:    ");
    System.out.println(Movie.genresMenu());
    System.out.print("Enter a genre number: ");
    int g = keyboard.nextInt();
    
    Movie m = new Movie(t,y,d,r,g);

	return m;
    }

    /**
     * Creates a list of Movies whose genre is equal to the genre parameter.
     *
     * @param movies List of movies.
     * @param genre  Genre to compare against.
     * @return List of movies of genre.
     */
    public static ArrayList<Movie> getByGenre(final ArrayList<Movie> movies, final int genre) {

	// your code here
    ArrayList<Movie> movgenre = new ArrayList<>();
    for (Movie n:movies)
    {
    	if (n.getGenre() == genre)
    	{
    		movgenre.add(n);
    	}
    }

	return movgenre;
    }

    /**
     * Creates a list of Movies whose ratings are equal to or higher than rating.
     *
     * @param movies List of movies.
     * @param rating Rating to compare against.
     * @return List of movies of rating or higher.
     */
    public static ArrayList<Movie> getByRating(final ArrayList<Movie> movies, final double rating) {

	// your code here
    	ArrayList<Movie> movrating = new ArrayList<>();
        for (Movie n:movies)
        {
        	if (n.getRating() == rating)
        	{
        		movrating.add(n);
        	}
        }

	return movrating;
    }

    /**
     * Creates a list of Movies from a particular year.
     *
     * @param movies List of movies.
     * @param year   Year to compare against.
     * @return List of movies of year.
     */
    public static ArrayList<Movie> getByYear(final ArrayList<Movie> movies, final int year) {

	// your code here
    	ArrayList<Movie> movyear = new ArrayList<>();
        for (Movie n:movies)
        {
        	if (n.getYear() == year)
        	{
        		movyear.add(n);
        	}
        }

	return movyear;
    }

    /**
     * Asks a user to select a genre from a list of genres displayed by calling
     * Movie.genresMenu() and returns an integer genre code. The genre must be a
     * valid index to an item in Movie.GENRES.
     *
     * @param keyboard A keyboard (System.in) Scanner.
     * @return An integer genre code.
     */
    public static int readGenre(final Scanner keyboard) {

	// your code here
    System.out.println(Movie.genresMenu());
    System.out.print("Enter a genre number: ");
    int gen = keyboard.nextInt();
    keyboard.nextLine();
    if (gen > 10 || gen < 0)
    
    {
    	System.out.print("Try again: ");
    	gen = keyboard.nextInt();
    	keyboard.nextLine();
    }
    

	return gen;
    }

    /**
     * Creates and returns a Movie object from a line of formatted string data.
     *
     * @param line A vertical bar-delimited line of movie data in the format
     *             title|year|director|rating|genre
     * @return The data from line as a Movie object.
     */
    public static Movie readMovie(final String line) {

	// your code here
    String[] spit = line.split("[|]");
    String tit = spit[0];
	int ye = Integer.parseInt(spit[1]);
	String dire = spit[2];
	double rat = Double.parseDouble(spit[3]);
	int gen = Integer.parseInt(spit[4]);
	Movie m = new Movie(tit,ye,dire,rat,gen);

	return m;
    }

    /**
     * Reads a list of Movies from a file.
     *
     * @param fileIn A Scanner of a Movie data file in the format
     *               title|year|director|rating|genre
     * @return A list of Movie objects.
     */
    public static ArrayList<Movie> readMovies(final Scanner fileIn) {

	// your code here
    
    Movie m;
    ArrayList<Movie> mov = new ArrayList<>();
    	while (fileIn.hasNextLine()) 
    	{
    		String line = fileIn.nextLine();
    		
    		String[] spit = line.split("[|]");
    		
    	    String tit = spit[0];
    		int ye = Integer.parseInt(spit[1]);
    		String dire = spit[2];
    		double rat = Double.parseDouble(spit[3]);
    		int gen = Integer.parseInt(spit[4]);
    		
    		m = new Movie(tit,ye,dire,rat,gen);
    		mov.add(m);
    		
    	}
            

	return mov;
    }

    /**
     * Writes the contents of a list of Movie to a PrintStream.
     *
     * @param movies A list of Movie objects.
     * @param ps     Output PrintStream.
     */
    public static void writeMovies(final ArrayList<Movie> movies, PrintStream ps) {

	// your code here
    for (Movie m : movies) 
    {
	    	m.write(ps);
	}

	return;
    }

}
