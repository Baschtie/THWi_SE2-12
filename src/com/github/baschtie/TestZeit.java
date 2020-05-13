package com.github.baschtie;

public class TestZeit {


    ZeitFormat12 zeitFormat12 = new ZeitFormat12(4, 34);
    ZeitFormat24 zeitFormat24 = new ZeitFormat24(13, 54);

    public void runTest() {
        zeitFormat12.printZeit();
        zeitFormat24.printZeit();
        zeitFormat12.printZeit();
    }
}
