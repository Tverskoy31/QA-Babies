package org.example.homework.clock;

public class Clock implements Readable {
    private int hour;
    private int minute;
    private int second;

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public int getMinute() {
        return minute;
    }

    public void setMinute(int minute) {
        this.minute = minute;
    }

    public int getSecond() {
        return second;
    }

    public void setSecond(int second) {
        this.second = second;
    }

    public void tick() {
        second++;
        if (second == 60) {
            second = 0;
        }
        System.out.println("+1 секунда: " + second);
    }

    @Override
    public void readTime() {
        System.out.println("Текущее время: " + hour + " часов " + minute + " минут " + second + " секунд");
    }
}
