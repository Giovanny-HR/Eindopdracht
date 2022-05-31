package Test;

import Course.Course;

import java.util.HashMap;

public class Tstudent {
    private int studentNumber;
    private String name;
    private String gender;
    private String group;
    private String fieldOfStudy;

    public Tstudent(String name, int studentNumber, String gender, String group, String fieldOfStudy){
        this.name = name;
        this.studentNumber = studentNumber;
        this.gender = gender;
        this.group = group;
        this.fieldOfStudy = fieldOfStudy;
//        this.studentGradeMap = new HashMap<Course, Grade>();
    }

    public String getName() {
        return this.name;
    }

    public int getStudentNumber() {
        return this.studentNumber;
    }

    public String getGender() {
        return this.gender;
    }

    public String getGroup() {
        return this.group;
    }

    public String getFieldOfStudy() {
        return this.fieldOfStudy;
    }


}
