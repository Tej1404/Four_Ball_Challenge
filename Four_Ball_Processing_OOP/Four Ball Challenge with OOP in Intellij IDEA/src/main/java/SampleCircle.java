import processing.core.PApplet;

public class SampleCircle {
    private PApplet sketch;
    public float yPointer=480.F,parts,xPointer=0.0F;
    public int xVelocity;
    SampleCircle(PApplet sketch,int xVel,float p){
        this.sketch=sketch;
//        this.xPointer=0;
//        this.yPointer= 480.0F;
        this.xVelocity=xVel;
        this.parts=p;
    }
    public void printError(){
        System.out.println(this.xPointer);
        System.out.println(this.yPointer);
        System.out.println(this.parts);
    }
    public void display(){
        try {
            sketch.ellipse(xPointer, (yPointer * parts) / 5, 20.0F, 20.0F);
        }catch (NullPointerException e){
            System.out.println(this.xPointer);
            System.out.println(this.yPointer);
            System.out.println(this.parts);
            System.out.print(e.getClass());
        }
    }
    public void move(){
        xPointer+=xVelocity;
    }

//    public static void main(String[] args) {
//        PApplet.main("SampleCircle",args);
//    }
}
