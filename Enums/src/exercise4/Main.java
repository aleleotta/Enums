package exercise4;
import java.util.*;

public class Main {
	public static void main(String[] args) {
		int counter = 0;
		Disc list[] = new Disc[10];
		Scanner sc = new Scanner(System.in);
		Disc discs;
		for(int i = 0; i < list.length; i++) {
			discs = new Disc();
			list[i] = discs;
		}
		int option = 0;
		while(option != 5) {
			System.out.print("\nDISC COLLECTION\n"
					+ "===============================\n"
					+ "1) List\n"
					+ "2) New disc\n"
					+ "3) Modify\n"
					+ "4) Delete\n"
					+ "5) Exit\n\n"
					+ "Option: ");
			option = sc.nextInt();
			switch(option) {
			case 1: //READ
				int i = 0;
				System.out.println("LIST\n===============================\n");
				for(Disc read: list) {
					i++;
					System.out.println(i + ")\n" + "Code: " + read.getCode()
					+ "\nAuthor: " + read.getAuthor()
					+ "\nTitle: " + read.getTitle()
					+ "\nGenre: " + read.getGenre()
					+ "\nDuration: " + read.getDuration() + " s\n");
				}
				break;
			case 2: //CREATE
				if(counter < 10) {
					String code, author, title, genre;
					int duration;
					System.out.print("Introduce code: ");
					code = sc.next();
					System.out.print("\nIntroduce author: ");
					sc.nextLine();
					author = sc.nextLine();
					System.out.print("\nIntroduce title: ");
					title = sc.nextLine();
					System.out.print("\nIntroduce genre: ");
					genre = sc.next();
					System.out.print("\nIntroduce duration: ");
					duration = sc.nextInt();
					discs = new Disc(code, author, title, genre, duration);
					list[counter] = discs;
					counter++;
				} else {
					System.out.println("\nFULL!\n===============================\n");
				}
				break;
			case 3: //UPDATE
				String codeForModify, author, title, genre;
				int duration;
				boolean found = false;
				System.out.print("Introduce code: "); //Code required for array search
				codeForModify = sc.next();
				for(Disc read: list) { //Search
					if(read.getCode().equals(codeForModify)) {
						found = true;
						int option1 = 0;
						while(option1 != 5) {
							System.out.print("\nOptions\n\n1) Modify Author\n2) Modify Title\n3) Modify Genre\n4) Modify Duration\n5) Exit\n\nOption: ");
							option1 = sc.nextInt();
							if(option1 == 5) {
								System.out.println("CONFIRM? Y/N");
								char confirm = sc.next().charAt(0);
								if(confirm == 'N') {
									option1 = 0;
								}
							}
							switch(option1) {
							case 1:
								System.out.print("New Author: ");
								sc.nextLine();
								author = sc.nextLine();
								read.setAuthor(author);
								break;
							case 2:
								System.out.print("New Title: ");
								sc.nextLine();
								title = sc.nextLine();
								read.setTitle(title);
								break;
							case 3:
								System.out.print("New Genre: ");
								sc.nextLine();
								genre = sc.nextLine();
								read.setGenre(genre);
								break;
							case 4:
								System.out.print("New Duration: ");
								sc.nextLine();
								duration = sc.nextInt();
								read.setDuration(duration);
								break;
							default:
								if(option1 != 5 && option1 != 0) {
									System.out.println("INVALID!");
								}
								break;
							}
						}
					}
				}
				if(found == false) {
					System.out.println("The following code is not found within the collection.");
				}
				break;
			case 4: //DELETE
				String codeForDelete = "";
				codeForDelete = sc.next();
				for(Disc read: list) {
					int counter1 = 0;
					if(read.getCode().equals(codeForDelete)) {
						discs = new Disc();
						list[counter1] = discs;
					}
					counter1++;
				}
				counter--;
				break;
			case 5: //EXIT
				System.out.println("\n\nExiting CRUD...\n\n\nCRUD terminated.");
				break;
			default: //ERROR
				System.out.println("\nERROR!");
				break;
			}
		}
		sc.close();
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