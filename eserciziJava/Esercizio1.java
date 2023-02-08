package eserciziJava;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
/*
Scrivere un programma che inserisca dentro un array di 100 elementi 100 numeri random
 compresi tra 0 e 50.
 
Il programma deve avere anche una variabile che contiene un numero intero compreso
 tra 0 e 50. 

Scrivere un algoritmo che elimini dall'array tutti i numeri multipli del numero contenuto
 della variabile intera, sostituendoli con il numero 0.

Stampare tutti i valori dell'array.*/

public class Esercizio1 {

	public static void main(String[] args) {
		System.out.println("Inserisci il minimo");
		Scanner minimo = new Scanner(System.in);
		int min = minimo.nextInt();
		System.out.println("Inserisci il massimo");
		Scanner massimo = new Scanner(System.in);
		int max = massimo.nextInt();
		int range = min + max;
		int my_array[] = new int[100];
		int varRichiesta = (int) (Math.random() * range) + min;

		System.out.println("Variabile generata per i multipli=  " + varRichiesta);

		Esercizio1 myObj = new Esercizio1();
		
		System.out.println();
		System.out.println("Costruisco array...");
		System.out.println();
		myObj.costruisciArray(my_array, min, max);
		System.out.println();
		myObj.stampaArray(my_array);
		System.out.println();
		System.out.println("Elimino dall'array tutti i numeri multipli del numero: " + varRichiesta);
		System.out.println();
		myObj.modificaArray(my_array, varRichiesta);
		myObj.stampaArray(my_array);
		
		minimo.close();
		massimo.close();
	}

	public int[] costruisciArray(int my_array[], int min, int max) {
		int range = min + max;
		for (int i = 0; my_array.length > i; i++) {
			int rnd = (int) (Math.random() * range) + min;
			my_array[i] = rnd;
		}
		return my_array;
	}

	public int[] modificaArray(int array[], int variabile) {

		List<Integer> listaMultipli = new ArrayList<Integer>();

		for (int i = 0; array.length > i; i++) {

			if (array[i] % variabile == 0) {
				listaMultipli.add(array[i]);
				array[i] = 0;
			}
		}

		if (!listaMultipli.isEmpty()) {
			
			System.out.println();
			System.out.println("Sono stati trovati " + listaMultipli.toArray().length + " numeri multipli di "
					+ variabile + " dall'array");

			for (int multiplo : listaMultipli) {

				System.out.println("Stampo " + multiplo +" multiplo di: " + variabile);

			}

		}

		return array;
	}

	public void stampaArray(int my_array[]) {

		boolean flag = false;

		for (int i = 0; my_array.length > i; i++) {

			System.out.printf("|%-5s", +my_array[i] + "|");

			if (i > (my_array.length / 2 - 1) && flag == false) {
				flag = true;
				System.out.println();
				System.out.println("arrivato alla posizione: " + i + " il numero 50 è " + my_array[i]);
				System.out.println();
			}
			if (i == (my_array.length - 1)) {
				System.out.println();
				System.out.println("ultimo numero " + my_array[i] + " alla posizione: " + (i + 1));
			}
		}

	}
}
