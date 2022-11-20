package oop1_exercise_5;

//Завдання 5
//        Використовуючи IDEA, створіть проект із пакетом. Потрібно: Створити клас із ім'ям Address. У тілі
//        класу потрібно створити поля: index, country, city, street, house, apartment. Для кожного поля
//        створити метод з двома методами доступу (get, set) Створити екземпляр класу Address. У поля екземпляра
//        записати інформацію про поштову адресу. Виведіть на екран значення полів, що описують адресу.

public class Address {
    private String index;
    private String country;
    private String city;
    private String street;
    private int house;
    private int apartment;


    public String getIndex() {
        return index;
    }

    public void setIndex(String index) {
        this.index = index;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public int getHouse() {
        return house;
    }

    public void setHouse(int house) {
        this.house = house;
    }

    public int getApartment() {
        return apartment;
    }

    public void setApartment(int apartment) {
        this.apartment = apartment;
    }
}
