package com.yani.designpatterns.structural.decorator.everydayexample;

import java.io.*;

public class EverydayExampleDecorator {
    public static void main(String[] args) throws IOException {
        File file = new File("./output.txt"); // concrete instance of component
        file.createNewFile();

        // OutputStream -> base decorator
        // FileOutputStream -> on of the instances of concrete decorator
        OutputStream outputStream = new FileOutputStream(file);

        DataOutputStream dataOutputStream = new DataOutputStream(outputStream);
        dataOutputStream.writeChars("text");

        dataOutputStream.close();
        outputStream.close();
    }
}
