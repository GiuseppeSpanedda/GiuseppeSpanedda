package eserciziperlaforma;

import java.util.Scanner;

/*
Utilizzando creare un array di 20 elementi che contenga numeri interi compresi tra -3 e 3.

Utilizzando il do while(suggerimento) calcolare la somma dei numeri contenuti nell'array, 
finchè non si ottiene un numero minore o uguale a 0.

A quel punto stamapre la somma ottenuta e gli eventuali numeri restanti nell'array,
restanti significa che non sono stati utilizzati per fare la somma che è stata stampata.
*/

public class Esercizio2 {

	public static void main(String[] args) {
		System.out.println("Inserisci il minimo");
		Scanner minimo = new Scanner (System.in);
		int b= minimo.nextInt();
		System.out.println("Inserisci il massimo");
		Scanner massimo = new Scanner (System.in);
		int c = massimo.nextInt();
		System.out.println("Inserisci la dimensione desiderata dell'array");
		Scanner dimensioneArray = new Scanner (System.in);
		int a =dimensioneArray.nextInt();
		Esercizio2 myObj = new Esercizio2();
		myObj.passaArray(a,b,c);
		
		minimo.close();
		massimo.close();
		dimensioneArray.close();

	}
	
	public void passaArray(int dimensione, int min, int max) {
		Esercizio2 myObj = new Esercizio2();
		myObj.cacoloSomma(myObj.costruisciArray(dimensione, min, max));
	}

	public int[] costruisciArray(int dimensione, int min, int max) {

		int range = min + max;
		int array[] = new int[dimensione];
		System.out.println("Genero i numeri compresi tra: "+ min+ " e "+ max+"....");
		for (int i = 0; i < array.length; i++) {
			int rnd = (int) (Math.random() * range) + min;
			System.out.printf("|%-5s", +rnd + "|");
			array[i] = rnd;
		}
		return array;

	}

	public int[] cacoloSomma(int array[]) {
		System.out.println();
		System.out.println("Calcolo la somma...");
		boolean flag = true;
		int somma = 0;
		int k = 0;
		Esercizio2 myObj = new Esercizio2();
		do {
			for (int i = 0; i < array.length; i++) {
				somma += array[i];
				if (somma == 0) {
					flag = false;
					break;
				}
			}
			
			somma += array [k];
			k++;
			if (somma >= 0) {
				System.out.println();
				System.out.println("Somma ottenuta :"+ somma + " all'indice: "+array[k]);
				myObj.stampaArrayDopoSomma(array, k);
			}
		} while (k<array.length);

		return array;
	}
	
	public void stampaArrayDopoSomma(int array [],int a) {
		
		for (int i = a; i < array.length; i++) {
			System.out.println();
			System.out.println("I restanti numeri dell'array sono:");
			System.out.print(array[i]);
		}
	
	}
}
