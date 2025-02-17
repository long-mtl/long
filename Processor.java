
package assigment11;
import java.util.Date;

public class Processor {
    public static void main(String[] args) {
        StudenList studentList = new StudenList();

        Student student1 = new Student("1", "Thanh Long", new Date(2006, 3, 8), "Computer Science", 3.0f);
        Student student2 = new Student("2", "Thanh Long2", new Date(2006, 3, 3), "Mathematics", 3.0f);

        studentList.addStudent(student1);
        studentList.addStudent(student2);

        studentList.AllStudents();

        Student foundStudent = studentList.findStudentById("01");
        if (foundStudent != null) {
            foundStudent.display();
        } else {
            System.out.println("Student not found.");
        }
        boolean editSuccess = studentList.editStudentById("1", "Thanh Long2", new Date(2006, 3, 8), "Computer Science", 3.0f);
        if (editSuccess) {
            System.out.println("Student information updated.");
        } else {
            System.out.println("Failed to update student information.");
        }

        boolean deleteSuccess = studentList.deleteStudentById("2");
        if (deleteSuccess) {
            System.out.println("Student deleted successfully.");
        } else {
            System.out.println("Failed to delete student.");
        }

        studentList.AllStudents();
    }
}
