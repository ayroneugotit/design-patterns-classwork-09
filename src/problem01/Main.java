package problem01;

public class Main {
    public static void main(String[] args) {
        RoomBookingService roomBookingService = new RoomBookingService();
        RestaurantService restaurantService = new RestaurantService();
        EventService eventService = new EventService();
        CleaningService cleaningService = new CleaningService();

        roomBookingService.addRoom(new Room());
        roomBookingService.addRoom(new Room());

        Hotel hotel = new Hotel(roomBookingService, restaurantService, eventService, cleaningService);
        hotel.bookWithService(1);
        System.out.println();
        hotel.bookWithEvent(2, "Corporate");
    }
}
