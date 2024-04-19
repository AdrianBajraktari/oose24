package exercise1.a2;

public class ClientCode {
    public static void main(String[] args) {
        Person alice = new Person("Alice", "Wonderland", 24);

        RoleStudent aliceStudent = new RoleStudent(alice, 9327943, "computer science");
        RoleTutor aliceTutor = new RoleTutor(alice, 8, "oose");
        RolePhD alicePhD = new RolePhD(alice, "SSE", "software engineering");

        System.out.println(aliceStudent.getDetails());
        System.out.println(aliceTutor.getWorkingDetails());
        System.out.println(alicePhD.getWorkingDetails());
    }
}
