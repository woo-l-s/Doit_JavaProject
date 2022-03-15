package school.report;

import java.util.ArrayList;
import grade.*;
import school.*;
import utils.Define;

public class GenerateGradeReport {
    School school = School.getInstance();

    public static final String TITLE = "수강생 학점\t\t\n";
    public static final String HEADER = "이름 | 학번 | 필수과목 | 점수 \n ";
    public static final String LINE = "------------------------------------------------\n";

    private StringBuffer buffer = new StringBuffer();

    public String getReport(){
        ArrayList<Subject> subjectList = school.getSubjectList();

        for(Subject subject : subjectList){
            makeHeader(subject);
            makeBody(subject);
            makeFooter();
        }
        return buffer.toString();
    }

    public void makeHeader(Subject subject){
        buffer.append(GenerateGradeReport.LINE);
        buffer.append("\n" + subject.getSubjectName());
        buffer.append(GenerateGradeReport.TITLE);
        buffer.append(GenerateGradeReport.HEADER);
        buffer.append(GenerateGradeReport.LINE);
    }

    public void makeBody(Subject subject){
        ArrayList<Student> studentList = subject.getStudentList();

        for(int i =0;i<studentList.size(); i++){
            Student student = studentList.get(i);
            buffer.append(student.getStudentName());
            buffer.append(" | ");
            buffer.append(student.getStudentID());
            buffer.append(" | ");
            buffer.append(student.getMajorSubject().getSubjectName() + "\t");
            buffer.append(" | ");

            getScoreGrade(student, subject.getSubjectID());

            buffer.append("\n");
            buffer.append(LINE);
        }
    }

    public void getScoreGrade(Student student, int subjectID){
        ArrayList<Score> scoresList = student.getScoreList();
        int majorID = student.getMajorSubject().getSubjectID();

        GradeEvaluation[] gradeEvaluations = {new BasicEvaluation(), new MajorEvalution()};

        for(int i=0; i<scoresList.size(); i++){
            Score score = scoresList.get(i);
            if(score.getSubject().getSubjectID() == subjectID){
                String grade;
                if(score.getSubject().getSubjectID() == majorID)
                    grade = gradeEvaluations[Define.SAB_TYPE].getGrade(score.getPoint());
                else
                    grade = gradeEvaluations[Define.AB_TYPE].getGrade(score.getPoint());

                buffer.append(score.getPoint());
                buffer.append(" : ");
                buffer.append(grade);
                buffer.append(" | ");
            }
        }
    }

    public void makeFooter(){
        buffer.append("\n");
    }

}
