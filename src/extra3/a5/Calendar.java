package extra3.a5;

public class Calendar {
    int year;

    public Calendar(int year) {
        this.year = year;
    }

    public boolean isLeapYear() {
        return (this.year > 1900 && this.year <= 2000
                && this.year % 4 == 0)
                && (this.year % 100 != 0 || this.year % 400 == 0);
    }
}
