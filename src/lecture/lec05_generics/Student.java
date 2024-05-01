package lecture.lec05_generics;

public class Student implements Person {
    private String firstName;
    private String lastName;
    private int matNr;
    private float finalGrade;

    public Student(String firstName, String lastName, int matNr, float finalGrade) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.matNr = matNr;
        this.finalGrade = finalGrade;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getMatNr() {
        return matNr;
    }

    public float getFinalGrade() {
        return finalGrade;
    }

    @Override
    public String toString() {
        return "Student{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", matNr=" + matNr +
                ", finalGrade=" + finalGrade +
                '}';
    }
}
