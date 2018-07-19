PImage donkey;
PImage tail;
void setup() {
  donkey = loadImage("donkey_PNG30.png");
  tail = loadImage("CoolClips_anim1180.png");
  tail.resize(150, 150);
  size(600, 600);
}
void draw() {
  background(#B9B9B9);
    image(donkey, 50, 50);  
    image(tail, mouseX-100, mouseY-200);
  image(tail, mouseX, mouseY);
  rect(0, 0, 30, 30);
  rect(90, 215, 40, 40);
  dist(0, 0, mouseX, mouseY);
  //step 9, and have a question
}