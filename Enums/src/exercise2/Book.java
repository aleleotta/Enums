package exercise2;
import java.util.*;
/**
 * Class that defines all attributes, constructors and methods for class Book.
 * @author aless
 *
 */
public class Book {
	/**
	 * The book title.
	 */
	private String title = "";
	/**
	 * The book author.
	 */
	private String author = "";
	/**
	 * All copies for the following book.
	 */
	private int copies = 0;
	/**
	 * All the borrows for the following book.
	 */
	private int borrows = 0;
	/**
	 * Book empty constructor
	 */
	public Book() {}
	/**
	 * Book constructor with all parameters.
	 * @param title Title reference from Main attribute with already introduced string.
	 * @param author Author reference from Main attribute with already introduced string.
	 * @param copies Copies reference from Main attribute with already introduced value.
	 * @param borrows Title reference from Main attribute with default value = 0.
	 */
	public Book(String title, String author, int copies, int borrows) {
		this.title = title;
		this.author = author;
		this.copies = copies;
		this.borrows = borrows;
	}
	/**
	 * Title getter
	 * @return Returns title to where it gets called.
	 */
	public String getTitle() {
		return title;
	}
	/**
	 * Title setter
	 * @param title Sets a value for non-static private attribute within Book class.
	 */
	public void setTitle(String title) {
		this.title = title;
	}
	/**
	 * Author getter
	 * @return Returns author to where it gets called.
	 */
	public String getAuthor() {
		return author;
	}
	/**
	 * Author setter
	 * @param author Sets a value for non-static private attribute within Book class.
	 */
	public void setAuthor(String author) {
		this.author = author;
	}
	/**
	 * Copies getter
	 * @return Returns copies to where it gets called.
	 */
	public int getCopies() {
		return copies;
	}
	/**
	 * Copies setter
	 * @param copies Sets a value for non-static private attribute within Book class.
	 */
	public void setCopies(int copies) {
		this.copies = copies;
	}
	/**
	 * Borrows getter
	 * @return Returns borrows to where it gets called.
	 */
	public int getBorrows() {
		return borrows;
	}
	/**
	 * Borrows setter
	 * @param borrows Sets a value for non-static private attribute within Book class.
	 */
	public void setBorrows(int borrows) {
		this.borrows = borrows;
	}
	/**
	 * Increments borrows by 1 and decrements copies by 1.
	 */
	public void increaseBorrows() {
		if(this.copies > 0) {
			this.borrows++;
			this.copies--;
		} else {
			System.out.println("\nThere are no copies available. Please try again later!\n");
		}
	}
	/**
	 * Increments copies by 1 and decrements borrows by 1.
	 */
	public void decreaseBorrows() {
		if(this.borrows > 0) {
			this.copies++;
			this.borrows--;
		} else {
			System.out.println("\nThere are no copies to return because all copies are available.\n");
		}
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