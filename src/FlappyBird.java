
public class FlappyBird {
	int Y= 500;
	  int X= 250;



	  int pipeX= 500;



	  int upperPipeHeight= (int) random(100, 800);




	  int pipeGap= 200;
	  int lowerY= upperPipeHeight + pipeGap;
	  int lowerPipeHeight= 1000- lowerY;

	  int birdYVelocity= 80;
	  int gravity= 1;
	  
	  int score= 0;
	  
	  
	  int timer= 0;


	  boolean gameOver=false;
	  
	 
	  

	  void draw() {
	    background (0, 0, 255);
	    fill (127, 127, 0);
	    stroke (127, 127, 0);
	    ellipse (X, Y, 50, 50);
	    Y= Y+2;
	    fill (255, 255, 0);
	    rect (pipeX, 0, 50, upperPipeHeight);  
	    fill (255, 255, 0); 
	    rect (pipeX, lowerY, 50, lowerPipeHeight); 
	    pipeX= pipeX-5;
	     text ("Score: " + score, 800, 800);
	   if (intersectsPipes() && ! gameOver) {
	     gameOver= true;
	     timer= millis();
	   }
	   if (gameOver) {
	      if (millis()-timer> 5000) {
	     System.exit(0);
	   }
	   else {
	     textSize(100);
	     text ("Game Over", 250, 250);
	   }
	   }
	   
	    teleportPipes();
	    
	    
	  }


	  void setup() {
	    size (1000, 1000);

	     
	  }

	  void mousePressed() {
	    Y= Y - birdYVelocity;
	    
	  }

	    void teleportPipes() {
	        if (pipeX== (-50)) {
	     pipeX= 1050;
	    upperPipeHeight= (int) random(100, 800);
	    lowerY= upperPipeHeight + pipeGap;
	  lowerPipeHeight= 1000- lowerY;
	    }
	      
	    }
	    
	 boolean intersectsPipes() {
	   
	         if (Y < upperPipeHeight && X > pipeX && X < (pipeX+50)){
	         return true;
	           
	           
	         
	          }
	          
	          
	        else if (Y>lowerY && X > pipeX && X < (pipeX+50)) {
	           return true;
	           
	          
	        }
	        else if (X > pipeX && X< (pipeX+50)) { 
	        score= score +1;
	          return false;
	          
	      }
	      
	      else if (Y==(1000)) {
	        return true;
	      }
	      
	      
	  else {
	    return false;
	  }

	 }
	 
	 
	 

}
