
import processing.core.PApplet;
public class TryProcessing extends PApplet{
    float width=680, height=480,diameter=100;
    SampleCircle[] ball=new SampleCircle[4];
    public static void main(String[] args) {
        PApplet.main("TryProcessing",args);
    }

    @Override
    public void settings(){
        super.settings();
        size(680,480);
    }
    @Override
    public void setup(){
//        background(50);
        for(int i=0;i<4;i++) {
            ball[i] = new SampleCircle(this, i+1, (float)i+1);
        }
//        noLoop();
    }

    @Override
    public void draw(){
//        ellipse(width/2,height/2,diameter,diameter);
//        ball.printError();
        for(int i=0;i<4;i++) {
            ball[i].display();
            ball[i].move();
        }
    }
}
