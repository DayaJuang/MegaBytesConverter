package org.example;

public class Main {
    static final int MEGA_TO_KILO = 1024;

    public static void main(String[] args) {
        int[] testInput = {2500, -1024, 5000};

        for(int v:testInput)
        {
            printMegaBytesAndKiloBytes(v);
        }
    }

    public static void printMegaBytesAndKiloBytes(int kiloBytes){
        // Check if the value is valid
        if(kiloBytes < 0){
            System.out.println("Invalid Value");
            return;
        }

        int result = kiloBytes / MEGA_TO_KILO;      // Convert KB to MB
        int remainder = kiloBytes % MEGA_TO_KILO;   // Check if there is a remainder

        // Print the result
        System.out.println(kiloBytes + " KB = " + result + " MB and " + remainder + " KB");
    }
}