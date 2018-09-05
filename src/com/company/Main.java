package com.company;

public class Main {

    public static void main(String[] args) {

        String eq1 = "79 + 3 * (4 + 82 - 68) - 7 + 19 = ";
        int ans1 = 79 + 3 * (4 + 82 - 68) - 7 + 19;

        System.out.println(eq1 + ans1);

        String eq2 = "(179 + 21 + 10) / 7 + 181 = ";
        int ans2 = (179 + 21 + 10) / 7 + 181;

        System.out.println(eq2 + ans2);

        String eq3 = "10389 * 56 * 11 + 2246 = ";
        int ans3 = 10389 * 56 * 11 + 2246;

        System.out.println(eq3 + ans3);

    }
}
