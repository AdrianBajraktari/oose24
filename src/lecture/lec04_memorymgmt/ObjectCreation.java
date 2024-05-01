package lecture.lec04_memorymgmt;

public class ObjectCreation {
    static class Student {
        int matNr;

        int getMatNr() {
            return this.matNr;
        }
        Student(int matNr) {
            this.matNr = matNr;
        }
    };

    public static void main(String[] args) {
        while(true) {
            var s = new Student(42);
        }
    }
}
