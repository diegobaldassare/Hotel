/**
 * Introducción a la Programación II
 * Guía Herencia continuación
 * Ejercicio 2
 * Created by diegobaldassare on 9/26/15.
 */
public abstract class Room {

    private double price;
    private int peopleCapacity;
    private Reservation[] reservations;

    public Room(int peopleCapacity, double price, Reservation[] reservations) {
        this.peopleCapacity = peopleCapacity;
        this.price = price;
        this.reservations = reservations;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getPeopleCapacity() {
        return peopleCapacity;
    }

    public void setPeopleCapacity(int peopleCapacity) {
        this.peopleCapacity = peopleCapacity;
    }

    public abstract String abstractToString();

    public String toString() {
        return "\n\tLa habitacion " + abstractToString() + " sale $" + getPrice() +
                " y la pueden ocupar " + getPeopleCapacity() + " personas." +
                reservationsToString();
    }

    private String reservationsToString() {
        String aux = "";
        for (int i = 0; i < reservations.length; i++) {
            if (reservations[i] != null)
                aux += reservations[i].toString();
        }
        return aux;
    }

    private boolean checkIsReserved(Date from, Date until) {
        for (int i = 0; i < reservations.length; i++) {
            if (reservations[i] != null)
                if (reservations[i].isReserved(from, until))
                    return true;
        }
        return false;
    }

    public void reserveRoom(String aClient, Date checkInDate, Date checkOutDate) {
        if (checkIsReserved(checkInDate, checkOutDate))
            throw new RuntimeException("Esta habitacion no esta disponible en la fecha pedida");
        for (int i = 0; i < reservations.length; i++) {
            if (reservations[i] == null) {
                reservations[i] = new Reservation(aClient, checkInDate, checkOutDate);
                //El return me saca del metodo
                return; //si fuese break, me sacaria del ciclo nada mas (for)
            }
        }
        throw new RuntimeException("Se agoto la memoria de las reservas");
    }


}
