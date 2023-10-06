class SampleCircle {
    public float yPointer,parts;
    public int xPointer,xVelocity;
    SampleCircle(int xVel,float p){
        this.xPointer=0;
        this.yPointer=480.0;
        this.xVelocity=xVel;
        this.parts=p;
    }
    public void display(){
        ellipse(this.xPointer,(this.yPointer*this.parts)/5,20,20);
    }
    public void move(){
        this.xPointer+=this.xVelocity;
    }

}
