/**
 *Classe con 4 metodi all'interno di ArithmeticOperators
 *fare:sum, sub, mul e div
 * @author Giovanni Topor
 */
public class ArithmeticOperators {
/**
 * Metodo che somma due numeri
 * @param num1 primo numero
 * @param num2 secondo numero
 * @return il risultato di sum(num1+num2=return)
 */

public int Sum(int num1, int num2){
           return num1+num2;
}
/**
 * Metodo che sottrae due numeri
 * @param num1 primo numero
 * @param num2 secondo numero
 * @return il risultatto della sottrazione(num1-num2=risultato)
 */

public int Sub(int num1, int num2){
           return  num1-num2;
}
    /**
     * Metodo che moltiplica due numeri
     * @param num1 primo numero
     * @param num2 secondo numero
     * @return il risultatto della moltiplicazione(num1*num2=risultato)
     */

    public int Mul(int num1, int num2){
        return  num1*num2;
    }
    /**
     * Metodo che divide due numeri
     * @param num1 primo numero
     * @param num2 secondo numero
     * @return il risultatto della divisione(num1/num2=risultato)
     */

    public int Div(int num1, int num2){
        return  num1/num2;
    }

}
