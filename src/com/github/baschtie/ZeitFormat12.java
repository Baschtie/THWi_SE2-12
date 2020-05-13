package com.github.baschtie;

public class ZeitFormat12 extends ZeitFormat {

    public void printZeit() {
        String append = "AM";
        if(this.getHour() > 12) {
            this.setHour(this.getHour() - 12);
            append = "PM";
        }
        System.out.printf("Die aktuelle Zeit ist: %02d:%02d %s\n", this.getHour(), this.getMin(), append);
    }

    public ZeitFormat12(int min, int hour) {
        super(min, hour);
    }
}
