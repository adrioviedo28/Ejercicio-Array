import java.util.ArrayList;
import java.util.List;

//Objetivo: Filtrar elementos en una lista según un criterio específico.
//
//Instrucciones:
//
//Crea un ArrayList de números enteros.
//Llénalo con los números 1 a 10.
//Filtra los números pares en una nueva lista llamada evenNumbers.
//Imprime la lista original y la lista de números pares.
public class EjercicioTres {

    public static void main(String[] args) {

        Integer number1 = 1;
        Integer number2 = 2;
        Integer number3 = 3;
        Integer number4 = 4;
        Integer number5 = 5;
        Integer number6 = 6;
        Integer number7 = 7;
        Integer number8 = 8;
        Integer number9 = 9;
        Integer number10 = 10;

        List<Integer> numbers = new ArrayList<>();

        numbers.add(number1);
        numbers.add(number2);
        numbers.add(number3);
        numbers.add(number4);
        numbers.add(number5);
        numbers.add(number6);
        numbers.add(number7);
        numbers.add(number8);
        numbers.add(number9);
        numbers.add(number10);


        System.out.println("Nueva Lista");

        ArrayList<Integer> evenNumbers = new ArrayList<>();

        // Filtrar los números pares
        for (int numero : numbers) {
            if (numero % 2 == 0) {
                evenNumbers.add(numero);
            }
        }

        // Imprimir los números pares
        System.out.println("Números pares: " + evenNumbers);
    }
}






