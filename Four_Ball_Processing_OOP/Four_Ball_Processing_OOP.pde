SampleCircle[] ball=new SampleCircle[4];
void setup(){
  size(680,480);
  for(int i=0;i<4;i++){
    ball[i]=new SampleCircle(i+1,(float)i+1);
  }
}

void draw(){
  for(int i=0;i<4;i++){
    ball[i].display();
    ball[i].move();
  }
}
