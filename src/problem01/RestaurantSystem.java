package problem01;

class RestaurantSystem {
    public void reserveTable(String guest) {
        System.out.println("Забронирован стол для " + guest);
    }

    public void orderFood(String dish) {
        System.out.println("Заказано блюдо: " + dish);
    }
}
