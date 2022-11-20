package oop1_exercise_4;

public class Main {

    public static void main(String[] args) {
        Computer[] computers = new Computer[5];

        computers[0] = new Computer("ноутбук");
        computers[1] = new Computer("бухгалтерський");
        computers[2] = new Computer("серверний");
        computers[3] = new Computer("User1");
        computers[4] = new Computer("моноблок");

        for (int i = 0; i < computers.length; i++) {
            System.out.println(computers[i].pcName);
        }

    }

}

