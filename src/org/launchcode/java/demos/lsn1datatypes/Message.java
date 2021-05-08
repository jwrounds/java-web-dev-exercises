package org.launchcode.java.demos.lsn1datatypes;

public class Message {

    public static String getMessage(String lang, String name) {

        if (lang.equals("sp")) {
            return "¡Hola, " + name + "!";
        } else if (lang.equals("fr")) {
            return "Bonjour, " + name + "!";
        } else {
            return "Hello, " + name + "!";
        }
    }
}
