package Test;

import java.util.*;

public class Tcourse {

    private String moduleCode;
    private int studyYear; // 2021/2022
    private String courseName ;

    private int tes;
    private int security;
    private int llc;
    private int project;
    private int prog;

    Tgrade tgrade;
    private Map<Tstudent, Tgrade> std;
    private List<Tgrade> list;


    public Tcourse(String moduleCode, int studyYear, String courseName){
        this.moduleCode = moduleCode;
        this.studyYear = studyYear;
        this.courseName = courseName;
        this.std = new HashMap<Tstudent, Tgrade>();
        this.list = new ArrayList<Tgrade>();
    }
    public int getStudyYear() {
        return this.studyYear;
    }

    public String getModuleCode() {
        return this.moduleCode;
    }

    public String getCourseName() {
        return this.courseName;
    }

    public void setProject(int project) {
        this.project = project;
    }

    public void setLlc(int llc) {
        this.llc = llc;
    }

    public void setSecurity(int security) {
        this.security = security;
    }

    public void setTes(int tes) {
        this.tes = tes;
    }

    public void setProg(int prog) {
        this.prog = prog;
    }
    public int getProject() {
        return this.project;
    }

    public int getSecurity() {
        return this.security;
    }

    public int getTes() {
        return this.tes;
    }

    public int getLlc() {
        return this.llc;
    }

    public int getProg() {
        return this.prog;
    }

    public void addSom(Tstudent tsudent, Tgrade tgrade){
        std.put(tsudent, tgrade);
        System.out.println("Strudent: " + tsudent.getName() + " || Course: " + getCourseName() + " || Grade: " + list);
    }

    public void addGrade(Tgrade tgrade){
        list.add(tgrade);
        System.out.println("Added");
    }
}
