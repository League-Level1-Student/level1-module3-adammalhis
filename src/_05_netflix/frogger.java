package _05_netflix;

int x= 400;
int y= 500;


Car car1= new Car(100, 100, 20, 20, 10);
Car car2= new Car(100, 140, 20, 20, 10);
Car car3= new Car(100, 180, 20, 20, 10);
Car car4= new Car(100, 220, 20, 20, 10);
Car car5= new Car(100, 260, 20, 20, 10);




void draw() {
  background (50, 50, 50);
  fill (0, 255, 0);
  ellipse (x, y, 50, 50);
 
}

void setup() {
  size (800, 600);
}

void keyPressed() {
  if (key == CODED) {


    if (keyCode == UP && y>0) {
      y= y-100;
    } 
    else if (keyCode == DOWN && y<height) {
      y=y+100;
    } else if (keyCode == RIGHT && x<width) {
      x=x+100;
    } else if (keyCode == LEFT && x>0) {
      x=x-100;
    }  
    

   
  }

}







public class Car {
	  
int X;
int Y;
int XSize;
int YSize;
int Speed;



Car (int X, int Y, int XSize, int YSize, int Speed) {
  this.X= X;
  this.Y= Y;
  this.XSize= XSize;
  this.YSize= YSize;
  this.Speed= Speed;
}

void display() {
  fill(0, 255, 0);
  rect(X, Y, XSize, 50);
}




}