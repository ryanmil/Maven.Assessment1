package com.zipcodewilmington.assessment1.part4;

public class Jumper {

    /*
     * Complete the function below.
     */
    public int jumps(int flagHeight, int jumpHeight) {
        int jumps = 0;
        int remainder = flagHeight % jumpHeight;
        jumps = (flagHeight - remainder) / jumpHeight;
        jumps += remainder;
        return jumps;
    }
}
