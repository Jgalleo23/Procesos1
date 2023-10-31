package Utilidades;

import java.util.Scanner;

public class Suma {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;

        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();

            if (line.isEmpty() || !line.matches("\\d+")) {
                continue;
            }

            int number = Integer.parseInt(line);
            sum += number;
        }

        System.out.println(sum);

        scanner.close();
    }
}
