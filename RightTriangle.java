public class RightTriangle {
    private int a, b, c;
    //default constructor
    public RightTriangle(){
        a = 1;
        b = 1;
        c = 1;
    }
    //another constructor that adds values automatically
    public RightTriangle(int a, int b, int c){
        if(a > 0 && b > 0 && c >0) {
            this.a = a;
            this.b = b;
            this.c = c;
        }
    }
    //copy constructor
    public RightTriangle(RightTriangle s){
        this.a = s.a;
        this.b = s.b;
        this.c = s.c;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int getC() {
        return c;
    }

    public void setC(int c) {
        this.c = c;
    }
}
