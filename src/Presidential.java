/**
 * Created by diegobaldassare on 9/29/15.
 */
public class Presidential extends Room {

        public Presidential(Reservation[] reservations) {
            super(2, 4000, reservations);
        }

        @Override
        public String abstractToString() {
            return "presidencial";
        }
}
