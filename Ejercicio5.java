
public class Ejercicio5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int A = 2;
		int B = 3;
		int C = 1;
		int D = 6;
		int aux;
		int aux2;
		
		System.out.println("valores iniciales de las variables A = " +A+ " B = " +B+ " C = " +C+ " D = " +D);
		
		aux = B;
		B = C;
		aux2 = D;
		D = aux;
		C = A;
		A = aux2;
		
		System.out.println("B tomando el valor de C. B = " + B);
		System.out.println("C tomando el valor de A. C = " + C);
		System.out.println("A tomando el valor de D. A = " + A);
		System.out.println("D tomando el valor de B. D = " + D);

	}

}
