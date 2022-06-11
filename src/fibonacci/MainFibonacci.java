package fibonacci;

public class MainFibonacci {

    public static void main(String[] args) {

        int posicaoFibonacci = 3;
        int valorFibonacci = CalculoFibonacci.calculoFibonacci(posicaoFibonacci);
        System.out.println("O valor Fibonacci de "+ posicaoFibonacci + " é:  " + valorFibonacci);

    }
}
