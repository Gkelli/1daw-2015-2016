package metodos_sencillos;

public class Primos {
	public static void main(String[] args) {
		int n=0, cont=0, limiteErroresI_O=2, limiteNumerosCalculables=1000;
		String input=" ";
		while(cont<limiteErroresI_O) {           // El usuario puede equivocarse 1 vez
			System.out.print("Introduce un nº natural y menor que "+ limiteNumerosCalculables);
			input = LeerTeclado.readString();
			try{
				n=Integer.parseInt(input);
				if(n<limiteNumerosCalculables && n>0){  // hay que poner un límite para evitar colgar la máquina
					if (primo(n)) System.out.println("El número "+ input +" es primo!");
					else System.out.println(input +" no es primo. Inténtelo con otro número\n");
				}
				else {
					System.out.println("El número debe ser natural y menor que "+ limiteNumerosCalculables);
				}
			}
			catch(java.lang.NumberFormatException e){   // Se gestionan así los errores de I/O (no convertibles a integer)
				System.out.println("SÓLO números, por favor\n");
				cont++;         // Si el usuario NO introduce cifras, se le cuenta 1 error de entrada
			}
		}	// Fin del while
		System.out.println("Fin del programa. Gracias \n ");
	}
	private static boolean primo (int num){
		for (int divisor =2; divisor<num;divisor++){
			if(num%divisor == 0) return false;	
		}
		return true;
	}
}
