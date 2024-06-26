package org.iesvdm;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import javax.swing.plaf.multi.MultiToolTipUI;
import java.util.*;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

public class UtilesArraysTest {

    @Test
    void  verdadero() {
        // al importar static, no hace falta escribir Assertions
        assertTrue ( 1==1);

        //Sino importarmos el código estatico es la forma:
        //Assertions.assertTrue ( 1==1);
    }

    @Test
    void limpiar(){

        //When (Cuando)
        int[] array = {5,7,12,27};

        // Do (Hacer)

        array = UtilesArrays.limpiar();

        //Then (Entonces)

        assertThat(array).isEmpty();
        //Verifica que esta vacio
    }

    @Test
    void rellenarConCeros(){

        //When (Cuando)
        int[] array = new int[0];

        // Do (Hacer)
        array = UtilesArrays.rellenar(array,5);

        //Then (Entonces)

        assertThat(array).hasSize(5);
        //Verifica el tamanio del array

        assertThat(array).containsExactly(0, 0, 0, 0, 0);
        //verifica los elementos del array
    }

    @Test
    void insertarAlFinal(){

        //When (Cuando)
        int[] array = {1, 2, 3};

        // Do (Hacer)
        //crear copia
        int[] nuevoArray = new int [array.length+1];
        nuevoArray= UtilesArrays.insertarAlFinal(array, 4);

        //Then (Entonces)

        assertThat(nuevoArray[nuevoArray.length-1]).isEqualTo(4);

        //verifica que el ultimo elemento es 4
    }

    @Test
    void insertarAlPrincipio(){

        //When (Cuando)
        int[] array = {1, 2, 3};

        // Do (Hacer)
        //crear copia
        int[] nuevoArray = new int [array.length+1];
        nuevoArray= UtilesArrays.insertarAlPrincipio(array, 4);

        //Then (Entonces)

        assertThat(nuevoArray[0]).isEqualTo(4);

        //verifica que el primer elemento es 4
    }



    @Test
    void insertarEnPosicion(){

        //When (Cuando)
        int[] array = {1, 2, 3};
        int posicion = 2;
        // Do (Hacer)
        //crear copia
        int[] nuevoArray = new int [array.length+1];
        nuevoArray= UtilesArrays.insertarEnPosicion(array, 4,2);

        //Then (Entonces)

        assertThat(nuevoArray[2]).isEqualTo(4);

        //verifica que la posicion 2 el elemento es 4

    }

    @Test
    void insertarOrdenado(){

        //When (Cuando)
        int[] array = {1, 2, 3};

        // Do (Hacer)
        //crear copia
        int[] nuevoArray = new int [array.length+1];
        nuevoArray= UtilesArrays.insertarOrdenado(array, 0);

        //Then (Entonces)

        assertThat(nuevoArray).contains(0, 1, 2, 3);

        //verifica que se ha introducido el elemnto ordenado en el array

    }

    @Test
    void eliminarUltimo(){

        //When (Cuando)
        int[] array = {1, 2, 3};

        // Do (Hacer)
        //crear copia
        int[] nuevoArray = new int [array.length-1];
        nuevoArray= UtilesArrays.eliminarUltimo(array);

        //Then (Entonces)

        assertThat(nuevoArray).hasSize(2);

        //verifica que el tamanio ha disminuido en uno

    }

    @Test
    void eliminarPrimero(){


        int[] array = {1, 2, 3};

        // Do (Hacer)
        //crear copia
        int[] nuevoArray = new int [array.length-1];
        nuevoArray= UtilesArrays.eliminarPrimero(array);

        //Then (Entonces)

        assertThat(nuevoArray).contains(2, 3);
        //verifica que el tamanio ha disminuido en uno y ha eliminado el primero

    }

    @Test
    void eliminarPosicion(){

        //When (Cuando)
        int[] array = {1, 2, 3};
        int posicion= 1;
        // Do (Hacer)
        //crear copia
        int[] nuevoArray = new int [array.length-1];
        nuevoArray= UtilesArrays.eliminarPosicion(array,1);

        //Then (Entonces)

        assertThat(nuevoArray).contains(1, 3);
        //verifica que el tamanio ha disminuido en uno y ha eliminado la posicion 1

        assertThat(nuevoArray[1]).isEqualTo(3);
        //verific que la nueva posición 1 es 3

    }

