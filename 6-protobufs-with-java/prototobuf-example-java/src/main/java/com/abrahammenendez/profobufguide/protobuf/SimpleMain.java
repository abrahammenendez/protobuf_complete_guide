package com.abrahammenendez.profobufguide.protobuf;

import example.simple.Simple.SimpleMessage;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.Arrays;

public class SimpleMain {
    public static void main(String[] args) {
        System.out.println("Hello World!");

        SimpleMessage.Builder builder = SimpleMessage.newBuilder();

        builder.setId(42)
                .setIsSimple(true)
                .setName("My Simple Message Name");

        builder.addSampleList(1)
                .addSampleList(2)
                .addSampleList(3)
                .addAllSampleList(Arrays.asList(4, 5, 6));

        System.out.println(builder.toString());

        SimpleMessage message = builder.build();

         try {
            FileOutputStream outputStream = new FileOutputStream("simple message.bin");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
