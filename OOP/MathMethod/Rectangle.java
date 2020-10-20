package OOP.MathMethod;

public class Rectangle {
    double length, width, area, circumference;

    Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
        area = length * width;
        circumference =  2 * ( length + width );
    }

    double returnArea() {
        return area;
    }
    double returnCircumference(){
        return circumference;
    }
}
