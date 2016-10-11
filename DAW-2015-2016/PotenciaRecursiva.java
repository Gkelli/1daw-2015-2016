

public class PotenciaRecursiva {

	public static void main(String[] args) {
		int base,exp;
		System.out.println("Introduce base ");
		base = LeerTeclado.readInteger();
		System.out.println("Introduce exponente ");
		exp = LeerTeclado.readInteger();
		System.out.println ("La potencia de "+base+ " elevado a "+exp+" es igual a "+potencia(base,exp));
		
	}
	public static double potencia (int a, int b){
		if (b == 0)
			return 1;
		else if (b > 0)
			return a * potencia(a, b - 1);
		else
			return 1 / potencia(a, -b);
	}
}
