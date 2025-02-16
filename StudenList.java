
package assigment11;
import java.util.ArrayList;
import java.util.Date;

public class StudenList {

    private ArrayList<Student> studentList;

    public StudenList() {
        studentList = new ArrayList<>();
    }

    public void AllStudents() {
        for (Student student : studentList) {
            student.display();
            System.out.println("--------------------");
        }
    }

    public Student findStudentById(String idToFind) {
        for (Student student : studentList) {
            if (student.getStudentId().equals(idToFind)) {
                return student;
            }
        }
        return null; 
    }

    public boolean deleteStudentById(String idToDelete) {
        for (Student student : studentList) {
            if (student.getStudentId().equals(idToDelete)) {
                studentList.remove(student);
                return true; 
            }
        }
        return false; 
    }

    public boolean editStudentById(String idToEdit, String newFullName, Date newDateOfBirth, String newMajor, float newGpa) {
        for (Student student : studentList) {
            if (student.getStudentId().equals(idToEdit)) {
                student.StudentInfo(idToEdit, newFullName, newDateOfBirth, newMajor, newGpa);
                return true; 
            }
        }
        return false; 
    }

    public void addStudent(Student student) {
        studentList.add(student);
    }
}