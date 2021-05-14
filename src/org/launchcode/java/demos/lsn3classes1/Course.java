package org.launchcode.java.demos.lsn3classes1;

import java.util.HashMap;

public class Course {
    private String title;
    private Teacher teacher;
    private int credits;
    private HashMap<Student, Double> students = new HashMap<>();

    public String getTitle() {
        return title;
    }

    public void setTitle(String aTitle) {
        title = aTitle;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher aTeacher) {
        teacher = aTeacher;
    }

    public int getCredits() {
        return credits;
    }

    public void setCredits(int someCredits) {
        credits = someCredits;
    }

    public void addStudent(Student aStudent, Double gpa) {
        students.put(aStudent, gpa);
    }

    public Double getStudentGpa(Student student) {
        return students.get(student);
    }

    public void setStudentGpa(Student student, Double aGpa) {
        students.put(student, aGpa);
    }
}
