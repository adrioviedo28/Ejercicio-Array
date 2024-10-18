//Objetivo: Practicar la iteración sobre listas.
//
//Instrucciones:
//
//Crea un ArrayList de números enteros llamado numbers y añade los números del 1 al 5.
//Usa un bucle for para imprimir cada número.
//Usa un bucle for-each para imprimir los mismos números.
//Usa un bucle while para imprimir los números en orden inverso.


import java.util.ArrayList;
import java.util.List;

public class EjercicioDos {

    public static void main(String[] args) {


        Integer number1 = 1;
        Integer number2 = 2;
        Integer number3 = 3;
        Integer number4 = 4;
        Integer number5 = 5;

        List<Integer> numbers = new ArrayList<>();

        numbers.add(number1);
        numbers.add(number2);
        numbers.add(number3);
        numbers.add(number4);
        numbers.add(number5);

        //System.out.println(numbers);

        // Usar un bucle for para imprimir cada número
        System.out.println("Imprimir cada numero");
        for (int i = 0; i < numbers.size(); i++) {
            System.out.println(numbers.get(i)); //get(i) permite acceder al elemento en la posición i.

        }
        //Usa un bucle for-each para imprimir los mismos números.
        System.out.println("Imprimir los mismos numeros");
        for (int numero : numbers) {
            System.out.println(numero);

        }
        //Usa un bucle while para imprimir los números en orden inverso
        int inverso = numbers.size() - 1; // Comenzar desde el último índice
        System.out.println("Imprimir los numeros en orden inverso");
        while (inverso >= 0) {
            System.out.println(numbers.get(inverso));
            inverso--;

        }

    }
}
