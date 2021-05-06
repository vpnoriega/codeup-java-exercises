package shapes;

/** Create a class named Rectangle. Should have protected properties for both length and width. */

//public class Rectangle {


//    Commented out for Abstract methods
//    protected double length;
//    protected double width;
//
//    /** Rectangle should define a constructor that accepts two numbers for length and width, and sets those properties:*/
//
//    public Rectangle(double length, double width){
//        this.length = length;
//        this.width = width;
//    }
//
//    /**Create two methods on the Rectangle class, getArea and getPerimeter that return the respective values: */
//
//    public double getArea(){
//        return length * width;
//
//    }
//
//    public double getPerimeter(){
//        return (length * 2) + (width * 2);
//    }
//}

    public class Rectangle extends Quadrilateral implements Measurable{

        public Rectangle(double userLength, double inputWidth){
            super(inputWidth, inputWidth);
        }

        public void setLength(double input){
            this.length = input;
        }

        public void setWidth(double input){
            this.width=input;
        }



    }


