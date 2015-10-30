/**
 * Created by diegobaldassare on 9/29/15.
 */
public class Hotel {

    private Room[] rooms;

    public Hotel(Room[] rooms) {
        this.rooms = rooms;
    }

    public void makeReservation(String aClient, Room aRoom, Date checkInDate, Date checkOutDate) {
                aRoom.reserveRoom(aClient, checkInDate, checkOutDate);
    }

    public String toString() {
        return "El hotel contiene las siguientes habitaciones:" + roomsToString();

    }

    private String roomsToString() {
        String aux = "";
        for (int i = 0; i < rooms.length; i++) {
            aux += rooms[i].toString();
        }
        return aux;
    }
}
