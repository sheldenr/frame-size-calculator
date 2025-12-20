package com.sheldenr.frame_calculator;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static double calculatePercievedProprtion(double focalLength, double censorSize) {




    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int integerChoice = 0;

        // Determine frame size
        final CensorSizes censorSizeInformation = new CensorSizes();
        final ArrayList<String> availableFrames =
            censorSizeInformation.frameSizeList;

        System.out.println("Select your camera censor format");
        for (int i = 1; i < censorSizeInformation.size; i++) {
            System.out.println(i + ": " + availableFrames.get(i - 1));
        }

        System.out.print("\n:> ");

        try {
            integerChoice = input.nextInt();
        } catch (Exception e) {
            System.out.print("Error caught: " + e);
        }

        System.out.println("\n" + "-------------------");
        System.out.println(
            "Selected: " + availableFrames.get(integerChoice - 1)
        );

        System.out.println()

        // Program end
        input.close();
        return;
    }
}
