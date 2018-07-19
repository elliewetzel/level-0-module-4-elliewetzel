void setup() {
      PImage waldo = loadImage("waldo.jpg"); // 5. Change this to match your file name.
      size(600, 500);
      image(waldo, 0, 0);
     doh = minim.loadSample("343960__reitanna__d-oh (2).wav");
     woohoo = minim.loadSample("30997__unclesigmund__woohoo-2 (2).wav");
}
void draw() {
      // 6. Use this print statement to find out the coordinates of Waldo
      // println("X: " + mouseX + " Y: " + mouseY); 
    println("X: " + mouseX + " Y: " + mouseY);
      // 7. If the mouse is on Waldo, print “Waldo found!”
    if(mouseX == 402 && mouseY == 31) {
     println("Waldo found!"); 
     playWoohoo();
    }
    else {
      println("Waldo is still out there.");
     playDoh(); 
    }
      // 8. If Waldo is found, also use the method below to play “Woohoo”
      // Change the name of the sound file if you need to 
      
      // 9. If the mouse is not on Waldo, play “Doh”
      // Change the name of the sound file if you need to 
}

void playWoohoo() {
     woohoo.stop();
     woohoo.trigger();
}

void playDoh() {
     doh.stop();
     doh.trigger();
}

import ddf.minim.*;
Minim minim = new Minim(this); 
AudioSample doh;
AudioSample woohoo;