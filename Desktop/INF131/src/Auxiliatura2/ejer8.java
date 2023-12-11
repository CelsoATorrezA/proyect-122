package Auxiliatura2;

import java.math.BigInteger;
import java.util.Scanner;

public class ejer8 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Leer el número de pelotas
        int N = scanner.nextInt();
        scanner.nextLine(); // Consumir el salto de línea

        BigInteger costoFutsal = BigInteger.valueOf(Long.MAX_VALUE);
        BigInteger costoWally = BigInteger.valueOf(Long.MAX_VALUE);
        BigInteger costoBasquet = BigInteger.valueOf(Long.MAX_VALUE);
        BigInteger costoFW = BigInteger.valueOf(Long.MAX_VALUE);
        BigInteger costoFB = BigInteger.valueOf(Long.MAX_VALUE);
        BigInteger costoWB = BigInteger.valueOf(Long.MAX_VALUE);
        BigInteger costoFWB = BigInteger.valueOf(Long.MAX_VALUE);

        for (int i = 0; i < N; i++) {
            String[] datosPelota = scanner.nextLine().split(" ");
            BigInteger precio = new BigInteger(datosPelota[0]);
            String deportes = datosPelota[1];

            if (deportes.equals("F")) {
                costoFutsal = costoFutsal.min(precio);
            } else if (deportes.equals("W")) {
                costoWally = costoWally.min(precio);
            } else if (deportes.equals("B")) {
                costoBasquet = costoBasquet.min(precio);
            } else if (deportes.equals("FW")) {
                costoFW = costoFW.min(costoFutsal.add(precio));
            } else if (deportes.equals("FB")) {
                costoFB = costoFB.min(costoFutsal.add(precio));
            } else if (deportes.equals("WB")) {
                costoWB = costoWB.min(costoWally.add(precio));
            } else if (deportes.equals("FWB")) {
                costoFWB = costoFWB.min(costoFutsal.add(costoWally).add(precio));
            }
        }

        // Calcular el costo mínimo
        BigInteger costoMinimo = costoFutsal.add(costoWally).add(costoBasquet).min(
                costoFW.add(costoBasquet).min(costoFB.add(costoWally))
        );

        // Verificar si es posible jugar los 3 deportes
        if (costoMinimo.equals(BigInteger.valueOf(Long.MAX_VALUE))) {
            System.out.println("-1");
        } else {
            System.out.println(costoMinimo);
        }
    }
}

