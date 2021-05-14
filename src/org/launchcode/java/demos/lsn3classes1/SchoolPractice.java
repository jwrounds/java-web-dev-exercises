package org.launchcode.java.demos.lsn3classes1;

public class SchoolPractice {
    public static void main(String[] args) {
        // Instantiate your Student class for part 2 here!
        Student javaStudent = new Student();
        javaStudent.setName("Me");
        javaStudent.setNumberOfCredits(1);
        javaStudent.setGpa(4.0);

        Teacher javaTeacher = new Teacher();
        javaTeacher.setFirstName("John");
        javaTeacher.setLastName("Smith");
        javaTeacher.setYearsTeaching(10);
        javaTeacher.setSubject("Java");

        Course javaCourse = new Course();
        javaCourse.setTitle("Java 101");
        javaCourse.setTeacher(javaTeacher);
        javaCourse.addStudent(javaStudent, 4.0);
    }
}
