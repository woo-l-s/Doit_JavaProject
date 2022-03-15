package school;

import java.util.ArrayList;
import utils.Define;

public class Subject {
    private String subjectName;
    private int subjectID;
    private int grdeType;

    private ArrayList<Student> studentList = new ArrayList<Student>();

    public Subject(String subjectName, int subjectID){
        this.subjectName = subjectName;
        this.subjectID = subjectID;
        this.grdeType = Define.AB_TYPE;
    }

    public String getSubjectName(){
        return subjectName;
    }

    public void setSubjectName(String subjectName){
        this.subjectName = subjectName;
    }

    public int getSubjectID(){
        return subjectID;
    }

    public void setSubjectID(){
        this.subjectID = subjectID;
    }


    public ArrayList<Student> getStudentList(){
        return studentList;
    }

    public void setStudentList(ArrayList<Student> studentList){
        this.studentList = studentList;
    }

    public int getGrdeType(){
        return grdeType;
    }

    public void setGrdeType(int grdeType){
        this.grdeType = grdeType;
    }

    public void register(Student student){
        studentList.add(student);
    }
}
