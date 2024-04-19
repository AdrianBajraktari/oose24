package exercise1.a2;

public class Person implements IPerson {
    private String firstname;
    private String lastname;
    private int age;

    public Person(String firstname, String lastname, int age) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.age = age;
    }

    @Override
    public String getName() {
        return this.firstname + this.lastname;
    }
}
