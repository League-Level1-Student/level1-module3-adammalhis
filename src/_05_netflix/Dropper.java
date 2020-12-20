package _05_netflix;

public class Dropper {

	int x= 400;
	int y= 500;


	Object car1= new Object();
	Object car2= new Object();
	Object car3= new Object();
	Object car4= new Object();
	Object car5= new Object();



	void draw() {
	  background (50, 50, 50);
	  fill (0, 255, 0);
	  ellipse (x, y, 50, 50);
	  display();
	}

	void setup() {
	  size (800, 600);
	}

	void keyPressed() {
	  if (key == CODED) {


	    if (keyCode == UP && y>0) {
	      y= y-100;
	    } else if (keyCode == DOWN && y<height) {
	      y=y+100;
	    } else if (keyCode == RIGHT && x<width) {
	      x=x+100;
	    } else if (keyCode == LEFT && x>0) {
	      x=x-100;
	    }  

	   
	  }
	}




	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public class Car {

		int X= 300;
		int Y= 300;
		int XSize= 100;
		int YSize= 50;
		int Speed= 1000;


		  
		Object car1= new Object();
		Object car2= new Object();
		Object car3= new Object();
		Object car4= new Object();
		Object car5= new Object();




		  Car(int X, int Y, int XSize, int YSize, int Speed) {
		    this.X= X;
		    this.Y= Y;
		    this.XSize= XSize;
		    this.YSize= YSize;
		    this.Speed= Speed;
		    
		  }
		  
		  void display()
		  {
		    fill(0,255,0);
		    rect(X , Y,  XSize, YSize);
		  }




		}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
