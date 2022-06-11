package fatorial;

import java.math.BigInteger;

public class CalculoFatorial {

    public static int calculaFatorial(int numero) {

        if (numero <= 1) {
            return 1;
        }
        return numero * calculaFatorial(numero - 1);
    }

    public static BigInteger calculaFatorial(BigInteger numero) {

        if (numero.intValue() <=1 ) {
            return BigInteger.ONE;
        }
        return numero.multiply(calculaFatorial(numero.subtract(BigInteger.ONE)));
    }

}
