package shapes;

/** Create a variable of the type Rectangle named box1 and assign it a new instance of the Rectangle class with a width of 4 and a length of 5*/

public class ShapesTest {
    public static void main(String[] args){
        Rectangle box1 = new Rectangle(5,4); //declaring the variable called box1 of TYPE Rectangle
        System.out.println("Rectangle's perimeter is: " + box1.getPerimeter());
        System.out.println("Rectangle's area is: " + box1.getArea());

        /** Create a variable of the type Rectangle named box2 and assign it a new instance of the Square class that has a side value of 5:*/

        Rectangle box2 = new Square(5);
//        System.out.println("Square's perimeter is: " + box2.getPerimeter());
//        System.out.println("Square's area is: " + box2.getArea());

        System.out.println("Overridden Square's perimeter is: " + box2.getPerimeter() + "." );
        System.out.println("Overridden Square's area is: " + box2.getArea()+ "." );



    }
}
//morning push
