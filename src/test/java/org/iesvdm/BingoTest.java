package org.iesvdm;

import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import java.util.*;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;


@Nested
class BingoTest {

    @Test
    void whenBooleanIsTrue(){

        //Monadas, encadenamiento de metodos
        //este metodo es mucho más declarativo
        boolean flag = true;
        assertThat(1 ==1).isTrue();
    }
    @Test
    void whenBooleanIsFalse() {
        //Monadas, encadenamiento de metodos
        // este metodo es mucho más declarativo
        int flag = 1;
        int flag2 = 2;
        assertThat(flag == flag2).isFalse();
    }

    @Test
    void rellenarNumerosCartonIsnotEmptyandhasDimension (){

        //When (Cuando)
        // Genero los arrays columnas:
        int[] col0 = new int[3];
        int[] col1 = new int[3];
        int[] col2 = new int[3];
        int[] col3 = new int[3];
        int[] col4 = new int[3];
        int[] col5 = new int[3];
        int[] col6 = new int[3];
        int[] col7 = new int[3];
        int[] col8 = new int[3];

        int[][] carton = {col0, col1, col2, col3, col4, col5, col6, col7, col8};

        //int i = 9;
        //int j = 3;
        // Do (hacer)
        Bingo.rellenarNumerosCarton(carton);

        //Then  (Entonces)


        for (int j = 0; j < carton[0].length; j++) {
            for( int i=0; i < carton.length; i++) {
                System.out.print((carton[i][j] == 0 ? " 0" : carton[i][j])+ " ");
            }
            System.out.println("");
        }

        assertThat(carton).isNotEmpty();
        assertThat(carton).hasDimensions( 9,3);

    }

    @Test
    void ponerBlancos(){
        //When (Cuando)
        // Genero los arrays columnas:
        int[] col0 = new int[3];
        int[] col1 = new int[3];
        int[] col2 = new int[3];
        int[] col3 = new int[3];
        int[] col4 = new int[3];
        int[] col5 = new int[3];
        int[] col6 = new int[3];
        int[] col7 = new int[3];
        int[] col8 = new int[3];

        int[][] carton = {col0, col1, col2, col3, col4, col5, col6, col7, col8};

        // Do (hacer)

        Bingo.ponerBlancos(carton);

        //Then  (Entonces)

        for (int j = 0; j < carton[0].length; j++) {
            for( int i=0; i < carton.length; i++) {
                System.out.print((carton[i][j] == 0 ? " 0" : carton[i][j])+ " ");
            }
            System.out.println("");
        }

        int contBlancos=0;
        for (int[] col: carton){
            int cont = 0;
            for (int celda: col) {
                if (celda == -1) {
                    cont++;
                    contBlancos++;
                }
            }
            assertThat(cont).isLessThan(3);
        }
        assertThat(contBlancos).isEqualTo(12);

    }



    @Test
    void buscarFila(){

        // Prueba con

        // -1  0 -1  0 -1 -1  0  0  0
        //  0 -1 -1  0 -1  0  0  0 -1
        // -1 -1  0 -1  0  0  0 -1  0

        //When (Cuando)
        // Genero los arrays columnas:
        int[] col0 = new int[3];
        int[] col1 = new int[3];
        int[] col2 = new int[3];
        int[] col3 = new int[3];
        int[] col4 = new int[3];
        int[] col5 = new int[3];
        int[] col6 = new int[3];
        int[] col7 = new int[3];
        int[] col8 = new int[3];

        int[][] carton = {col0, col1, col2, col3, col4, col5, col6, col7, col8};


        // Do (hacer)
        Bingo.ponerBlancos(carton);
        Bingo.buscarFila(carton,1,0);

        //Then  (Entonces)


        for (int j = 0; j < carton[0].length; j++) {
            for( int i=0; i < carton.length; i++) {
                System.out.print((carton[i][j] == 0 ? " 0" : carton[i][j])+ " ");
            }
            System.out.println("");
        }
        assertThat(carton [1][0] ==-1).isFalse();

        assertThat(carton [1][0] == 0).isTrue();

    }

    @Test
    void buscarColumna(){
        //When (Cuando)
        // Genero los arrays columnas:
        int[] col0 = new int[3];
        int[] col1 = new int[3];
        int[] col2 = new int[3];
        int[] col3 = new int[3];
        int[] col4 = new int[3];
        int[] col5 = new int[3];
        int[] col6 = new int[3];
        int[] col7 = new int[3];
        int[] col8 = new int[3];

        int[][] carton = {col0, col1, col2, col3, col4, col5, col6, col7, col8};
        // posicion aleatoria sera 4
        int posicionAleatoria= 4;

        // Do (hacer)
        Bingo.ponerBlancos(carton);
        Bingo.buscarColumna(carton,4);

        //Then  (Entonces)
        int contador = 0;
        boolean resultado = false;
        for (int j = 0; j < carton[0].length; j++) {
            for( int i=0; i < carton.length; i++) {
                System.out.print((carton[i][j] == 0 ? " 0" : carton[i][j])+ " ");
            }
            System.out.println("");
        }

        assertThat(posicionAleatoria).isBetween(0,8);
        //Verifica que el numero aleatoria este entre 0 y 8
    }

    @Test
    void buscarValorRepetido(){

        //When (Cuando)
        // Genero  elarray

        int[] carton = {5, 7, 12, 8, 27, 15, 37, 17, 11};


        // Do (hacer)
        //Then  (Entonces)

        assertThat(Bingo.buscarValorRepetido(carton,12)).isTrue();
        //Verifica que tiene el elemento

        assertThat(Bingo.buscarValorRepetido(carton, 4)).isFalse();
        //Verifica que no tiene el elemento
    }

    @Test
    void pintarCarton () {

        //When (Cuando)
        // Genero los arrays columnas:
        int[] col0 = new int[3];
        int[] col1 = new int[3];
        int[] col2 = new int[3];
        int[] col3 = new int[3];
        int[] col4 = new int[3];
        int[] col5 = new int[3];
        int[] col6 = new int[3];
        int[] col7 = new int[3];
        int[] col8 = new int[3];

        int[][] carton = {col0, col1, col2, col3, col4, col5, col6, col7, col8};
        int[] arrayBolas = {-1,0};
        // Do (hacer)
        Bingo.ponerBlancos(carton);
        int acierto = Bingo.pintarCarton(carton, arrayBolas);

        //Then  (Entonces)

        assertThat(acierto).isEqualTo(27);
        assertThat(acierto).isNotEqualTo(2);
    }

    @Test
    void insertarAlFinal(){

        // When (Cuando)
        int[] carton = {1, 2, 3};

        // Elemento a insertar
        int elemento = 4;

        // Do (Hacer)
        int[] nuevoCarton = Bingo.insertarAlFinal(carton, elemento);


        //Then (entonces):

        for (int i = 0; i < carton.length; i++) {
            assertThat(nuevoCarton[i]).isEqualTo(carton[i]);
        }
        // Verifica que el nuevo array contenga todos los elementos del array original

        assertThat(nuevoCarton.length).isEqualTo(carton.length + 1);
        // Verifica que el nuevo array tenga un tamanio mayor que el array original
    }

    @Test
    void ordenar() {

        //When (Cuando)
        // Genero  elarray

        int[] carton = {5, 7, 12, 8, 27, 15, 37, 17, 11};


        // Do (hacer)
        //Then  (Entonces)

        Bingo.ordenar(carton);

        assertThat(carton).containsExactly(5, 7, 8, 11, 12, 15, 17, 27, 37);
        //Verifica que esta ordenado
    }
}

