PImage rainbow;
PImage unicorn;
void setup(){ 
  unicorn =
  loadImage ("unicorn.jpeg");
rainbow =
loadImage("rainbow.jpg");
size(800, 600);
rainbow.resize(width,height);
background(rainbow);

}
void draw(){
 image(unicorn, 400,300); 
  
}
