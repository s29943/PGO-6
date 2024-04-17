import java.util.ArrayList;
import java.util.Date;

public class Student {
    static  ArrayList<Student>Students=new ArrayList<Student>();
    private String FirstName;
    private String LastName;
    private String email;
    private String adress;
    private String number;
    private Date Date;
    private int semester;
    private String indexNumber;
    private ArrayList<StudyProgramme> StudyProgramme;


    public Student(String firstName, String lastName, String email, String adress, String number, Date Date) {
        this.FirstName = firstName;
        this.LastName = lastName;
        this.email = email;
        this.adress = adress;
        this.number = number;
        this.Date =Date;

        Student.Students.add(this);

        for(int i=1; i<= Students.size();i++){
            this.indexNumber= "s"+ String.valueOf(i);
        }
    }

    public void status(){

    }

    public void enrollStudent(StudyProgramme name) {
    }
    public void addGrade(int grade, String study) {
    }
}
