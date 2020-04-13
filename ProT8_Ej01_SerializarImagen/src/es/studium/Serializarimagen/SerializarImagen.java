package es.studium.Serializarimagen;

public class SerializarImagen
{
	public static void main(String[] args)
	{
		// Primero serializa el fichero imagen.jpg en salida.txt
		// Y luego deserializa salida.txt en outputImage.jpg
		String entrada1 = "imagen.jpg";
		String salida1 = "jpgSerializado.txt";
		String entrada2 = "imagen.bmp";
		String salida2 = "bmpSerializado.txt";
		String entrada3 = "imagen.gif";
		String salida3 = "gifSerializado.txt";
		try
		{
			// Serializar la imagen indicada
			String encoded1 = Base64.encodeFromFile(entrada1);
			String encoded2 = Base64.encodeFromFile(entrada2);
			String encoded3 = Base64.encodeFromFile(entrada3);
			// Mostrar por consola el resultado
			System.out.println(encoded1);
			System.out.println(encoded2);
			System.out.println(encoded3);
			// Serializar directamente a otro fichero
			Base64.encodeFileToFile(entrada1,salida1);
			Base64.encodeFileToFile(entrada2,salida2);
			Base64.encodeFileToFile(entrada3,salida3);
		}
		catch( java.io.IOException e )
		{
			System.out.println(e);
		}
	}
}