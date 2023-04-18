package exercise3;
import java.util.*;

public class Main {
	public static void main(String[] args) {
		String name = ""; //All attributes for storing values and functionality of the program.
		double price = 0;
		int remainingArticles = 0;
		Article product = new Article(name, price, remainingArticles); //Object already created with default parameters that will be changed later.
		Scanner sc = new Scanner(System.in); //Scanner initiated.
		System.out.println("Introduce article details.\n"); //Filling of fields for object attributes assignment.
		do {
			System.out.print("Introduce the name of the article: ");
			name = sc.nextLine();
			sc.nextLine();
			System.out.print("Introduce the price: ");
			price = sc.nextDouble();
			System.out.print("Introduce amount of articles: ");
			remainingArticles = sc.nextInt();
			if(!(name.equals("")) && price > 0 && remainingArticles > 0) { //If all introduced details are valid then they will be assigned to object attributes.
				product.setName(name);
				product.setPrice(price);
				product.setRemainingArticles(remainingArticles);
			} else { //Otherwise the procedure is repeated.
				System.out.println("One or more details are invalid!");
			}
		} while(name.equals("") || price <= 0 || remainingArticles <= 0);
		int option = 0;
		while(option != 6) { //Menu gets executed. Once the user introduces 6 as the option. The program will exit while cycle and it will get terminated
			System.out.print("\n1) Print article details\n2) Get net price of the article\n"
					+ "3) Get net price of the article with discount\n4) Sell\n5) Store\n6) Exit program\n\nSelect an option: "); //Menu
			option = sc.nextInt();
			switch(option) {
			case 1: //Print
				product.print();
				break;
			case 2: //Get net price
				System.out.println("\nNet price: " + product.getNet());
				break;
			case 3: //Get net price with discount
				System.out.print("\nIntroduce discount: ");
				System.out.println("Price with discount: " + product.getNetDiscount());
				break;
			case 4: //Sell
				System.out.print("\nIntroduce the amount of articles to sell: ");
				boolean available = product.sell();
				if(available == true) {
					System.out.println("Current stock: " + product.getRemainingArticles());
				} else {
					System.out.println("\nThere is currently not enough stock for the sale amount requested.");
				}
				break;
			case 5: //Store
				System.out.print("\nIntroduce the amount of articles to be stored within the warehouse: ");
				product.store();
				System.out.println("Current stock: " + product.getRemainingArticles());
				break;
			case 6: //Exit
				System.out.println("\nExiting program...\n\n\nProgram terminated.");
				break;
			default: //Error message
				System.out.println("\nInvalid option, try again!");
				break;
			}
		}
		sc.close(); //Scanner closed.
	}
}

/*
Añade a la clase Articulo un tipo enumerado para determinar el departamento al que pertenece el artículo. 
Este tipo enumerado debe contener los siguientes valores: Electrónica, Alimentación, Droguería.
Crea un atributo de tipo Departamento.

Modifica los constructores para que también se le pase el departamento al que pertenece el artículo por parámetro.
Para ello se le añadirá un parámetro al constructor que sea de tipo Departamento.
Añade getter y setter para el nuevo atributo.
Modifica también el método toString (o la función para imprimir por pantalla) para incorporar el departamento del artículo.
En el main lee el departamento por teclado de al menos dos artículos y pásalos a los constructores.
Tras realizar modificaciones sobre el objeto,
imprímelos usando el método toString o el que hayas creado para imprimir por pantalla.
*/