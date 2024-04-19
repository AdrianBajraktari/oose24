package exercise1.a2;

public class RoleTutor implements IPerson {
    private IPerson self;
    private String module;
    private int hours;
    //Left times array out because arrays in Java need a bit more overhead.

    public RoleTutor(IPerson self, int hours, String module) {
        this.self = self;
        this.hours = hours;
        this.module = module;
    }

    public String getWorkingDetails() {
        return this.getName() + " has an " + this.hours + "h contract as a tutor for " + this.module;
    }

    @Override
    public String getName() {
        return this.self.getName();
    }
}
