package com.github.baschtie;

public abstract class ZeitFormat extends Zeit {

    //Soll die Zeit in der Konsole ausgeben
    abstract void printZeit();

    public ZeitFormat(int min, int hour) {
        super(min, hour);
    }
}
