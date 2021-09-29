package javaAssignment3;

import java.util.Scanner;

public class Ordenar_pares_nones {

	public static void main(String[] args) {
		// Creamos un objeto para la lectura de datos 
        Scanner lee = new Scanner(System.in);
        // Declaramos y creamos un array de 5 posiciones
        pares_nones numeros[] =new pares_nones[5];
        // Declaramos el indice de control del vector
        int indice=0, ind2=0, temp=0;
        String temp_np;
        
        for (indice=0;indice<numeros.length;indice++){
            numeros[indice]=new pares_nones();
        }
        
        for (indice=0;indice<5;indice++){//comentario
            numeros[indice].setNumero(0);
            numeros[indice].setPar_Non("");
        }  
        //Ciclo de lectura de los datos en la ultima posición del vector
        for (indice=0;indice<5;indice++){
            System.out.print(indice);
            System.out.print(" dato a insertar: ");
            numeros[indice].setNumero(lee.nextInt());
            if (numeros[indice].getNumero() % 2 ==0 ){
                numeros[indice].setPar_Non("P");
            }else{
                numeros[indice].setPar_Non("N");
            }
            
        }
        // impresión de los datos en el vector 
        for (indice=0;indice<5;indice++){//comentario
            System.out.print(numeros[indice].getNumero());//
            if (numeros[indice].getPar_non()=="P"){
                System.out.println("  -  Par");
            }else{
                System.out.println("  -  Non");
            }           
        }    
        for (indice=1;indice<5;indice++){
            ind2=indice;
            while (ind2>=1){
                if (numeros[ind2].getNumero()>numeros[ind2-1].getNumero()){
                    temp=numeros[ind2].getNumero();
                    temp_np=numeros[ind2].getPar_non();
                    numeros[ind2].setNumero(numeros[ind2-1].getNumero());
                    numeros[ind2].setPar_Non(numeros[ind2-1].getPar_non());
                    numeros[ind2-1].setNumero(temp);
                    numeros[ind2-1].setPar_Non(temp_np);
                    ind2--;  
                }else{
                    ind2=0;
                }

            }
        }
        
        
        System.out.println("Datos ordenados");

        // impresión de los datos en el vector 
        for (indice=0;indice<5;indice++){//comentario
            System.out.print(numeros[indice].getNumero());//
            if (numeros[indice].getPar_non()=="P"){
                System.out.println("  -  Par");
            }else{
                System.out.println("  -  Non");
            }           
        }  
        lee.close();
 
    }

}
