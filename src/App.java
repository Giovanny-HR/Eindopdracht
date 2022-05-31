import java.util.*;

import Administrative.Administrative;
import Class.*;
import Course.Course;
import Test.*;

public class App {

    public static void main(String[] args) {

        /*
        Student john = new Student("John Whick", 1021941, "Male", "TI-1A", "CMI");
        Student sydney = new Student("Sydney Aüstria", 1031542, "Female", "TI-1G", "CMI");
        Student kevin = new Student("Kevin Hapsburg", 1081357, "Male", "TI-1F", "CMI");
        Student victoria = new Student("Victoria Kozmekov", 104469, "Female", "TI-1B", "CMI");
        Student paula = new Student("Paula Walker", 1086325, "Female", "TI-1E", "CMI");

        Course tes = new Course("TINTES01-1", "Tes", 2021);
        Course programing = new Course("TINPRO03-1","Programming" ,  2021);
        Course project = new Course("TINPR04-1", "Project",2021);
        Course database = new Course("TINDTB02-1", "Database",2021);
        Course security = new Course("TINSEC04-1","Security" ,2022);
        Course lowLevel = new Course("TINLLC01", "LowLevelComputing",2021);

        /*
        Grade johnGrade = new Grade(2.0f);
        Grade sydneyGrade = new Grade(11.0f);
        Grade kevinGrade = new Grade(4.6f);
        Grade victoriaGrade = new Grade(8.0f);
        Grade paulaGrade = new Grade(9.0f);
         */
//        tes.addCourseD("Tes", 5);
//        john.addGrade(tes, 6);


//        Administrative administrative = new Administrative();

//        john.setGrade(tes, johnGrade);

        /*
        tes.addStudent(john, johnGrade);
        programing.addStudent(sydney, sydneyGrade);
        project.addStudent(kevin, kevinGrade);
        database.addStudent(victoria, victoriaGrade);
        security.addStudent(paula, paulaGrade);
//        course.addStudent(paula, paulaGrade);

         */

//        john.printStudentDetails();


//        administrative.addSomething(john);
//        administrative.addSomething(sydney);
//        administrative.addSomething(kevin);
//        administrative.addSomething(victoria);
//        administrative.addSomething(paula);

//        administrative.printSomething();
//        administrative.amountStudent();
//        administrative.printStudent();
//        administrative.amountMale();


        Tstudent student = new Tstudent("John Whick", 1021457, "Male", "T1-A", "CMI");
//        student.setGrade(2);

        Tcourse course = new Tcourse("ABCD", 2021, "AB");
//        course.setLlc(4);

        Tgrade grade = new Tgrade(2,5,4,6,8);

        course.addSom(student, grade);







    }
}
