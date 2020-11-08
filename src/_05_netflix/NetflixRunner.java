package _05_netflix;

public class NetflixRunner {

	public static void main(String[] args) {
		
		Movie bob= new Movie("bob", 5);
		Movie cod= new Movie("cod", 2);
		Movie tod= new Movie("tod", 4);
		Movie rod= new Movie("rod", 1);
		Movie nod= new Movie("nod", 3);
		
		String bobTicketCost= bob.getTicketPrice();
		System.out.println(bobTicketCost);
		

		NetflixQueue que= new NetflixQueue();
		que.addMovie(bob);
		que.addMovie(cod);
		que.addMovie(tod);
		que.addMovie(rod);
		que.addMovie(nod);
		que.printMovies();
		System.out.println("the best movie is " + que.getBestMovie());
		System.out.println("the second best movie is " + que.getSecondBestMovie());
		
		
	}
	
	
	

	
}
