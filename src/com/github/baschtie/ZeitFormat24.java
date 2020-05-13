package com.github.baschtie;

public class ZeitFormat24 extends ZeitFormat{

    public void printZeit() {
        System.out.printf("Die aktuelle zeit ist: %02d:%02d\n", this.getHour(), this.getMin());
    }

    public ZeitFormat24(int hour, int min) {
        super(hour, min);
    }
}
