package com.verne.poc.hello;

import static org.junit.Assert.*;

public class SpeakTest {

    @org.junit.Test
    public void testSayHello() throws Exception {
        Speak speak = new Speak();
        assertEquals("there!", speak.sayHello().getName());
    }

    @org.junit.Test
    public void testSaySpecificHello() throws Exception {
        Speak speak = new Speak();
        assertEquals("Mike2", speak.saySpecificHello("Mike").getName());
    }
}