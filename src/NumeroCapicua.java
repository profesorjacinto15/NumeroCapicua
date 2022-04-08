import java.util.Scanner;

public class NumeroCapicua {

	public static int darLaVuelta (int num) {
		String numero = ""+num;
		String resultado = "";
		int posicion = numero.length()-1;
		do {
			resultado += numero.charAt(posicion);
			posicion--;
		} while (posicion >= 0);
		int resu = Integer.parseInt(resultado);
		return resu;
	}
	
	public static boolean esCapicua(int num) {
		int numAlReves = darLaVuelta(num);
		if (num == numAlReves) {
			return true;
		} else {
			return false;
		}
	}
	
	public static String crearCapicua (int num) {
		int numAlReves = darLaVuelta(num);
		String capicua = "" + num + numAlReves;
		int resu = Integer.parseInt(capicua);
		return capicua;
	}
	
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int numero = solicitarValor(teclado);
		
		if (esCapicua(numero)) {
			System.out.println("\nEl numero introducido es capicua.");
		} else {
			System.out.println("\nEl numero introducido NO es capicua.");
			System.out.print("Se puede generar el siguiente con : ");;
			String capicua = crearCapicua(numero);
			System.out.println(capicua);
		}
		teclado.close();
	}

	public static int solicitarValor(Scanner tec) {
		int numero;
		do {
			System.out.println("-----------------------------------------------");
			System.out.print("Inserta el numero a comprobar si es capicua: ");
			numero = tec.nextInt();
		} while (numero <=0);
		return numero;
	}
}
