package fibonacci;

public class CalculoFibonacci {

    public static int calculoFibonacci(int number){

        if(number <= 1){
            return number;
        }

        return calculoFibonacci(number - 1) + calculoFibonacci( number -2);
    }

}
