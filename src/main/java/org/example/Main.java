package org.example;

public class Main {
    public static void main(String[] args) {
        int[] testInput = {2500, -1024, 5000};

        for(int v:testInput)
        {
            printMegaBytesAndKiloBytes(v);
        }
    }

    public static void printMegaBytesAndKiloBytes(int kiloBytes){

        if(kiloBytes < 0){
            System.out.println("Invalid Value");
            return;
        }

        var MEGA_TO_KILO = 1024;
        int result = kiloBytes / MEGA_TO_KILO;
        int remainder = kiloBytes % MEGA_TO_KILO;

        System.out.println(kiloBytes + " KB = " + result + " MB and " + remainder + " KB");

    }
}