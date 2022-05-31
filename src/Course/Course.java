package Course;

import java.util.*;
import Class.*;


public class Course {
    private String moduleCode;
    private int studyYear; // 2021/2022
    private String courseName ;
    private boolean passedCourse;
    private boolean failedCourse = false;
    Course course;
    Grade grade;


    private Map<Student,Grade> studentMap;

    private Map<String, Integer> courseD;

    public Course(String moduleCode, String courseName ,int studyYear){
        this.moduleCode = moduleCode;
        this.courseName = courseName;
        this.studyYear = studyYear;
        this.studentMap = new HashMap<Student,Grade>();

        this.courseD = new HashMap<String,Integer>();
    }
    public String getModuleCode(){
        return this.moduleCode;
    }
    public int getStudyYear() {
        return this.studyYear;
    }

    public boolean isFailedCourse() {
        return failedCourse;
    }

    public boolean isPassedCourse() {
        return passedCourse;
    }
    public String getCourseName(){
        return this.courseName;
    }

    public void addStudent(Student student, Grade grade){
        studentMap.put(student,grade);
        System.out.println("Student: " + student.getStudentName() + " || Grade: " + grade.getGrade());
    }

    public void  addCourseD(String string, Integer integer){
        courseD.put(string, integer);
        System.out.println("Course: " + course.getCourseName() + " || Grade: " + grade.getGrade());
    }



}
