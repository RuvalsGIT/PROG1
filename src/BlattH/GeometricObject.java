package BlattH;

public abstract class GeometricObject {
    private int x;
    private int y;

    GeometricObject(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public abstract double getArea();
    public abstract double getCircumference();

    public boolean equals(Object obj){
        if (this == obj) {
            return true;
        }
        if(obj == null || !obj.getClass().equals(getClass())) {
        return false;
        }
        GeometricObject other = (GeometricObject) obj;

        return x == other.x && y == other.y;
    }

    public String toString() {
               return new StringBuilder()
                        .append("Geometric::print() -> ")
                        .append("x = ").append(x)
                        .append(", y = ").append(y)
                        .toString();
    }
}

