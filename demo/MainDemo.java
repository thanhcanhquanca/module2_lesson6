package demo;

public class MainDemo {
    public static void main(String[] args) {
        Demo student1 = new Demo("Trang", "S001");
        Demo student2 = new Demo("Nguyet", "S002");

        student1.displayInfo();
        student2.displayInfo();

        System.out.println("Total Students: " + Demo.getTotalStudents());
    }
}

class Meo{
    int a = 5;
}
