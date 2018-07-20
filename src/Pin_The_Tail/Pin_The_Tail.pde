import ddf.minim.*;          //at the very top of your sketch
AudioSample woohooSound;          //at the top of your sketch
boolean playSound = true;          //at the top of your sketch
PImage donkey;
PImage tail;
int X;
int Y;
boolean tailPinned = false;
void setup() {
  donkey = loadImage("donkey_PNG30.png");
  tail = loadImage("CoolClips_anim1180.png");
  tail.resize(100, 100);
  size(600, 600);
  Minim minim = new Minim(this);     //In the setup method
woohooSound = minim.loadSample("30996__unclesigmund__woohoo-1.wav");     //In setup. Change the file name if you need to
}
void draw() {
  background(#B9B9B9);
    image(donkey, 50, 50);  

if(dist(50, 215, mouseX, mouseY) < 30) {
  image(donkey, 50, 50);
}
else {
 background(#B9B9B9); 
}
if(tailPinned == false) {
  image(tail, mouseX, mouseY);
    }
    else if(tailPinned == true) {
      image(tail, X, Y);
      // put these lines where you want the sound to play
if (playSound) {
     woohooSound.trigger();
     playSound = false;
}
    }
 if(mousePressed == true) {
    tailPinned = true;
  X = mouseX;
  Y = mouseY;

  }
    
  rect(0, 0, 30, 30);
  rect(50, 215, 40, 40);
  
}