package com.rus.VsakoRazno;

/**
 * Created by User on 010 10.12.16.
 */
public class Stek {
    private static Stek ourInstance = new Stek();

    public static Stek getInstance() {
        return ourInstance;
    }

    private Stek() {
    }
}
