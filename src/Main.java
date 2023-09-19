public class Main {

    public static void main(String[] args) {
	// write your code here
        // create 3 students
        StudentRequest studentRequest1 = new StudentRequest();
        studentRequest1.setStudentID(1);
        studentRequest1.setStudentName("John");

        StudentRequest studentRequest2 = new StudentRequest();
        studentRequest2.setStudentID(2);
        studentRequest2.setStudentName("Bob");

        StudentRequest studentRequest3 = new StudentRequest();
        studentRequest3.setStudentID(3);
        studentRequest3.setStudentName("Jane");

        StudentRequest studentRequest4 = new StudentRequest();
        studentRequest4.setStudentID(666);
        studentRequest4.setStudentName("Brie");

        // create 2 teachers
        TeacherRequest teacherRequest1 = new TeacherRequest();
        teacherRequest1.setTeacherID(1);
        teacherRequest1.setTeacherName("David");

        TeacherRequest teacherRequest2 = new TeacherRequest();
        teacherRequest2.setTeacherID(2);
        teacherRequest2.setTeacherName("Alex");

        TeacherRequest teacherRequest3 = new TeacherRequest();
        teacherRequest3.setTeacherID(3);
        teacherRequest3.setTeacherName("Dan");

        TeacherRequest teacherRequest4 = new TeacherRequest();
        teacherRequest4.setTeacherID(4);
        teacherRequest4.setTeacherName("Prof. Sharp");


        Student student1 = (Student) verify(studentRequest1);
        Student student2 = (Student) verify(studentRequest2);
        Student student3 = (Student) verify(studentRequest3);
        Student student4 = (Student) verify(studentRequest4);

        Teacher teacher1 = (Teacher) verify(teacherRequest1);
        Teacher teacher2 = (Teacher) verify(teacherRequest2);
        Teacher teacher3 = (Teacher) verify(teacherRequest3);
        Teacher teacher4 = (Teacher) verify(teacherRequest4);

        School school1 = new School();

        school1.addStudent(student1);
        school1.addStudent(student2);
        school1.addStudent(student3);
        school1.addStudent(student4);
        school1.addTeacher(teacher1);
        school1.addTeacher(teacher2);
        school1.addTeacher(teacher3);
        school1.addTeacher(teacher4);

        Classroom englishClass = new Classroom();
        englishClass.setClassName("English");
        englishClass.setTeacher(teacher1);
        englishClass.addStudent(student1);
        englishClass.addStudent(student2);
        englishClass.addStudent(student3);

        Classroom mathClass = new Classroom();
        mathClass.setClassName("Mathematics");
        mathClass.setTeacher(teacher2);
        mathClass.addStudent(student1);
        mathClass.addStudent(student2);
        mathClass.addStudent(student3);

        Classroom potionClass = new Classroom();
        potionClass.setClassName("Potion Making");
        potionClass.setTeacher(teacher4);
        potionClass.addStudent(student1);
        potionClass.addStudent(student2);

        school1.addClasses(englishClass);
        school1.addClasses(mathClass);

        school1.removeStudent(student4);
        school1.removeTeacher(teacher3);
        school1.removeClasses(potionClass);


    }

    public static Object verify(Object object) {
        if (object instanceof StudentRequest) {

            if (((StudentRequest) object).getStudentID() == 0) {
                System.out.println("Please enter a proper ID");
                return null;
            }

            if (((StudentRequest) object).getStudentName() == null) {
                System.out.println("Please enter a proper name");
                return null;
            }

            Student student = new Student();
            student.setStudentID(((StudentRequest) object).getStudentID());
            student.setStudentName(((StudentRequest) object).getStudentName());
            System.out.println("StudentID " + ((StudentRequest) object).getStudentID() + " verified!");

            return student;
        }

        if (object instanceof TeacherRequest) {

            if (((TeacherRequest) object).getTeacherID() == 0) {
                System.out.println("Please enter a proper ID");
                return null;
            }

            if (((TeacherRequest) object).getTeacherName() == null) {
                System.out.println("Please enter a proper name");
                return null;
            }

            Teacher teacher = new Teacher();
            teacher.setTeacherID(((TeacherRequest) object).getTeacherID());
            teacher.setTeacherName(((TeacherRequest) object).getTeacherName());
            System.out.println("TeacherID " + ((TeacherRequest) object).getTeacherID() + " verified!");

            return teacher;
        }

        return object;
    }
}