package oop1_exercise_3;

//Завдання 3
//        Використовуючи IDEA, створіть проєкт із пакетом.
//        Потрібно: створити клас Book (Main). Створити класи Title, Author та Content, кожен з яких має містити
//        одне рядкове поле та метод void show(). Реалізуйте можливість додавання до книги назви книги, імені
//        автора та змісту. Виведіть на екран за допомогою методу show() назву книги, ім'я автора та зміст.


public class Author {
    private String author;

    public Author(String author) {
        this.author = author;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    void show(){
        System.out.println("Автор: " + author);
    }
}
