package Practica7;

import java.util.Random;

public class Practica7_1 {

	public static void main(String[] args) {
		long  numeroPalabras=26*26*26*1000;
		numeroPalabras=(numeroPalabras*3)+(numeroPalabras-1);
		int control=0;
		char[] cadena = new char[(int) numeroPalabras];
		int i = 0;
//	    System.out.println(i);
	    for (int j = 0; j < numeroPalabras; j++)
		{
			if (control<3){
				i=(int) (Math.random()*'Z')%('Z'-'A');
				cadena[j]=(char) ('A'+ i);
				//cadena[j]='L';
				control++;
			}
			else{
				cadena[j]=' ';
				control=0;
			}
		}
	    int contador=0;
		for (int j = 0; j <numeroPalabras-2 ; j++)
		{
			if((cadena[j]=='I') && (cadena[j+1]=='P') && (cadena[j+2]=='N')){
				System.out.println(j+": "+cadena[j]+cadena[j+1]+cadena[j+2]);
				contador++;
			}
		}
		System.out.println("\nTotal de repeticiones = "+contador );
	}

}
