import java.util.Scanner;

public class Atm {
	public static void main(String args[]) {
		int balance = 100000, withdraw, deposit;
		int AvialableBalance;
		
		Scanner sc = new Scanner(System.in);   // create scanner class object to get choice of user

		while (true) {
			System.out.println("Automated Operate Machine");
			System.out.println("Choose 1 for Withdraw");
			System.out.println("Choose 2 for Deposit");
			System.out.println("Choose 3 for Check Balance");
			System.out.println("Choose 4 for EXIT");
			System.out.println();
			System.out.print("Choose the operation you want to perform:");

			
			int choice = sc.nextInt(); // get choice from user
			switch (choice) {
			case 1:
				System.out.print("Enter money to be withdrawn:");
				withdraw = sc.nextInt(); // get the withdrawl money from user
				if (balance >= withdraw) { // check whether the balance is greater than or equal to the withdrawal//
											// amount
					System.out.println("Withdraw Sucessfully..!");
					System.out.println("Please collect your money");
					AvialableBalance = balance - withdraw;
					System.out.println("Avialable Balance Is :- " + AvialableBalance);
				} else {
					System.out.println("Insufficient Balance"); // show custom error message
				}
				System.out.println("");
				break;

			case 2:
				System.out.print("Enter money to be deposited:");
				deposit = sc.nextInt(); // get deposite amount from the user
				System.out.println("Your Money has been successfully depsited");
				System.out.println("");
				AvialableBalance = balance + deposit;
				System.out.println("Avialable Balance Is :- " + AvialableBalance);
				break;

			case 3:
				System.out.println("Balance : " + balance); // displaying the total balance of the user
				System.out.println("");
				break;

			case 4:
				System.exit(0); // exit from the menu

				sc.close();
			}
		}
	}
}