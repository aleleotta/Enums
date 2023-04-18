package exercise3;
import java.util.*;
/**
 * Class that contains all Article attributes and methods for the program.
 * @author aleleotta
 */
public class Article {
	/**
	 * Name attribute that stores a String that the user introduces for the article.
	 */
	private String name = "";
	/**
	 * Price attribute that stores a double type value that the user introduces for the article.
	 */
	private double price = 0;
	/**
	 * IVA attribute that stores a double type value and cannot be changed for being a final attribute.
	 */
	private final double IVA = 1.21;
	/**
	 * Price with IVA calculated.
	 */
	private double netPrice;
	/**
	 * Discount that can be used if the user chooses to apply it to the price. The discount can be any number.
	 */
	private double discount = 0;
	/**
	 * Remaining Articles attribute that is used to store the amount of articles within the warehouse. This attribute can be changed anytime after the used creates the object initially.
	 */
	private int remainingArticles = 0;
	/**
	 * Article constructor with 3 parameters that is used to create an object (The article with all introduced values from the main.)
	 * @param name User introduced name for the following article.
	 * @param price User introduced price for the following article.
	 * @param remainingArticles Amount of articles that the user chose for the following article.
	 */
	public Article(String name, double price, int remainingArticles) {
		this.name = name;
		this.price = price;
		this.remainingArticles = remainingArticles;
	}
	/**
	 * Method that is used to print out all article current details whenever the user chooses to use it.
	 */
	public void print() {
		System.out.println("\nName: " + getName() + "\nPrice (without IVA): " + getPrice() + "\nRemaining articles: " + getRemainingArticles());
	}
	/**
	 * Method that is used to calculate the net price of the article.
	 * @return Returns the net price to main.
	 */
	public double getNet() {
		this.netPrice = this.price * this.IVA;
		return netPrice;
	}
	/**
	 * Method that is used to calculate the net price with a discount of choice for the user.
	 * @return Returns the discounted price to main.
	 */
	public double getNetDiscount() {
		Scanner sc = new Scanner(System.in);
		this.discount = sc.nextDouble();
		double subtractAmount = netPrice * discount;
		double netPriceDiscount = netPrice - subtractAmount;
		return netPriceDiscount;
	}
	/**
	 * Method that is used for selling articles for the current amount of articles.
	 * The user can choose how many articles to sell.
	 * If the amount to sell is more than the current amount of articles 
	 * within the warehouse then the method will return false and the exporting procedure will be canceled.
	 * @return Returns boolean value to main to show the program if the procedure went well.
	 */
	public boolean sell() {
		boolean unitsAvailable = true;
		Scanner sc = new Scanner(System.in);
		int unitsSold = sc.nextInt();
		if(this.remainingArticles > 0) {
			this.remainingArticles = this.remainingArticles - unitsSold;
		} else {
			unitsAvailable = false;
		}
		return unitsAvailable;
	}
	/**
	 * Method that is used to store additional article units to the warehouse. The user can add any amount.
	 */
	public void store() {
		Scanner sc = new Scanner(System.in);
		int unitsStored = sc.nextInt();
		this.remainingArticles = this.remainingArticles + unitsStored;
	}
	/**
	 * Name getter
	 * @return Returns name attribute to wherever this method is called.
	 */
	public String getName() {
		return name;
	}
	/**
	 * Name setter
	 * @param name Takes new value from main and stores it to private attribute name.
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * Price getter
	 * @return Returns price attribute to wherever this method is called.
	 */
	public double getPrice() {
		return price;
	}
	/**
	 * Price setter
	 * @param price Takes new value from main and stores it to private attribute price.
	 */
	public void setPrice(double price) {
		this.price = price;
	}
	/**
	 * remainingArticles getter
	 * @return Returns remainingArticles attribute to wherever this method is called.
	 */
	public int getRemainingArticles() {
		return remainingArticles;
	}
	/**
	 * remainingArticles setter
	 * @param remainingArticles Takes new value from main and stores it to private attribute remainingArticles.
	 */
	public void setRemainingArticles(int remainingArticles) {
		this.remainingArticles = remainingArticles;
	}
	/**
	 * IVA getter
	 * @return Returns IVA final attribute to wherever this method is called.
	 */
	public double getIVA() {
		return IVA;
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