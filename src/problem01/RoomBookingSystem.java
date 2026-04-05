package problem01;

class RoomBookingSystem {
    public void bookRoom(String guest, int roomNumber) {
        System.out.println("Забронирован номер " + roomNumber + " для " + guest);
    }

    public void checkAvailability(int roomNumber) {
        System.out.println("Проверка доступности номера " + roomNumber);
    }

    public void cancelBooking(int roomNumber) {
        System.out.println("Бронирование номера " + roomNumber + " отменено");
    }
}


