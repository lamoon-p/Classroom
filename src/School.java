import java.util.ArrayList;
import java.util.List;

public class School {

    private List students = new ArrayList();
    private List teachers = new ArrayList();
    private List classes = new ArrayList();

    public List getStudents() {
        return students;
    }

    public void setStudents(List students) {
        this.students = students;
    }

    public List getTeachers() {
        return teachers;
    }

    public void setTeachers(List teachers) {
        this.teachers = teachers;
    }

    public List getClasses() {
        return classes;
    }

    public void setClasses(List classes) {
        this.classes = classes;
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public void removeStudent(Student student) {
        students.remove(student);
    }

    public void addTeacher(Teacher teacher) {
        teachers.add(teacher);
    }

    public void removeTeacher(Teacher teacher) {
        teachers.remove(teacher);
    }

    // create classes by add students and teachers.
        // get input from user on how many students and teachers want to join a classroom.
        // create 2 loops each to add students or teachers
        // inside those loops it needs to ask for index of students or teachers whose to join a classroom.

    public void createClasses() {
        List classroom = new ArrayList();
    }



    // if a classroom is empty. a function will set it to null.


    @Override
    public String toString() {
        return "School{" +
                "students=" + students +
                ", teachers=" + teachers +
                ", classes=" + classes +
                '}';
    }
}
