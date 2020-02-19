package Practica7;

public class Practica7_2 {

	public static void main(String[] args) {
		double i=0,max=100;
		double seno=0,coseno=0,tangente=0,logaritmo=0,raiz=0;
		while(i<max) {
			seno+=Math.sin(i);
			coseno+=Math.cos(i);
			tangente+=Math.tan(i);
			logaritmo+=Math.log(i);
			raiz+=Math.sqrt(i);
			i++;
		}
		System.out.println("sen: "+ seno);
		System.out.println("cos: "+ coseno);
		System.out.println("tan: "+ tangente);
		System.out.println("log: "+ logaritmo);
		System.out.println("raiz: "+ raiz);
	}

}
