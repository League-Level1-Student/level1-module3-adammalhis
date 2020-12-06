int Y= 500;
int X= 250;



int pipeX= 500;



int upperPipeHeight= (int) random(100, 400);




int pipeGap= 100;
int lowerY= upperPipeHeight + pipeGap;
int lowerPipeHeight= lowerY;

int birdYVelocity= 80;
int gravity= 1;

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
  upperPipeHeight= (int) random(100, 400);
  lowerPipeHeight=  (int) random(100, 800);
  }
    
  }