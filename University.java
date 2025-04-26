public class University {
    String universityName = "Amrita Vishwa Vidyapeetham";

    class Department {
        String deptname = "Computer Science";
        int deptcode = 101;

        void displayDepartmentInfo() {
            System.out.println("Department Name: " + deptname);
            System.out.println("Department Code: " + deptcode);
        }
    }

    class Student {
        String studentName = "John Doe";
        int studentID = 12345;

        void displayStudentInfo() {
            System.out.println("Student Name: " + studentName);
            System.out.println("Student ID: " + studentID);
        }
    }

    public static void main(String[] args) {
        University uni = new University();
        System.out.println("University Name: " + uni.universityName);
        System.out.println("--Department info----");

        University.Department dept = uni.new Department();
        dept.displayDepartmentInfo();
        System.out.println("--Student info----");

        University.Student student = uni.new Student();
        student.displayStudentInfo();
    }
}