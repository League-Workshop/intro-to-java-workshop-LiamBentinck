PImage mustache;
PImage friend;
void setup(){
  mustache =
  loadImage ("Moustache-PNG-File.png");
  friend =
  loadImage ("friend.jpeg");
  size(800,600);
  friend.resize(width,height);
  
  
}
void draw(){
 background(friend); 
 image (mustache, 150,
 250);
}
