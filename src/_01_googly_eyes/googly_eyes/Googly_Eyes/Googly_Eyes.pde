void setup() {
    PImage face = loadImage("doge.jpg");
    size(800,600);
    face.resize(width,height);
    background(face);
  
  
  
}



void draw() {

  if (mouseX < 360 || mouseX > 440) {
    mouseX = 400;
  }
  if (mouseY < 235 || mouseY > 285) {
    mouseY = 400;
  }
  fill(#ffffff);
  ellipse(400,260, 80, 50);
  ellipse(600,225, 55, 50);
  
  fill(#000000);
  ellipse(mouseX,mouseY, 20, 20);
  
}
