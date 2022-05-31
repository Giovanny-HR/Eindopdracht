package Class;


import java.util.*;
import Course.*;

public class Grade {
    private float gradeScore;
    private float maxGrade = 10.0f;
    private float minGrade = 1.0f;
    private boolean passedGrade = true;
    private boolean failedGrade = false;

    private Map<Course, Integer> gradeD ;

    public Grade(float gradeScore){
        this.gradeScore = gradeScore;
        this.gradeD = new HashMap<Course,Integer>();
    }

    public float getMaxGrade(){
        return this.maxGrade;
    }
    public float getMinGrade(){
        return this.minGrade;
    }

    public boolean getPassedStudent(){
        return this.passedGrade;
    }

    public boolean getFailedGrade() {
        return this.failedGrade;
    }
    public float getGrade(){
        return this.gradeScore;
    }
    public void checkGrade(){
        if( gradeScore >= 5.5f){
            getPassedStudent();
            System.out.println("Succes");
        }
        else{
            getFailedGrade();
            System.out.println("Fail");
        }
    }

    public void addGrade(Course course, Integer integer){
        gradeD.put(course, integer);
        System.out.println("Course: " + course.getCourseName() + " || Grade: " + getGrade());
    }

    /*
    if(getGrade() > getMaxGrade() || getGrade() < getMinGrade()){
            System.out.println("Error! " + gradeScore + " is  > || < than..");
        }
     */

}
