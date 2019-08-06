package School;

import java.util.ArrayList;
import java.util.Objects;

public class Student {
    private static int nextStudentId = 1;
    private String name;
    private int studentId;
    private int numOfCredits;
    private double gpa;
    private ArrayList<Student> roster;
    //private Transcript transcript;
    // private Student student;
    //

    public Student(String name, int studentId, int numOfCredit, double gpa){
        this.name = name;
        this.studentId = studentId;
        this.numOfCredits = numOfCredit;
        this.gpa = gpa;
    }


    public Student(String name, int studentId) {
        this(name, studentId, 0, 0);
    }

    public Student(String name) {
        this(name, nextStudentId);
        nextStudentId++;
    }

    public void addGrade(int courseCredits, double grade){
        // Update the appropriate fields: numberOfCredits, gpa
        double total_score = gpa * numOfCredits;
        numOfCredits += courseCredits;
        total_score += (grade * courseCredits);
        gpa = total_score/numOfCredits;



    }

//    public String getGradeLevel() {
//        // Determine the grade level of the student based on numberOfCredits
//    }

    public static int getNextStudentId() {
        return nextStudentId;
    }

    public static void setNextStudentId(int nextStudentId) {
        Student.nextStudentId = nextStudentId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public int getNumOfCredits() {
        return numOfCredits;
    }

    public void setNumOfCredits(int numOfCredits) {
        this.numOfCredits = numOfCredits;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    //behaviours

    //add student

    public boolean addStudent(Student s){
        if(!this.roster.contains ( s )) {
            this.roster.add ( s );
            return true;
        }
        return false;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Student)) return false;
        Student student = (Student) o;
        return getStudentId ( ) == student.getStudentId ( );
    }

    @Override
    public int hashCode() {
        return Objects.hash ( getStudentId ( ) );
    }
//grade student

    //drop student

    public void dropStudent(Student s){
        this.roster.remove ( s );
    }

    //print roaster


    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", studentId=" + studentId +
                ", numOfCredits=" + numOfCredits +
                ", gpa=" + gpa +
                '}';
    }


    public static void main(String[] args) {
        Course lc101 = new Course ();
        Student s = new Student ("Keanue Reeves");
        Student s2 = new Student ("Shreya ");
        s.addGrade ( 1, 3.5);
        s.addGrade ( 3, 4);
        System.out.println (s.getGpa ());


    }

    //output : name ID: 1 credit 0  gpa : 0.0
}