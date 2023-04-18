package exercise1;
import java.util.*;

public class Main {
	public static void main(String[] args) {
		String DNI = ""; //All attributes for storing values and functionality of the program.
		String firstName = "";
		String lastName = "";
		double balance = 0;
		int option = 1;
		Scanner sc = new Scanner(System.in); //Scanner initiated.
		BankAccount account; //Object declared.
		while(DNI.equals("") || firstName.equals("") || lastName.equals("") || balance < 0) { //Filling of fields for object creation.
			System.out.print("Introduce your DNI: ");
			DNI = sc.next();
			System.out.print("Introduce your first name: ");
			firstName = sc.next();
			System.out.print("Introduce your last name: ");
			lastName = sc.next();
			System.out.print("Introduce your balance: ");
			balance = sc.nextDouble();
		}
		account = new BankAccount(DNI, firstName, lastName, balance); //Object created.
		while(option != 4) { //Menu gets executed. Once the user introduces 4 as the option. The program will exit while cycle and it will get terminated.
			System.out.print("\n1) Deposit money.\n2) Withdraw money.\n3) Print information\n4) Exit program\n\n\nOption: "); //Menu
			option = sc.nextInt();
			switch(option) {
			case 1: //Deposit
				account.depositMoney();
				System.out.println("Balance: " + account.getBalance() + "€");
				break;
			case 2: //Withdraw
				account.withdrawMoney();
				System.out.println("Balance: " + account.getBalance() + "€");
				break;
			case 3: //Print
				account.printInformation();
				break;
			case 4: //Exit
				System.out.println("\n\n\nHave a nice day!");
				break;
			default: //Error message
				System.out.println("Please introduce a valid option.");
				break;
			}
		}
		sc.close(); //Scanner closes.
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