package com.github.baschtie;

public class ZeitFormat12 extends ZeitFormat {

    public void printZeit(Zeit zeit) {
        String append = "AM";
        if(zeit.getHour() > 12) {
            zeit.setHour(zeit.getHour() - 12);
            append = "PM";
        }

        System.out.printf("Die aktuelle Zeit ist: %02d:%02d ††%s\n", zeit.getHour(), zeit.getMin(), append);
    }
}
