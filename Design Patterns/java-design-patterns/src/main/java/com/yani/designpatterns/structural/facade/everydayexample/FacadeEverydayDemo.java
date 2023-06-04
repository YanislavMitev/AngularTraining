package com.yani.designpatterns.structural.facade.everydayexample;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;

public class FacadeEverydayDemo {
    public static void main(String[] args) throws IOException {
        URL url = new URL("http", "www.pluralsight.com", 80, "/author/bryan-hansen");

        BufferedReader in = new BufferedReader(new InputStreamReader(url.openStream()));

        String inputline = in.readLine();

        while (inputline != null) {
            System.out.println(inputline);
            inputline = in.readLine();
        }
    }
}
