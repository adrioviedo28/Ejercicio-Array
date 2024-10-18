//Objetivo: Comparar dos listas y encontrar elementos comunes.
//
//Instrucciones:
//
//Crea dos ArrayList de String llamadas list1 y list2.
//Llena list1 con: "Apple", "Banana", "Cherry", "Date".
//Llena list2 con: "Banana", "Date", "Elderberry", "Fig".
//Encuentra los elementos comunes entre las dos listas y guárdalos en una nueva lista llamada commonElements.
//Imprime los elementos comunes.


import java.util.ArrayList;
import java.util.List;

public class EjercicioCuatro {

    public static void main(String[] args) {

        //lista 1
        String fruta1 = "Apple";
        String fruta2 = "Banana";
        String fecha = "Date";

        List<String> list1 = new ArrayList<>();

        list1.add(fruta1);
        list1.add(fruta2);
        list1.add(fecha);


        //lista 2
        String fruta3 = "Banana";
        String fecha2 = "Date";
        String fruta4 = "Elderberry";
        String cosa1 = "Fig";


        List<String> list2 = new ArrayList<>();

        list2.add(fruta3);
        list2.add(fecha2);
        list2.add(fruta4);
        list2.add(cosa1);

// Crear una nueva lista para los elementos comunes
        List<String> commonElements = new ArrayList<>();

        // Encontrar los elementos comunes
        for (String elementosEnComun : list1) {
            if (list2.contains(elementosEnComun)) {
                commonElements.add(elementosEnComun);
            }
        }

        // Imprimir los elementos comunes
        System.out.println("Los Elementos comunes de la lista 1 y la lista 2 son : " + commonElements);
    }


}

