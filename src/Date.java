/**
 * The class <code>Date</code> represents a Date.
 * @author Diego Baldassare
 */
public class Date {

    private int year, month, day;

    public Date(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    //Getters
    public int getYear() {
        return year;
    }
    public int getMonth() {
        return month;
    }
    public int getDay() {
        return day;
    }

    public String toString() {
        return getYear() + "-" + getMonth() + "-" + getDay();
    }

    public boolean before(Date anotherDate) {
        if (getYear() <= anotherDate.getYear())
            if (getMonth() <= anotherDate.getMonth())
                if (getDay() < anotherDate.getDay())
                    return true;
        return false;
    }

    public boolean after(Date anotherDate) {
        if (getYear() >= anotherDate.getYear())
            if (getMonth() >= anotherDate.getMonth())
                if (getDay() > anotherDate.getDay())
                    return true;
        return false;
    }
    
    public boolean between(Date from, Date until) {
        if (after(from) && before(until))
            return true;
        return false;
    }
}
