package _06_gridworld;

import java.awt.Color;
import java.util.Random;

import info.gridworld.actor.Bug;
import info.gridworld.actor.Flower;
import info.gridworld.grid.Location;
import info.gridworld.world.World;

public class GridworldRunnder {

	public static void main(String[] args) {
		
		Random random= new Random();
		int rng= random.nextInt(9);
		int rng2= random.nextInt(9);
		System.out.println(rng);
		System.out.println(rng2);
		
		Location area1= new Location(4,4);
		Location area2= new Location(rng,rng2);
		Location area3= new Location(rng+1,rng2);
		Location area4= new Location(rng-1,rng2);
		
	
		
		
		World bob= new World();
		Bug ant= new Bug();
		ant.setColor(new Color(0,0,255));
		ant.setDirection(90);
		Flower sunflower= new Flower();
		bob.show();
		bob.add(area3, sunflower);
		bob.add(area4, sunflower);
		bob.add(area2, ant);
		
		
		
		for (int i=0; i<10; i++) {
			Location area5= new Location(i,i);
			Location area6= new Location(i, i+1);
			Location area7= new Location(i, i+2);
			Location area8= new Location(i, i+3);
			Location area9= new Location(i, i+4);
			Location area10= new Location(i, i+5);
			Location area11= new Location(i, i+6);
			Location area12= new Location(i, i+7);
			Location area13= new Location(i, i+8);
			Location area14= new Location(i, i+9);
			
			bob.add(area5, sunflower);
			bob.add(area6, sunflower);
			bob.add(area7, sunflower);
			bob.add(area8, sunflower);
			bob.add(area9, sunflower);
			bob.add(area10, sunflower);
			bob.add(area5, sunflower);
			bob.add(area5, sunflower);
		}
		
		
		
		
		
		
		
		
		
		
		
		
	}
	

	
}
