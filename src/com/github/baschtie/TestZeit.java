package com.github.baschtie;

public class TestZeit {

    Zeit time12 = new Zeit(9, 4);
    Zeit time24 = new Zeit(14, 15);

    ZeitFormat12 zeitFormat12 = new ZeitFormat12();
    ZeitFormat24 zeitFormat24 = new ZeitFormat24();

    public void runTest() {
        zeitFormat12.printZeit(time12);
        zeitFormat24.printZeit(time24);
        zeitFormat12.printZeit(time24);
    }
}
