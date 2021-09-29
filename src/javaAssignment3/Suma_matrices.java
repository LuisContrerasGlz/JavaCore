package javaAssignment3;

import java.util.Scanner;
// WAP to add the two matrices.
public class Suma_matrices {

	public static void main(String[] args) {
        int i,j,k;
        int [][] matriz_a = new int[3][3];
        int [][] matriz_b = new int[3][3];
        int [][] suma = {{0,0,0},{0,0,0},{0,0,0}};
        
        //crea objeto de clase scanner para leer datos 
        Scanner lee = new Scanner(System.in);
        
        
        System.out.println("Dame los elementos de la primera matriz ");
        //lectura de datos
        for (i=0;i<3;i++){
            for (j=0;j<3;j++){
                System.out.print(i);
                System.out.print("-");
                System.out.print(j);
                System.out.print(" ");
                matriz_a[i][j]=lee.nextInt();
            } 
        }

        System.out.println("Dame los elementos de la segunda matriz ");
        //lectura de datos
        for (i=0;i<3;i++){
            for (j=0;j<3;j++){
                System.out.print(i);
                System.out.print("-");
                System.out.print(j);
                System.out.print(" ");
                matriz_b[i][j]=lee.nextInt();
            } 
        }

        System.out.println("La primera Matriz es: ");
        //Muestra primera matriz ordenada por filas y columnas
        for (i=0;i<3;i++){
            for (j=0;j<3;j++){
                System.out.print(matriz_a[i][j]);
                System.out.print(" ");
            } 
            System.out.println("");
        }

        System.out.println("La segunda Matriz es: ");
        //Muestra primera matriz ordenada por filas y columnas
        for (i=0;i<3;i++){
            for (j=0;j<3;j++){
                System.out.print(matriz_b[i][j]);
                System.out.print(" ");
            } 
            System.out.println("");
        }
 
        //Calculo multiplicación de matrices  
        for (i=0;i<3;i++){
            for (j=0;j<3;j++){
                    suma[i][j]=(matriz_a[i][j]+matriz_b[i][j]);
            } 
        }

        
        System.out.println("La Matriz suma es: ");
        //lectura de datos
        for (i=0;i<3;i++){
            for (j=0;j<3;j++){
                System.out.print(suma[i][j]);
                System.out.print(" ");
            } 
            System.out.println("");
        }

	}

}
