package lab3BC;

import java.util.Random;
import java.util.concurrent.TimeUnit;

public class MovieTestClass {
	// create at least two movie objects

	// add at least five ratings for each movie

	// output the movie name

	// output the mpaa rating

	// output the average rating for each movie object

	public enum Mpaa {
		G, PG, PG13, R, NR
	}

	private static int getRandomNumberInRange(int min, int max) {

		if (min >= max) {
			throw new IllegalArgumentException("max must be greater than min");
		}

		Random r = new Random();
		return r.nextInt((max - min) + 1) + min;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// switch toUpper comparing user input to the enum and then selecting the match.
		Movie movie1 = new Movie();
		Movie movie2 = new Movie();
		Mpaa rating = null;
		String usrInput = new String();
		int j = getRandomNumberInRange(5, 50);
		
		//moved up the execution order in attempt to generate varying ratings from movie2
		for (int i = 0; i < j; i++) {
			movie1.addRating(getRandomNumberInRange(1, 5));
		}
		
		// resolve user input to an available rating and set rating
		switch (getRandomNumberInRange(1, 4)) {
		case 1: {
			usrInput = rating.G.toString();
			break;
		}
		case 2: {
			usrInput = rating.PG.toString();
			break;
		}
		case 3: {
			usrInput = rating.PG13.toString();
			break;
		}
		case 4: {
			usrInput = rating.R.toString();
			break;
		}
		default: {
			usrInput = rating.NR.toString();
			break;
		}
		}
		movie1.setMovieName("Star Wars Episode 8: The Last Jedi");
		movie1.setMpaaRating(usrInput);
		// generate random rating
		
		// resolve user input to an available rating and set rating
		switch (getRandomNumberInRange(1, 4)) {
		case 1: {
			usrInput = rating.G.toString();
			break;
		}
		case 2: {
			usrInput = rating.PG.toString();
			break;
		}
		case 3: {
			usrInput = rating.PG13.toString();
			break;
		}
		case 4: {
			usrInput = rating.R.toString();
			break;
		}
		default: {
			usrInput = rating.NR.toString();
			break;
		}
		}
		movie2.setMovieName("Avengers: Infinity War");
		movie2.setMpaaRating(usrInput);
		
		try {
			TimeUnit.MICROSECONDS.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		for (int i = 0; i < j; i++) {
			movie2.addRating(getRandomNumberInRange(1, 5));
		}
		System.out.println(movie1.getMovieName() + ", " + movie1.getMpaaRating() + " - " + "Average rating: " + movie1.getAverage());
		System.out.println(movie2.getMovieName() + ", " + movie2.getMpaaRating() + " - " + "Average rating: " + movie2.getAverage());
	}
}
