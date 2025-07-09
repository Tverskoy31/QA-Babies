package org.example.homework.clock;

public class Main {
    public static void main(String[] args) {
        Clock clock1 = new Clock();
        clock1.setHour(9);
        clock1.setMinute(50);
        clock1.setSecond(59);
        clock1.readTime();
        clock1.tick();
    }
}
