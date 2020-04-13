package es.Studium.Cadena;
//El paquete java.io posee las clases necesarias para los archivos
import java.io.*;
public class LeerCadena
{
	public LeerCadena()
	{
		//Como usaremos FileReader y puede lanzar una excepci�n
		//necesitaremos un bloque try � catch
		try
		{
			//Origen de los datos en el proyecto anterior
			FileReader fr = new FileReader("./Cadena.txt");
			//Buffer de lectura
			BufferedReader entrada = new BufferedReader(fr);
			String s;
			//Bucle para sacar la informaci�n del archivo
			while((s=entrada.readLine())!=null)
			{
				System.out.println(s);
			}
			//Cerrar el objeto entrada
			entrada.close();
			fr.close();
		}
		catch(FileNotFoundException e)
		{
			System.out.println("Archivo NO encontrado");
		}
		catch(IOException i)
		{
			System.out.println("Se produjo un error de Archivo");
		}
	}
	public static void main(String[] args)
	{
		new LeerCadena();
	}
}