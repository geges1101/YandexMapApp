package com.example.mapkitApp;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class APIkey {
    private final String myAPIkey;

    public APIkey(String path) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(path));
        this.myAPIkey = reader.readLine();
        reader.close();
    }

    public String getMyAPIkey() {
        return myAPIkey;
    }

}
