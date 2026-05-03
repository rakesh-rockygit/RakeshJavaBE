package StudentGpa;

public class StudentClass {

    String name;
    String studentid;
    double gpa;
    double newGpa;

    public StudentClass(String name, String studentid, double gpa, double newGpa) {
        this.name = name;
        this.studentid = studentid;
        this.gpa = newGpa;

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
        // System.out.println( "new gpa is :" + updateGpa);
    }

    public String displayCard() {
        return " student id: " + studentid +
                " GPA is : " + gpa + "status: " + getStatus();
        // " Student Status : " + getStatus;
    }

    public static void main(String[] args) {

        StudentClass SG1 = new StudentClass("rakesh", "1099", 8.9, 9.3);
        StudentClass SG2 = new StudentClass("rahul", "1877", 6.9, 6.3);
        StudentClass SG3 = new StudentClass("vivek", "1923", 4.9, 6.2);

        System.out.println(SG1.displayCard());
        System.out.println(SG2.displayCard());
        System.out.println(SG3.displayCard());

        System.out.println(SG3.newGpa);

        // SG1.studentid();
        // System.out.println(displayCard());

    }

}