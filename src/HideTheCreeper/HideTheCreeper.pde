int a = 90;
int b = 65;

PImage Creeper;
void setup() {
  
  size(500, 500);
  PImage green = loadImage("GreenBackground.jpg");
  green.resize(500,500);
  background(green);
  Creeper=loadImage("Creeper.png");
  Creeper.resize(25, 25);
  
}
void draw() {
  image(Creeper, a, b);
  if(isNear(a, mouseX) && isNear(b, mouseY) && mousePressed) {
    fill(#0AFF1C);
    ellipse(a, b, 50, 50);
    println("You found the Creeper!");
    a+=100;
    b+=100;
  }
 else if(mousePressed) {
    fill(#FF0303);
   ellipse(mouseX, mouseY, 50, 50); 
  }
  
 
  }
  
  boolean isNear(int a, int b) {
if (abs(a - b) < 100)
     return true;
else
     return false;
}