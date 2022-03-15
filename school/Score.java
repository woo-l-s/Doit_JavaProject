package school;

public class Score {
    int StudentID;
    Subject subject;
    int point;

    public Score(int StudentID, Subject subject, int point){
        this.StudentID = StudentID;
        this.subject = subject;
        this.point = point;
    }

    public int getStudentID(){
        return StudentID;
    }

    public void setStudentID(int StudentID){
        this.StudentID = StudentID;
    }

    public Subject getSubject(){
        return subject;
    }

    public void setSubject(Subject subject){
        this.subject = subject;
    }

    public int getPoint(){
        return point;
    }

    public void setPoint(int point){
        this.point = point;
    }

    public  String toString(){
        return "학번"+ StudentID+"," + subject.getSubjectName() + ":" + point;
    }
}
