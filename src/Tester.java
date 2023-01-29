public class Tester {
    public static void main(String[] args) {

        /**
         * Classe che testa le operazioni aritmetiche
         * @author Giovanni Topor
         */




        ArithmeticOperators AO= new ArithmeticOperators();

        System.out.println("Somma "+AO.Sum(20 , 5));
        System.out.println("Sottrazione "+AO.Sub(20 , 5));
        System.out.println("Moltiplicazione "+AO.Mul(20 , 5));
        System.out.println("Divisione "+AO.Div(20 , 5));

     //FIXME voglio che appaia num1 20 e num2 5, mi appare soltanto se se scrivo 20(mi dà num1 20) ma se aggiungo il secondo int non va


    }
}