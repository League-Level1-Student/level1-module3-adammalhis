
public class Frogger {

	
	
	int x= 400;
	int y= 500;

	void draw() {
	  background (50, 50, 50);
	  fill (0, 255, 0);
	  ellipse (x, y, 50, 50);
	  
	}

	void setup() {
	 size (800, 600);
	 
	}

	void keyPressed() {
	    if(key == CODED){
	        
	    
	      if(keyCode == UP) {
	        y= y-100;
	          
	        }
	        else if(keyCode == DOWN) {
	        y=y+100;
	          
	        }
	        else if(keyCode == RIGHT) {
	        x=x+100;
	            
	        }
	        else if(keyCode == LEFT) {
	        x=x-100;
	            
	        }  
	             
	        if (keyCode == UP && y == -100) {
	        y= y+100;
	        
	      }
	      if (keyCode == DOWN && y >= 800) {
	        y= y-200;
	        
	         
	      }
	       
	      }
	        
	    }
	    
	    



}
 