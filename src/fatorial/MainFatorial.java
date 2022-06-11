package fatorial;

import java.math.BigInteger;

public class MainFatorial {

    public static void main(String[] args) {

        int number = 5;
        int fatorial = CalculoFatorial.calculaFatorial(number);
        System.out.println("O fatorial de "+ number + " é " + fatorial);

        BigInteger bigInteger = new BigInteger("50");
        var fatorialBig = CalculoFatorial.calculaFatorial(bigInteger);
        System.out.println("O fatorial de "+ bigInteger + " é " + fatorialBig);

    }
}
