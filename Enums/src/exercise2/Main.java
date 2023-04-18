package exercise2;
import java.util.*;

public class Main {
	public static void main(String[] args) {
		String title, author = ""; //All attributes for storing values and functionality of the program.
		int copies, borrows = 0;
		int option = 0;
		Scanner sc = new Scanner(System.in); //Scanner initiated.
		System.out.print("Insert book details.\n\nTitle: "); //Filling of fields for object creation.
		title = sc.nextLine();
		System.out.print("Author: ");
		author = sc.nextLine();
		System.out.print("Copies: ");
		copies = sc.nextInt();
		Book libro = new Book(title, author, copies, borrows); //Object created.
		System.out.println("\nTitle: " + libro.getTitle() + "\nAuthor: " + libro.getAuthor() //First information printing.
		+ "\nCopies: " + libro.getCopies() + "\nBorrows: " + libro.getBorrows() + "\n");
		while(option != 3) { //Menu gets executed. Once the user introduces 3 as the option. The program will exit while cycle and it will get terminated.
			System.out.print("1) Borrow book\n2) Return book\n3) End program\n\nSelect an option: "); //Menu
			option = sc.nextInt();
			System.out.println();
			switch(option) {
			case 1: //Borrow
				libro.increaseBorrows();
				System.out.println("Title: " + libro.getTitle() + "\nAuthor: " + libro.getAuthor()
				+ "\nCopies: " + libro.getCopies() + "\nBorrows: " + libro.getBorrows() + "\n");
				break;
			case 2: //Return
				libro.decreaseBorrows();
				System.out.println("Title: " + libro.getTitle() + "\nAuthor: " + libro.getAuthor()
				+ "\nCopies: " + libro.getCopies() + "\nBorrows: " + libro.getBorrows() + "\n");
				break;
			case 3: //Exit
				System.out.println("\n\n\nHave a nice day!");
				break;
			default: //Error message
				System.out.println("\n\n\nInsert a valid option!");
				break;
			}
		}
		sc.close(); //Scanner closing.
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