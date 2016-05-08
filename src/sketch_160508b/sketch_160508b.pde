int xcord = (0);

void setup() {
  size(800, 200);
}

void draw() {
  rect(0, 0, 800, 200);
  fill(255,255,0);
 
  if(mousePressed){
    xcord+=10;
  }
           
      ellipse(xcord,100,100,100);
if (xcord == 800){
  playSound();
}


}

import ddf.minim.*;
boolean soundPlayed = false;
void playSound() {
  if (!soundPlayed) {// Copyright Wintriss Technical Schools 2013
    Minim minim = new Minim(this);        
    AudioSample sound = minim.loadSample("320905__suzenako__the-ding.wav");
    sound.trigger();
    soundPlayed = true;
  }
}




