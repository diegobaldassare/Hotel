/**
 * Created by diegobaldassare on 9/26/15.
 */
public class Standard extends Room {

    public Standard(Reservation[] reservations) {
        super(4, 1000, reservations);
    }

    @Override
    public String abstractToString() {
        return "estandar";
    }
}
