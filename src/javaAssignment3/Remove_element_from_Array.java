package javaAssignment3;

import java.util.Scanner;

// WAP to remove the element on specific index number form an array
public class Remove_element_from_Array {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String amigos[] = {"Fernando", "Barbara", "Luis", "Abril", "Martin", "Silvia"};
		
		int posicion = 0;
		int indice = 0;
		int pasos = 0;
		String seguir = "s";
		
		for (indice=0;indice<5;indice++) {
			System.out.println(amigos[indice]);
		}
		
		while (seguir.equals("s")) {
			pasos=0;
			 System.out.println("Posicion del dato a eliminar");
			 posicion = s.nextInt();
			 for (indice=posicion;indice<=3;indice++) {
				 amigos[indice]=amigos[indice+1];
				 pasos=pasos+1;
				 
			 }
			 amigos[4]="";
			 pasos=pasos+1;
			 
			 for(indice=0;indice<5;indice++) {
				 System.out.println(amigos[indice]);
			 }
			 
			 System.out.println("Pasos");
			 System.out.println(pasos);
			 System.out.println("Continuar eliminando");
			 seguir = s.next();
			
		}

	}

}
