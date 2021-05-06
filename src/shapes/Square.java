package shapes;

/** Square should define a constructor that accepts one argument, side, and calls the parent's constructor to set both the length and width to the value of side: */

//public class Square extends Rectangle { //uses the area and perimeter methods from Rectangle class


// Commented out for Abstract methods
//    protected double side = 5; /** added to override below */
//
//    public Square(double side) {
//        super(side, side); //??still confused on why there is a super here
//
//    }
///** In the Square class, override the getArea and getPerimeter methods with the following definitions for a square */
//
//    public double getArea(){
//        return Math.pow(side,2);
//    }
//
//    public double getPerimeter(){
//        return side*4;
//    }


//}

public class Square extends Quadrilateral  {

    public Square(double userSide) {
        super(userSide, userSide);
    }
    public void setLength(double userLength){
        this.length = userLength;
        this.width = userLength;
    }

    public void setWidth(double userWidth){
        this.length = userWidth;
        this.width = userWidth;
    }

}

