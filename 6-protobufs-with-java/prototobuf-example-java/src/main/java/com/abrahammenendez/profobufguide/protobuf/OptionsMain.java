package com.abrahammenendez.profobufguide.protobuf;

import com.example.options.OptionMessageOther;
import example.simple.Simple.SimpleMessage;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.Arrays;

public class OptionsMain {
    public static void main(String[] args) {
        OptionMessageOther other = OptionMessageOther.newBuilder().build();
    }
}
