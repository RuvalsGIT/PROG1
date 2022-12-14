package BlattH;

import org.w3c.dom.css.Rect;

public class GeoMain {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(10, 20,10,20);

        Circle c1 = new Circle(50, 100, 30);

        c1.setX(10);
        System.out.println();

        Circle c2 = new Circle(10,100,30);




        Rectangle r2 = new Rectangle(10,30,10,20);
        System.out.println(r1.equals(r2));
        System.out.println(c1.equals(c2));


        System.out.println(r1.getArea());
        System.out.println(r1.getCircumference());
        System.out.println(c1.getArea());
        System.out.println(c1.getCircumference());

        System.out.println(r1.toString());
    }
}