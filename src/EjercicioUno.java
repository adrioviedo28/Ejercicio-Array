import java.util.ArrayList;
import java.util.List;

//Ejercicio 1: Creación y manipulación básica de ArrayList
//Objetivo: Practicar la creación de un ArrayList, agregar, eliminar y modificar elementos.
//
//Instrucciones:
//
//Crea un ArrayList de tipo String llamado fruits.
//Agrega los siguientes elementos: "Apple", "Banana", "Cherry".
//Imprime el tamaño de la lista y los elementos.
//Elimina "Banana" de la lista.
//Cambia el valor de "Cherry" por "Orange".
//Imprime la lista resultante.

public class EjercicioUno {

    public static void main(String[] args) {


        String fruta1 = "Apple";
        String fruta2 = "Banana";
        String fruta3 = "Cherry";

        List<String> fruits = new ArrayList<>();

        fruits.add(fruta1);
        fruits.add(fruta2);
        fruits.add(fruta3);

        System.out.println(fruits);
        //cantidad de elementos
        System.out.println(fruits.size());

        //Eliminar Banana
        fruits.remove(1);
        System.out.println(fruits);

        //cambiar cherry a Orange
        fruits.set(1, "Orange");
        System.out.println(fruits);


    }
}

