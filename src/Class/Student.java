package Class;

import java.util.*;
import Course.*;

public class Student { //Do I Extend class Student?
    private int studentNumber;
//    private int grade;
    private String name;
    private String gender;
    private String group;
    private String fieldOfStudy;
    private String passedCourse; // Return pass, so later can sum up individual passed student pass = 1
    private String failedCourse;

    private Map<Course,Grade> studentGradeMap;

    public Student(String name, int studentNumber, String gender, String group, String fieldOfStudy){
        this.name = name;
        this.studentNumber = studentNumber;
        this.gender = gender;
        this.group = group;
        this.fieldOfStudy = fieldOfStudy;
        this.studentGradeMap = new HashMap<Course,Grade>();
    }
    public int getStudentNumber(){
        return this.studentNumber;
    }
    public String getStudentName(){
        return this.name;
    }
    public String getPassedCourse(){
        return this.passedCourse;
    }
    public String getFailedCourse(){
        return this.failedCourse;
    }
    public String getGender() {
        return this.gender;
    }
    public String getStudentGroup(){
        return this.group;
    }
    public String getFieldOfStudy(){
        return this.fieldOfStudy;
    }
//    public int getGrade(){
//        return this.grade;
//    }


    public void setGradez(Course course, Grade grade){
        studentGradeMap.put(course,grade);
        System.out.println("Student: " + course.getCourseName() + " || Grade: " + grade.getGrade());

    }

    public void printStudentDetails(){
        System.out.println("Student: " + getStudentName() + "\n" +
                "Student-ID: " + getStudentNumber() + "\n" +
                "Gender: " + getGender() + "\n" +
                "Group: " + getStudentGroup() + "\n" +
                "Field of Study: " + getFieldOfStudy() );
    }
}
