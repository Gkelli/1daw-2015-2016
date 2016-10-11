
public class Factorial_de_Enteros {
	public static void main(String[] args) {
		int n=0, cont=0;
		String input=" ";
		while(cont<2) {           // El usuario puede equivocarse 1 vez
			System.out.println("Introduce un nº natural");
			input = LeerTeclado.readString();
			try{                  // Leemos STRINGS para evitar salidas del programa indeseadas
				n=Integer.parseInt(input);    // pero convertimos los inputs a ENTEROS
				if(n>=0 && n<17){             // si n>17, n! ya NO es ENTERO (debería ser double)
					System.out.println("El factorial de "+ n+" es: " + factorial(n));
				}
				else {
					System.out.println("El número debe ser natural y menor que 17");
				}
			}
			catch(java.lang.NumberFormatException e){   // Se gestionan así los errores de I/O (no convertibles a integer)
				System.out.println("SÓLO números, por favor\n");
				cont++;         // Si el usuario NO introduce cifras, se le cuenta 1 error de entrada
			}
		}
		System.out.println("\nFin del programa. Gracias!\n");
	}
	private static int factorial(int i) {        // el valor de entrada DEBE ser NATURAL
		int aux;                                 // esto ha de estar protegido en la llamada a la función
		if (i == 0) aux = 1;                     // no se aplica recursividad si i=0
		else 		aux = i * factorial(i-1) ;   // Es una función recursiva (se llama a si misma)
		return aux;                              // función INTEGER (devuelve enteros así que i debe ser inferior a 17)
	}
}
