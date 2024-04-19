package extra1;

public class Student {
    private String firstname;
    private String lastname;
    private int age;
    private int matriculationNumber;

    public Student(String firstname, String lastname, int age, int matNumber) {
        this.age = age;
        this.firstname = firstname;
        this.lastname = lastname;
        this.matriculationNumber = matNumber;
    }

    public void print() {
        System.out.println(this.firstname + " " + this.lastname + ", " + this.age + ", " + this.matriculationNumber);
    }
}
