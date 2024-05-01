package lecture.lec05_generics;

public class Professor implements Person {
    private String firstName;
    private String lastName;
    private Position pos;

    public Professor(String firstName, String lastName, Position pos) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.pos = pos;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public Position getPos() {
        return pos;
    }

    @Override
    public String toString() {
        return "Professor{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", pos=" + pos +
                '}';
    }

    public enum Position {
        W1,
        W2,
        W3;

        public int compare(Position o) {
            if(this == o) return 0;
            if(this == W1 && o == W2) return -1;
            if(this == W2 && o == W3) return -1;
            if(this == W1 && o == W3) return -1;
            if(this == W3 && o == W1) return 1;
            if(this == W3 && o == W2) return 1;
            if(this == W2 && o == W1) return 1;

            return -42;
        }
    }
}
