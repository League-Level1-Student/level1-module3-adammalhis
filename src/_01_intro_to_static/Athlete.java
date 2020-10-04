 package _01_intro_to_static;

import java.util.Random;

public class Athlete {

	 static int nextBibNumber= 1;
	    static String raceLocation = "New York";
	    static String raceStartTime = "9.00am";

	    String name;
	    int speed;
	    int bibNumber;

	    Athlete (String name, int speed){
	        this.name = name;
	        this.speed = speed;
	        bibNumber= nextBibNumber;
	        nextBibNumber= nextBibNumber+1;
	    }
	    public static void main(String[] args) {
	        //create two athletes
	        //print their names, bibNumbers, and the location of their race. 
	    	Random rng= new Random();
	    	
	    	
	    	for(int i=0; i<20; i++) {
	    	
	    	Athlete bob= new Athlete("bob" + i, rng.nextInt(500));
	    	System.out.println(bob.name + ", " + bob.speed + ", " + bob.bibNumber + ", " + raceLocation);
	    	
	    	
	    	}
	    	
	    }
	
	
	
	
	
	
}
