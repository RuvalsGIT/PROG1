package BlattH;

public class Circle extends GeometricObject{
    private int radius;

    Circle(int x, int y, int radius){
    super(x,y);
    this.radius = radius;
    }

    public int getRadius(){
        return radius;
    }

    public void setRadius(int radius){
        this.radius = radius;
    }


    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null ||
                !obj.getClass().equals(getClass())) {
            return false;
        }
        /* Übereinstimmung in Eigenschaften der Basisklasse */
        if (!super.equals(obj)) {
            return false;
        }
        Circle other = (Circle) obj;
        return radius == other.radius;
    }

    public double getArea(){
        return Math.PI * Math.pow(getRadius(),2);
    }

    public double getCircumference() {
        return 2.0 * Math.PI * getRadius();
    }

    public String toString(){
        super.toString();

        return new StringBuilder()
                        .append(", Circle")
                        .append(", radius = ").append(radius)
                        .toString();
    }
}
