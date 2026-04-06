package problem01;

public class Room {
    private static int quantity = 0;

    private int id;
    private boolean isBooked;

    public Room() {
        this.id = ++Room.quantity;
        this.isBooked = false;
    }

    public int getId() {
        return id;
    }

    public boolean getBooked() {
        return isBooked;
    }

    public void setBooked(boolean booked) {
        isBooked = booked;
    }
}
