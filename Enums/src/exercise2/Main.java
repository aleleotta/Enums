package exercise2;

import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		sc.close();
	}
}

/*Añade a la clase Libro un enumerado llamado Genero que contenga los siguientes valores:
Narrativo, Lírico, Dramático, Didáctico y Poético.
Crea también un atributo de tipo Genero y de nombre genero para identificar el género de cada libro.

Modifica los constructores para que también se le pase el género del libro por parámetro. Para ello se le añadirá un parámetro al constructor que sea de tipo Genero.
Añade getter y setter para el nuevo atributo.

Modifica también el método toString (o la función para imprimir por pantalla) para incorporar el genero del libro.
En el main lee el género por teclado de al menos dos libros y pásalos a los constructores.
Tras realizar modificaciones sobre el objeto, imprímelos usando
el método toString o el que hayas creado para imprimir por pantalla.
*/