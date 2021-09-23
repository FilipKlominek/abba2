package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String line = sc.nextLine();

        char current = '0';
        char previous = '0';

        boolean found = false;

        for (int i = 0; i < line.length(); i++) {

            char current2 = '0';
            char previous2 = '0';

            current = line.charAt(i);

            if (previous == 'b' && current == 'a') {
                for (int j = i + 1; j < line.length(); j++) {
                    current2 = line.charAt(j);
                    if (previous2 == 'a' && current2 == 'b') {
                        found = true;
                    }
                    previous2 = current2;
                }
            }
            if (previous == 'a' && current == 'b') {
                for (int j = i + 1; j < line.length(); j++) {
                    current2 = line.charAt(j);
                    if (previous2 == 'b' && current2 == 'a') {
                        found = true;
                    }
                    previous2 = current2;
                }
            }

            previous = current;
        }
        if (found) System.out.println("yes");
        else System.out.println("no");
    }
}
