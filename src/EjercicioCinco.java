
//Objetivo: Convertir un ArrayList en un array nativo de Java.
//
//Instrucciones:
//
//Crea un ArrayList de enteros con los valores del 1 al 5.
//Convierte este ArrayList en un array de tipo Integer[].
//Imprime el contenido del array usando un bucle for.

import java.util.ArrayList;
import java.util.List;

public class EjercicioCinco {

    public static void main(String[] args) {

        Integer number1 = 1;
        Integer number2 = 2;
        Integer number3 = 3;
        Integer number4 = 4;
        Integer number5 = 5;

        List<Integer> enteros = new ArrayList<>();

        enteros.add(number1);
        enteros.add(number2);
        enteros.add(number3);
        enteros.add(number4);
        enteros.add(number5);


        //Convertir a integer la lista
        Integer[] listaConvertida = new Integer[enteros.size()];
        listaConvertida = enteros.toArray(listaConvertida); //toArray es el metodo para convertir la lista

        //imprimir el contenido del array usando un bucle for
        System.out.println("Numeros enteros convertidos: ");
        for (int elemento = 0; elemento < listaConvertida.length; elemento++) {
            System.out.println(listaConvertida[elemento]);
        }
    }
}
