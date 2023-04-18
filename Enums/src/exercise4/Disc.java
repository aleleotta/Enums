package exercise4;
import java.util.*;

public class Disc {
	private String code = "FREE";
	private String author = "EMPTY";
	private String title = "EMPTY";
	private String genre = "EMPTY";
	private int duration = 0;
	
	public Disc() {}

	public Disc(String code, String author, String title, String genre, int duration) {
		this.code = code;
		this.author = author;
		this.title = title;
		this.genre = genre;
		this.duration = duration;
	}
	
	public Disc(Disc object) {
		Disc copy = object;
	}
	
	public void toString(Disc obj) {
		System.out.println("Disc information\n"
				+ "===============================\n"
				+ "Code: " + obj.code 
				+ "\nAuthor: " + obj.author
				+ "\nTitle: " + obj.title
				+ "\nGenre: " + obj.genre
				+ "\nDuration: " + obj.duration
				+ "\n");
	}
	
	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public int getDuration() {
		return duration;
	}

	public void setDuration(int duration) {
		this.duration = duration;
	}
	
}

/*
Modifica la clase Disco para que el género sea de tipo enumerado.
Los posibles géneros que pueden tener los discos son: Rock, Pop, Electrónica, Reggaeton.
Crea un atributo de tipo Genero.

Modifica los constructores para que también se le pase el género al que pertenece el disco por parámetro.
Para ello se le añadirá un parámetro al constructor que sea de tipo String.
Añade getter y setter para el nuevo atributo.
Modifica también el método toString (o la función para imprimir por pantalla) para incorporar el género del disco.
En el main lee el género por teclado de al menos dos discos y pásalos a los constructores.
Tras realizar modificaciones sobre el objeto, imprímelos usando el método toString o
el que hayas creado para imprimir por pantalla.
*/