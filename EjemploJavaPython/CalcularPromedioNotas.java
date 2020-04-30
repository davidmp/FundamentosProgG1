/* Este codigo ha sido generado por el modulo psexport 20180802-w32 de PSeInt.
Es posible que el codigo generado no sea completamente correcto. Si encuentra
errores por favor reportelos en el foro (http://pseint.sourceforge.net). */

// En java, el nombre de un archivo fuente debe coincidir con el nombre de la clase que contiene,
// por lo que este archivo debería llamarse "CALCULARPROMEDIO.java."

import java.io.*;
import java.math.*;

public class CalcularPromedioNotas {

	// Calcular el Promedio de Notas 
	public static void main(String args[]) throws IOException {
		BufferedReader bufEntrada = new BufferedReader(new InputStreamReader(System.in));
		double nota1;
		double nota2;
		double nota3;
		double nota4;
		int promn;
		double suman;
		// Datos de Entrada y definicion de variables 
		System.out.println("Nota 1:");
		nota1 = Double.parseDouble(bufEntrada.readLine());
		System.out.println("Nota 2:");
		nota2 = Double.parseDouble(bufEntrada.readLine());
		System.out.println("Nota 3:");
		nota3 = Double.parseDouble(bufEntrada.readLine());
		System.out.println("Nota 4:");
		nota4 = Double.parseDouble(bufEntrada.readLine());
		// Proceso 
		suman = (nota1+nota2+nota3+nota4);
		promn = (int)Math.round((suman)/4);
		// Datos de Salida 
		System.out.println("La nota promedio es:"+promn);
	}


}

