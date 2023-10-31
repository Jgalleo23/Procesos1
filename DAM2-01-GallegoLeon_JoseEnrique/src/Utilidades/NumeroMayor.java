package Utilidades;

import java.util.Scanner;

public class NumeroMayor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int max = Integer.MIN_VALUE;

        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();

            if (line.isEmpty() || !line.matches("\\d+")) {
                continue;
            }

            int number = Integer.parseInt(line);
            if (number > max) {
                max = number;
            }
        }

        System.out.println(max);

        scanner.close();
    }
}