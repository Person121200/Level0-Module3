
void setup() {
size(500, 500);
  // set the size of your sketch
}
void draw() {
  int x = 499;
  int y = 499;
  //Starting with the largest ellipse, use a for loop to draw a bullseye with ellipses.
  
  for (int i = 0; i < 9; i++){
    if(i % 2 ==0){
      fill(255, 0, 0);
    }
    else{
      fill(0, 0, 0);
    }
    x=x-50;
    y=y-50;
   ellipse(250, 250, x, y); 
  }
  //Use an if statement and remainder to alternate the color of your rings.

}
