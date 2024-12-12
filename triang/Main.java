package triang;

public class Main {
    public static void main(String[] args) {
        Triangle triangle = new Triangle(12, 4, 23);
        triangle.getArea();
        triangle.getPerimeter();

        System.out.println(triangle);
    }
}
