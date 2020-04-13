package es.Studium.Cadena;
import java.io.*;
public class GuardarCadena
{
	public GuardarCadena()
	{
		try //FileWriter también puede lanzar una excepción
		{
			System.out.println("Introduce la cadena a guardar y pulsa enter");
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); //Creamos scaner por teclado
			String cadena = br.readLine(); //Se lee el nombre con readLine() que retorna un String con el dato
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
			System.out.println("¡Archivo creado correctamente!");
		}
		catch(IOException i)
		{
			System.out.println("Se produjo un error de Archivo");
		}
	}
	public static void main(String[] args)
	{
		new GuardarCadena();
	}
}
