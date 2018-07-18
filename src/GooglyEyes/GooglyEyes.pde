
void setup() {
  size(1000, 500);
}
void draw() {
 background(#8E8E8E);
  fill(#FFFFFF);
  ellipse(200, 250, 300, 200);
  ellipse(700, 250, 300, 200);
  if(mouseX > 300){
   mouseX = 300; 
  }
 if(mouseX < 105); {
   mouseX = 105; 
  }
 if(mouseY > 299){
   mouseY = 299; 
  }
  if(mouseY < 200) {
   mouseY = 200; 
  }
  fill(#000000);
  ellipse(mouseX, mouseY, 75, 75);
  ellipse(mouseX + 500, mouseY, 75, 75);
  print(mouseX + " " + mouseY);
}