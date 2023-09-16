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
        studentRequest3.setStudentID(666);
        studentRequest3.setStudentName(null);

        // create 2 teachers
        TeacherRequest teacherRequest1 = new TeacherRequest();
        teacherRequest1.setTeacherID(1);
        teacherRequest1.setTeacherName("David");

        TeacherRequest teacherRequest2 = new TeacherRequest();
        teacherRequest2.setTeacherID(2);
        teacherRequest2.setTeacherName("Alex");


        Student student1 = (Student) verifyAndSave(studentRequest1);

        Student student2 = (Student) verifyAndSave(studentRequest2);

        Student student3 = (Student) verifyAndSave(studentRequest3);
        Student student4 = (Student) verifyAndSave(studentRequest4);

        Teacher teacher1 = (Teacher) verifyAndSave(teacherRequest1);

        Teacher teacher2 = (Teacher) verifyAndSave(teacherRequest2);


        // create a school
        School school1 = new School();

        school1.addStudent(student1);
        school1.addStudent(student2);
        school1.addStudent(student3);
        school1.addStudent(student1);


        System.out.println(student1);
        System.out.println(student2);
        System.out.println(student4);




    }
    // verify students and teachers data.
    public static Object verifyAndSave(Object object) {
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
            System.out.println("A student verified and saved!");

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
            System.out.println("A teacher verified and saved!");

            return teacher;
        }

        return object;
    }
}
