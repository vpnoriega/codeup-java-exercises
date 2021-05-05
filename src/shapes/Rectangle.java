package shapes;

public class Rectangle {
    protected double length;
    protected double width;

    public Rectangle(int length, int width){
        this.length = length;
        this.width = width;
    }

    public double getArea(){
        return length * width;

    }

    public double getPerimeter(){
        return (length * 2) + (width * 2);
    }

}
