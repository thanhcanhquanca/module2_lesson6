package circle_cylinder;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(5,"red");
        Cylinder cylinder = new Cylinder(5,"blue",10);

        System.out.println(cylinder);
        System.out.println(circle);
    }
}
