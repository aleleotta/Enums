package exercise1;
import java.util.*;
/**
 * Class that defines all necessary functions to create a basic bank account and to manage the balance.
 * @author aleleotta
 *
 */
public class BankAccount {
	/**
	 * Identifies the bank account owner. Final means once the DNI has been defined it cannot be changed.
	 */
	private final String DNI; //Declaration of all global attributes within class. This attributes will later be constructed within constructors.
	/**
	 * First name of the owner.
	 */
	private String firstName;
	/**
	 * Last name of the owner.
	 */
	private String lastName;
	/**
	 * Balance of the owner's bank account.
	 */
	private double balance;
	/**
	 * This object will be used after the bank account has been created.
	 * @param DNI Identifies owner.
	 * @param balance Amount of money within bank account.
	 */
	public BankAccount(String DNI, double balance){ //First object constructed without name attribute.
		this.DNI = DNI;
		this.balance = balance;
	}
	/**
	 * This object will be used initially to introduce all details to create a bank account.
	 * @param DNI Identifies owner.
	 * @param firstName Owner's first name.
	 * @param secondName Owner's last name.
	 * @param balance Amount of money within bank account.
	 */
	public BankAccount(String DNI, String firstName, String secondName, double balance){ //Second object constructed with name attribute.
		this.DNI = DNI;
		this.firstName = firstName;
		this.lastName = secondName;
		this.balance = balance;
	}
	/**
	 * This method is used when the owner wants to deposit money into balance.
	 */
	public void depositMoney() { //This method will check if the account balance is positive and if true it will add a certain amount that the user introduces.
		double addBalance;
		Scanner sc = new Scanner(System.in);
		System.out.print("Introduce the amount of money you want to deposit into your account balance: ");
		addBalance = sc.nextDouble();
		this.balance = this.balance + addBalance;
	}
	/**
	 * This method is used when the owner wants to withdraw money from balance.
	 */
	public void withdrawMoney() { //This method will check if the account balance is positive and if true it will subtract a certain amount that the user introduces.
		double subtractBalance;
		Scanner sc = new Scanner(System.in);
		if(this.balance > 0) {
			System.out.print("Introduce the amount of money you want to withdraw from your account balance: ");
			subtractBalance = sc.nextDouble();
			this.balance = this.balance - subtractBalance;
		} else {
			System.out.println("WARNING! Your balance is below zero!");
		}
	}
	/**
	 * This function will be used to print all bank account information.
	 */
	public void printInformation() { //Prints all account information without name.
		System.out.println("DNI: " + getDNI() + "\nName: " + getFirstName() + " " + getLastName() + "\nBalance: " + getBalance() + "€");
	}
	/**
	 * First name getter
	 * @return Returns first name.
	 */
	public String getFirstName() {
		return firstName;
	}
	/**
	 * First name setter
	 * @param firstName Sets new value to private attribute.
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	/**
	 * Last name getter.
	 * @return Returns last name.
	 */
	public String getLastName() {
		return lastName;
	}
	/**
	 * Second name setter
	 * @param secondName Sets new value to private attribute.
	 */
	public void setLastName(String secondName) {
		this.lastName = secondName;
	}
	/**
	 * Balance getter
	 * @return Returns balance.
	 */
	public double getBalance() {
		return balance;
	}
	/**
	 * Balance setter
	 * @param balance Sets new value to private attribute.
	 */
	public void setBalance(double balance) {
		this.balance = balance;
	}
	/**
	 * DNI getter
	 * @return Returns DNI.
	 */
	public String getDNI() {
		return DNI;
	}
}

/*Añade a la clase CuentaCorriente un enumerado llamado Sexo para indicar el sexo del titular (Femenino, Masculino).
Crea también un atributo de nombre sexo que sea de tipo Sexo.
Modifica los constructores para que también se le pase el sexo del titular por parámetro.
Éste debe pasarse como String.
Añade getter y setter para el nuevo atributo.
Modifica también el método toString (o la función para imprimir por pantalla la clase CuentaCorriente)
para incorporar el sexo del titular.
En el main lee el sexo por teclado de al menos dos titulares y pásalos a los constructores.
Tras realizar modificaciones sobre el objeto, imprímelos usando el método toString o
el que hayas creado para imprimir por pantalla.
*/