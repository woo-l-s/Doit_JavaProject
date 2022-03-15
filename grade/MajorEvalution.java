package grade;

public class MajorEvalution implements GradeEvaluation{
    public String getGrade(int point){
        String grade;

        if(point > 95 && point <=100)
            grade = "S";
        else if(point >=90){
            grade = "A";
            //what difference?
            //grade = new String("A");
        }
        else if(point >=80){
            grade = "B";
        }
        else if(point >=70){
            grade = "C";
        }
        else if(point >=60){
            grade = "D";
        }
        else
            grade = "F";
        return grade;
    }
}
