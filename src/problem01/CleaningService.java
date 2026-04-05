package problem01;

class CleaningService {
    public void scheduleCleaning(int roomNumber) {
        System.out.println("Уборка запланирована для номера " + roomNumber);
    }

    public void cleanNow(int roomNumber) {
        System.out.println("Выполняется уборка номера " + roomNumber);
    }
}

