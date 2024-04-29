package java_17_to_20;

public class Floor {
    double width;
    double length;
    public static void main(String[] args) {

    }
    public Floor(double width,double length){
        if(width<0){
            this.width=0;
        }
        else {
            this.width = width;
        }
        if(length<0){
            this.length=0;
        }
        else {

            this.length = length;
        }
    }
    public double getArea(double width,double length){
        return width*length;
    }
}
