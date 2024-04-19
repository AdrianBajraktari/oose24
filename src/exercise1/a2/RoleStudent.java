package exercise1.a2;

public class RoleStudent implements IPerson {
    private IPerson self;
    private String studySubject;
    private int matNr;

    public RoleStudent(IPerson self, int matNr, String studySubject) {
        this.self = self;
        this.matNr = matNr;
        this.studySubject = studySubject;
    }

    public String getNameAndMatNr() {
        return this.getName() + ", " + this.matNr;
    }

    public String getDetails() {
        return this.getNameAndMatNr() + ", studies " + this.studySubject;
    }

    @Override
    public String getName() {
        return this.self.getName();
    }
}
