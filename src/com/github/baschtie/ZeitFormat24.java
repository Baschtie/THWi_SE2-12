package com.github.baschtie;

public class ZeitFormat24 extends ZeitFormat{

    public void printZeit(Zeit zeit) {
        System.out.printf("Die aktuelle zeit ist: %02d:%02d\n", zeit.getHour(), zeit.getMin());
    }


}
