package Ej4L;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ej4L {
    public static void main(String[] args) {
        try {
            // Ejecuta el comando "ls -al /tmp" y obtiene el resultado
            Process process = Runtime.getRuntime().exec("ls -al /tmp");
            BufferedReader reader = new BufferedReader(new InputStreamReader(process.getInputStream()));

            String line;
            while ((line = reader.readLine()) != null) {
                // Filtra y muestra solo los archivos que pertenecen al usuario actual
                if (line.contains(" " + System.getProperty("user.name") + " ")) {
                    System.out.println(line);
                }
            }

            // Cierra el lector
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}


