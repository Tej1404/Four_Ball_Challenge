int x1=0,
    x2=0,
    x3=0,
    x4=0;
final int diameter=15,divisor=5;
void setup(){
  size(680,480);
}
void draw(){
  //background(255);
  drawCircle(x1,1.0);
  x1+=1;
  drawCircle(x2,2.0);
  x2+=2;
  drawCircle(x3,3.0);
  x3+=3;
  drawCircle(x4,4.0);
  x4+=4;
}
void drawCircle(int xCenter,float part){
  ellipse(xCenter, 480*(part/divisor),diameter,diameter);
}
