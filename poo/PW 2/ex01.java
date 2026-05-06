public class TestRectangle {

    public static void main(String[] args) {

        Rectangle r1 = new Rectangle();
        Rectangle r2 = new Rectangle();

        r1.length = 5;
        r1.width = 5;

        r2.length = 6;
        r2.width = 2;

        System.out.println("r1 area: " + r1.area());
        System.out.println("r1 perimeter: " + r1.perimeter());

        System.out.println("r2 area: " + r2.area());
        System.out.println("r2 perimeter: " + r2.perimeter());

        if(r1.isSquare()){
            System.out.println("r1 is square");
        }

        if(r2.isSquare()){
            System.out.println("r2 is square");
        }

        System.out.println(r1);
        System.out.println(r2);
    }
}

class Rectangle {

    double length;
    double width;

    double area(){
        return length * width;
    }

    double perimeter(){
        return 2 * (length + width);
    }

    boolean isSquare(){
        return length == width;
    }

    public String toString(){
        return "Rectangle: length = " + length + " width = " + width;
    }
}