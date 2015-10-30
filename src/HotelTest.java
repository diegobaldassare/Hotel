/**
 * Introducción a la Programación II
 * Guía Herencia continuación
 * Hotel Test
 * Created by diegobaldassare on 9/29/15.
 */
public class HotelTest {

    public static void main(String[] args) {

        System.out.println("\nHOTEL TEST");

        //Create Hotel
            Reservation[] reservations1 = new Reservation[2];
            Reservation[] reservations2 = new Reservation[2];
            Reservation[] reservations3 = new Reservation[2];


            Standard room1 = new Standard(reservations1);
            Suite room2 = new Suite(reservations2);
            Presidential room3 = new Presidential(reservations3);

            Room[] hotelRooms = new Room[] {room1, room2, room3};

            Hotel myHotel = new Hotel(hotelRooms);

        //Make reservations
            Date date1A = new Date(2015, 10, 1);
            Date date1B = new Date(2015, 10, 15);
            Date date2A = new Date(2015, 10, 20);
            Date date2B = new Date(2015, 10, 30);

            myHotel.makeReservation("Bruno", room1, date1A, date1B);
            myHotel.makeReservation("Brian", room1, date2A, date2B);
            myHotel.makeReservation("Curi", room2, date1A, date1B);
            myHotel.makeReservation("Connie", room3, date1A, date2B);

        //All toString
        System.out.println(myHotel.toString());

        System.out.println("\nHotel Test ended correctly.");
    }
}
