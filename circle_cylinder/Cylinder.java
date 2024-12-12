package circle_cylinder;

public class Cylinder extends Circle{
    private double height;

    public Cylinder(double radius, String coler, double height) {
        super(radius, coler);
        this.height = height;
    }

    public Cylinder(double height) {
        this.height = height;
    }

    public void volume(){
        double v = this.height * getRadius();
    }

    @Override
    public String toString() {
        return "Cylinder{" + " radius " + getRadius()
                + " coler " + getColer()
                +
                " height =" + height +
                '}';
    }
}
