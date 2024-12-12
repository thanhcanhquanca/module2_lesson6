package demo;

public class Demo {
    private static int totalStudents = 0;

    private String name;
    private String studentId;

    public Demo(String name, String studentId) {
        this.name = name;
        this.studentId = studentId;
        totalStudents++;
    }


    public String getName() {
        return name;
    }


    public String getStudentId() {
        return studentId;
    }

    public static int getTotalStudents() {
        return totalStudents;
    }


    public void displayInfo() {
        System.out.println("Student Name: " + name);
        System.out.println("Student ID: " + studentId);
    }
}