    @Test
    void eliminarRepetidos(){

        //When (Cuando)
        int[] array = {1, 2, 3, 1};

        // Do (Hacer)
        //crear copia
        int[] nuevoArray = new int [array.length-1];
        nuevoArray= UtilesArrays.eliminar(array,1);

        //Then (Entonces)

        assertThat(nuevoArray).contains(2, 3);
        //verifica que eha eliminado los elementos numero 1

    }

    @Test
    void ordenar(){

        // When (Cuando)
        int[] array = {1, 5, 3, 2};

        // Do (Hacer)
        //crear copia
        int[] nuevoArray = new int [array.length-1];
        nuevoArray= UtilesArrays.ordenar(array);

        //Then (Entonces)

        assertThat(nuevoArray).containsExactly(1, 2, 3, 5);
        //verifica que esta ordenado

    }

    @Test
    void desordenar(){

        //When (Cuando)
        int[] array = {1, 2, 3, 4};

        // Do (Hacer)
        //crear copia
        int[] arrayNuevo = new int[array.length];
        UtilesArrays.desordenar(arrayNuevo);

        //Then (Entonces)

        assertThat(array).isNotEqualTo(arrayNuevo);
        //verifica que no estan en mismo orden

    }

    @Test
    void invertir(){

        //When (Cuando)
        int[] array = {1, 2, 3, 4};

        // Do (Hacer)
        //crear copia
        int[] arrayNuevo;
        arrayNuevo = UtilesArrays.invertir(array);

        //Then (Entonces)

        assertThat(arrayNuevo).containsExactly(4, 3, 2, 1);
        //verifica que no estan en orden invertido

    }

    @Test
    void imprimir(){

        //When (Cuando)
        int[] array = {1, 2, 3, 4};

        // Do (Hacer)
        UtilesArrays.imprimir(array);

        //Then (Entonces)

        assertThat(array).containsExactly(1, 2 ,3 ,4);
        //verifica que se imprime igual

    }

    @Test
    void  buscar(){

        //When (Cuando)
        int[] array = {1, 2, 3, 4};

        // Do (Hacer)
        UtilesArrays.buscar(array,4);

        //Then (Entonces)

        assertThat(array[3]).isEqualTo(4);
        //verifica que sel elemento 4 esta en la posicion 3

    }

    @Test
    void partirPor(){

        //When (Cuando)
        int[] array = {1, 7, 57, 12, 29, 27, 12, 2};

        // Do (Hacer)
        int[] arrayNuevo = new int[array.length];
        arrayNuevo = UtilesArrays.partirPor(array, 2, 5);


        //Then (Entonces)

        assertThat(arrayNuevo).containsExactly(57, 12, 29);
        //verifica que se produce el corte en las posiciones indicadas de inicio y fin

    }

    @Test
    void sonIguales(){

        //When (Cuando)
        int[] array = {1, 7, 57, 12};

        // Do (Hacer)
        int[] arrayNuevo = {1, 7, 57, 12, 29, 27, 12, 2};

        boolean resultado = UtilesArrays.sonIguales(array,arrayNuevo);


        //Then (Entonces)

        assertThat(resultado).isFalse();
        //Verifica que ambos no son iguales

    }

    @Test
    void elementosIguales(){

        //When (Cuando)
        int[] array = {1, 7, 57, 12};

        // Do (Hacer)
        int[] arrayNuevo = {1, 7, 57, 12, 29, 27, 12, 2};

        boolean resultado = UtilesArrays.elementosIguales(array,arrayNuevo, 0);


        //Then (Entonces)

        assertThat(resultado).isTrue();
        // Verifica que ambos tienen en la posicion 0 el mismo elemento

    }

    @Test
    void concatenarArrays(){

        //When (Cuando)

        int [] array = {1, 2, 3, 4};
        int [] nuevoArray ={5, 6, 7, 8};

        // Do (Hacer)

        int [] arrayNuevo = UtilesArrays.concatenarArrays(array,nuevoArray);


        //Then (Entonces)

        assertThat(arrayNuevo).containsExactly(1, 2, 3, 4, 5, 6, 7, 8);
        //Verifica que se han concatenado ambos arrays
    }

}
