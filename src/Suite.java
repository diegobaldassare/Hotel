/**
 * Created by diegobaldassare on 9/29/15.
 */
public class Suite extends Room {

    public Suite(Reservation[] reservations) {
        super(2, 2000, reservations);
    }

    @Override //podria ser static??
    public String abstractToString() {
        return "suite";
    }
}
