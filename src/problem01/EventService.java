package problem01;

public class EventService {
    public void order(int roomId, String eventName) {
        System.out.println("Event '" + eventName + "' scheduled by room '" + roomId + "'");
    }
}
