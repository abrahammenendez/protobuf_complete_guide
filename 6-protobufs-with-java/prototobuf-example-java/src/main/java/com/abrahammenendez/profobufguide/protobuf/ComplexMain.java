package com.abrahammenendez.profobufguide.protobuf;

import example.complex.Complex;
import example.complex.Complex.ComplexMessage;
import example.complex.Complex.DummyMessage;

public class ComplexMain {

    public static void main(String[] args) {

        System.out.println("Complex example");

        DummyMessage oneDummy = newDummyMessage(55, "name");

        ComplexMessage.Builder builder = ComplexMessage.newBuilder();

        builder.setOneDummy(oneDummy);
        builder.addMultipleDummy(newDummyMessage(66, "second"));

        ComplexMessage message = builder.build();

        System.out.println(message.toString());


    }

    public static DummyMessage newDummyMessage(Integer id, String name) {

        DummyMessage.Builder builder = DummyMessage.newBuilder();
        DummyMessage message = builder.setName(name)
                .setId(id)
                .build();

        return message;
    }

}
