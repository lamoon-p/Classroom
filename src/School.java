import java.util.ArrayList;
import java.util.List;

public class School {

    private final List<Student> students = new ArrayList<>();
    private final List<Teacher> teachers = new ArrayList<>();
    private final List<Classroom> classes = new ArrayList<>();

    public List<Student> getStudents() {
        return students;
    }

    public List<Teacher> getTeachers() {
        return teachers;
    }

    public List<Classroom> getClasses() {
        return classes;
    }

    public void addStudent(Student student) {
        students.add(student);
        System.out.println("StudentID " + student.getStudentID() + " added to school!");
    }

    public void removeStudent(Student student) {
        students.remove(student);
        System.out.println("StudentID " + student.getStudentID() + " removed from school!");
    }

    public void addTeacher(Teacher teacher) {
        teachers.add(teacher);
        System.out.println("TeacherID " + teacher.getTeacherID() + " added to school!");
    }

    public void removeTeacher(Teacher teacher) {
        teachers.remove(teacher);
        System.out.println("TeacherID " + teacher.getTeacherID() + " removed from school!");
    }

    public void addClasses(Classroom classroom) {
        classes.add(classroom);
        System.out.println(classroom.getClassName() + " class added to school!");
    }

    public void removeClasses(Classroom classroom) {
        classes.remove(classroom);
        System.out.println(classroom.getClassName() + " class removed from school!");
    }

    @Override
    public String toString() {
        return "School{" +
                "students=" + students +
                ", teachers=" + teachers +
                ", classes=" + classes +
                '}';
    }
}
