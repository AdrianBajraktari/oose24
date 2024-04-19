package exercise1.a2;

public class RolePhD implements IPerson {
    private IPerson self;
    private String studySubject;
    private String chair;

    public RolePhD(IPerson self, String chair, String studySubject) {
        this.self = self;
        this.chair = chair;
        this.studySubject = studySubject;
    }

    public String getWorkingDetails() {
        return this.getName() + " is a PhD student at the " + this.chair + " chair, studying " + this.studySubject;
    }

    @Override
    public String getName() {
        return this.self.getName();
    }
}
