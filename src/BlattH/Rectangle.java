package BlattH;

public class Rectangle extends GeometricObject{
    private int width;
    private int height;

    Rectangle(int x, int y, int width, int height){
        super(x,y);
        this.width = width;
        this.height = height;
    }

    public int getHeight(){
        return height;
    }

    public int getWidth(){
        return width;
    }

    public void setWidth(int width){
        this.width = width;
    }
    public void setHeight(int height){
        this.height = height;
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
        Rectangle other = (Rectangle) obj;
        return width == other.width &&
                height == other.height;
    }
        public double getArea(){
        return getHeight() * getWidth();
        }

        public double getCircumference(){
        return (getHeight() + getWidth()) * 2;
        }

@Override
    public String toString() {
        super.toString();

        return new StringBuilder()
                        .append(", Rectangle")
                        .append(", width = ").append(width)
                        .append(", height = ").append(height)
                        .toString();
    }
}
