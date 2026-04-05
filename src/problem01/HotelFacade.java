package problem01;

class HotelFacade {
    private RoomBookingSystem roomSystem;
    private RestaurantSystem restaurantSystem;
    private EventManagementSystem eventSystem;
    private CleaningService cleaningService;
    private TaxiService taxiService;

    public HotelFacade() {
        roomSystem = new RoomBookingSystem();
        restaurantSystem = new RestaurantSystem();
        eventSystem = new EventManagementSystem();
        cleaningService = new CleaningService();
        taxiService = new TaxiService();
    }

    public void bookRoomWithServices(String guest, int room, String dish) {
        roomSystem.checkAvailability(room);
        roomSystem.bookRoom(guest, room);
        restaurantSystem.orderFood(dish);
        cleaningService.scheduleCleaning(room);
    }

    public void organizeEvent(String hall, String equipment, String guest, int room) {
        eventSystem.bookHall(hall);
        eventSystem.orderEquipment(equipment);
        roomSystem.bookRoom(guest, room);
    }

    public void reserveTableWithTaxi(String guest, String dish) {
        restaurantSystem.reserveTable(guest);
        restaurantSystem.orderFood(dish);
        taxiService.callTaxi(guest);
    }

    public void cancelRoom(int room) {
        roomSystem.cancelBooking(room);
    }

    public void requestCleaning(int room) {
        cleaningService.cleanNow(room);
    }
}

