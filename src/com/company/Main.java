package com.company;

public class Main {
    /**
     * ALisher
     */
    public static void main(String[] args) {
        String[] names = {"Tommy", "Andy", "Jerry"};
        for (int i = 0; i < 3; i++) {
            switch (names[i]) {
                case "Tommy":
                    System.out.println("Good morning! " + names[0] );
                    break;
                case "Andy":
                    System.out.println("Good day! " + names[1]);
                    break;
                case "Jerry":
                    System.out.println("Good evening! " + names[2]);
                    break;
            }
        }
    }
}
