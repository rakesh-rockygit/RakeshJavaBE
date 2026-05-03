package StudentGpa;

public class StudentClass {

    String name;
    String studentid;
    double gpa;

    public StudentClass(String name, String studentid, double gpa) {
        this.name = name;
        this.studentid = studentid;
        this.gpa = gpa;

    }

    public String getStatus() {

        if (gpa >= 3.5) {
            return "Honour Roll";
        } else {
            return "Regular";
        }
    }

    public void updateGpa(double newGpa) {
        this.gpa = newGpa;
        // System.out.println("new gpa is :" + newGpa);
    }

    public String displayCard() {
        return " student name :" + name +
                " student id: " + studentid +
                " GPA is : " + gpa + "status: " + getStatus();
        // " Student Status : " + getStatus;
    }

    public static void main(String[] args) {

        StudentClass SG1 = new StudentClass("rakesh", "1099", 8.9);
        StudentClass SG2 = new StudentClass("rahul", "1877", 6.9);
        StudentClass SG3 = new StudentClass("vivek", "1923", 3.0);

        System.out.println(SG1.displayCard());
        System.out.println(SG2.displayCard());
        System.out.println(SG3.displayCard());

        SG3.updateGpa(3.7);
        System.out.println(SG3.displayCard());

        // SG1.studentid();
        // System.out.println(displayCard());

    }

}