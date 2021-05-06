package shapes;

abstract class Quadrilateral extends Shape implements Measurable{

protected double width;
protected double length;

public Quadrilateral(double userLength,double userWidth) {
    this.length = userLength;
    this.width = userWidth;
}

public abstract void setLength(double userLength);
public abstract void setWidth(double userWidth);

public double getLength(){
    return this.length;
}

public double getWidth(){
    return this.width;
}

public double getArea(){
    return length * width;
}

public double getPerimeter(){
    return (length * 2) + (width * 2);
    }

}
