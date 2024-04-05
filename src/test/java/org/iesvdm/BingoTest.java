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

        int posicionAleatoria= 4;

        // Do (hacer)
        Bingo.ponerBlancos(carton);
        Bingo.buscarColumna(carton,4);

        //Then  (Entonces)
        int contador = 0;

        for (int j = 0; j < carton[0].length; j++) {
            for( int i=0; i < carton.length; i++) {
                System.out.print((carton[i][j] == 0 ? " 0" : carton[i][j])+ " ");
            }
            System.out.println("");
        }


        assertThat(posicionAleatoria).isBetween(0,8);

    }

    @Test
    void buscarValorRepetido(){

    }

    @Test
    void pintarCarton () {

    }

    @Test
    void ordenar() {

    }
}

