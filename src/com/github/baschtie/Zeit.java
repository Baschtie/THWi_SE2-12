package com.github.baschtie;

public class Zeit {

    private int min;

    //Der Standart sieht vor das die Zeit im 24h Format gespeichert wird
    private int hour;

    public int getMin() {
        return min;
    }

    public int getHour() {
        return hour;
    }

    public void setMin(int min) {
        this.min = min;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public Zeit(int min, int hour) {
        this.min = min;
        this.hour = hour;
    }

    public Zeit() {
        this.min = 0;
        this.hour = 0;
    }
}
