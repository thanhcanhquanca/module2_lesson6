package triang;

public class Shape {
    private String color;


    public Shape() {
        this.color = "blue";
    }

    public Shape(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String toString() {
        return "Color: " + color;
    }
}
