void setup() {
  
  PImage donkey = loadImage("donkey.jpg"); 
  PImage tail = loadImage("tail.png");
  size(300, 221);
  donkey.resize(width,height);
  tail.resize(40, 40);

  
 
  
  
}


void draw() {
  background(donkey);
  image(tail, mouseX, mouseY);
  
  
}
