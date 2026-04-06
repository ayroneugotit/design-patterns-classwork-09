package problem01;

public class Hotel {
    private RoomBookingService roomBookingService;
    private RestaurantService restaurantService;
    private EventService eventService;
    private CleaningService cleaningService;

    public Hotel(RoomBookingService roomBookingService, RestaurantService restaurantService, EventService eventService, CleaningService cleaningService) {
        this.roomBookingService = roomBookingService;
        this.restaurantService = restaurantService;
        this.eventService = eventService;
        this.cleaningService = cleaningService;
    }

    public void bookWithService(int roomId) {
        boolean bookingResult = this.roomBookingService.book(roomId);
        if (!bookingResult) return;
        System.out.println("Room '" + roomId + "' booked");
        this.restaurantService.order(roomId, "Dinner");
        this.cleaningService.order(roomId, "14:00");
    }

    public void bookWithEvent(int roomId, String eventName) {
        boolean bookingResult = this.roomBookingService.book(roomId);
        if (!bookingResult) return;
        System.out.println("Room '" + roomId + "' booked");
        this.eventService.order(roomId, eventName);
    }
}
