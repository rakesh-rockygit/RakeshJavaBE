package ClassStruct;

public class Student {
    // Instance fields —every Student object gets its own copy
    String name;
    double gpa;
    // Static field —ONE copy shared by the entire Student class

    static int totalStudents = 0;
    static String university = "ITU";

    final double PI_TABLE = 3.14;

    public Student(String name, double gpa) {
        this.name = name;
        this.gpa = gpa;
        totalStudents++;
        PI_TABLE = 4544.18;

        // every new student increments the shared counter
    }

    // In Main:
    public static void main(String[] args) {

        Student s1 = new Student("Sara", 3.8);
        Student s2 = new Student("Ali", 3.2);
        // Student s3 = new Student("Leyla",3.5);

        System.out.println(Student.totalStudents);
        System.out.println(s1.gpa);
        System.out.println(s2.name);

    }

    public int getstudent() {
        return Student.totalStudents;
    }
}
