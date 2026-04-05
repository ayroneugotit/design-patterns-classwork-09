package problem01;

public class Main {
    public static void main(String[] args) {

        HotelFacade hotel = new HotelFacade();

        hotel.bookRoomWithServices("Полина", 101, "Паста");

        System.out.println();
        hotel.organizeEvent("Конференц-зал A", "Проектор", "Женя", 202);
        System.out.println();
        hotel.reserveTableWithTaxi("Антонина", "Стейк");
        System.out.println();
        hotel.requestCleaning(101);
        System.out.println();
        hotel.cancelRoom(202);
    }
}
