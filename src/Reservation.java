/**
 * Created by diegobaldassare on 9/26/15.
 */
public class Reservation {

    private Date checkInDate;
    private Date checkOutDate;
    private String client;

    public Reservation(String client, Date checkInDate, Date checkOutDate) {
        this.checkInDate = checkInDate;
        this.checkOutDate = checkOutDate;
        this.client = client;
    }

    //Getters
    public String getClient() { return client; }
    public Date getCheckInDate() { return checkInDate; }
    public Date getCheckOutDate() {
        return checkOutDate;
    }

    public boolean isReserved(Date from, Date until) {
        if (from.between(checkInDate, checkOutDate) ||
            until.between(checkInDate, checkOutDate))
            return true;
        return false;
    }

    public String toString() {
        return "\nReservada a nombre de " + getClient() +
                ", desde " + checkInDate.toString() +
                " hasta " + checkOutDate.toString();
    }
}
