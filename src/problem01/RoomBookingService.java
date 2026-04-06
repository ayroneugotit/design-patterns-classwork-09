package problem01;

import java.util.List;
import java.util.ArrayList;

public class RoomBookingService {
    private List<Room> rooms;

    public RoomBookingService() {
        this.rooms = new ArrayList<>();
    }

    private Room findRoom(int roomId) {
        for (Room r : this.rooms) {
            if (r.getId() == roomId) return r;
        }
        return null;
    }

    public void addRoom(Room room) {
        if (this.findRoom(room.getId()) != null) return;
        this.rooms.add(room);
    }

    public void removeRoom(Room room) {
        if (this.findRoom(room.getId()) == null) return;
        this.rooms.remove(room);
    }

    public boolean book(int roomId) {
        Room room = this.findRoom(roomId);
        if (room == null) return false;
        if (room.getBooked()) return false;
        room.setBooked(true);
        return true;
    }

    public boolean unBook(int roomId) {
        Room room = this.findRoom(roomId);
        if (room == null) return false;
        if (!room.getBooked()) return false;
        room.setBooked(false);
        return true;
    }
}
