package lab3BC;

public class Movie {
	private String movieName;

	private String mpaaRating; 

	
	private int oneTerribleRating;
	private int twoBadRating;
	private int threeOkRating;
	private int fourGoodRating;
	private int fiveGreatRating;
	// Implement the class with accessors and mutators for the movie name and MPAA
	// rating.
	public String getMovieName() {
		return this.movieName;
	}

	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}
	
	public String getMpaaRating() {
		return this.mpaaRating;
	}

	public void setMpaaRating(String mpaaRating) {
		this.mpaaRating = mpaaRating;
		
	}
	
	// Write a method 'addRating() that takes an int as an input parameter. The
	// method should verify that the parameter is a number between 1 and 5, and if
	// so, increment by one number of people rating the movie that matches the input
	// parameter.
	public void addRating(int rate) {
		if (rate > 0 && rate < 6)
		{
			switch (rate)
			{
				case 1 : {
					oneTerribleRating++; 
				}
				case 2 : {
					twoBadRating++;
				}
				case 3 : {
					threeOkRating++;
				}
				case 4 : {
					fourGoodRating++;
				}
				case 5 : {
					fiveGreatRating++;
				}
			}
		}	
	}
	public double getAverage()
	{
		return (((this.oneTerribleRating * 1) + (this.twoBadRating * 2) + (this.threeOkRating * 3) + (this.fourGoodRating * 4) + (this.fiveGreatRating * 5)) / 100);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
