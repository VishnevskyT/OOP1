package oop1_exercise_5;

public class Main {
    public static void main(String[] args) {
        Address address = new Address();
        address.setIndex("99913");
        address.setCountry("Україна");
        address.setCity("Київ");
        address.setStreet("вул. Дуже Головна");
        address.setHouse(17);
        address.setApartment(69);
        System.out.println(address.getIndex() + ", " + address.getCountry() + ", м. " + address.getCity() + ", "
                + address.getStreet() + ", " + address.getHouse() + ", буд. " + address.getApartment());
    }
}
