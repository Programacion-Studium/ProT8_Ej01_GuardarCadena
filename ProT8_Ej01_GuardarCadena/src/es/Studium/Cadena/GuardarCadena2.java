package es.Studium.Cadena;
import java.io.*;
import java.util.Scanner;
public class GuardarCadena2
{
	public GuardarCadena2()
	{
		try //FileWriter también puede lanzar una excepción
		{
			System.out.println("Introduce la cadena a guardar y pulsa enter");
			Scanner sc = new Scanner(System.in);
			 String cadena = sc.nextLine();
			// Destino de los datos
			//Si ponemos true añade al fichero, si no lo ponemos o ponemos false, nos sustituira el fichero, guardando la nueva informacion.
			FileWriter fw = new FileWriter("cadena.txt", true);
			// Buffer de escritura
			BufferedWriter bw = new BufferedWriter(fw);
			// Objeto para la escritura
			PrintWriter salida = new PrintWriter(bw);
			
			salida.println(cadena);
			
			salida.close();
			bw.close();
			fw.close();
			sc.close();
			System.out.println("¡Archivo creado correctamente!");
		}
		catch(IOException i)
		{
			System.out.println("Se produjo un error de Archivo");
		}
	}
	public static void main(String[] args)
	{
		new GuardarCadena2();
	}
}
