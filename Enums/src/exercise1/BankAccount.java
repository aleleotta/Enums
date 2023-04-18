package exercise1;
import java.util.*;
/**
 * Class that defines all necessary functions to create a basic bank account and to manage the balance.
 * @author aleleotta
 *
 */
public class BankAccount {
	
	private final String DNI; //Declaration of all global attributes within class. This attributes will later be constructed within constructors.
	private String firstName;
	private String lastName;
	private double balance;
	
	enum Gender{
		MALE,
		FEMALE;
	}
	private Gender gender;
	
	public BankAccount(String DNI, double balance){ //First object constructed without name attribute.
		this.DNI = DNI;
		this.balance = balance;
	}
	
	public BankAccount(String DNI, String firstName, String secondName, String gender, double balance){ //Second object constructed with name attribute.
		this.DNI = DNI;
		this.firstName = firstName;
		this.lastName = secondName;
		this.balance = balance;
		this.gender = Gender.valueOf(gender);
	}

	public void depositMoney() { //This method will check if the account balance is positive and if true it will add a certain amount that the user introduces.
		double addBalance;
		Scanner sc = new Scanner(System.in);
		System.out.print("Introduce the amount of money you want to deposit into your account balance: ");
		addBalance = sc.nextDouble();
		this.balance = this.balance + addBalance;
	}

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

	public void printInformation() { //Prints all account information without name.
		System.out.println("DNI: " + getDNI() + "\nName: " + getFirstName() + " " + getLastName() + "\nGender: " + getGender() + "\nBalance: " + getBalance() + "€");
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String secondName) {
		this.lastName = secondName;
	}
	
	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public String getDNI() {
		return DNI;
	}

	public Gender getGender() {
		return gender;
	}

	public void setGender(Gender gender) {
		this.gender = gender;
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