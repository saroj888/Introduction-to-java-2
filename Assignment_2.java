package Assign_2;

import java.util.Scanner;

public class Assignment_2 {

	public static void main(String arg[]) {

		Bank bank = new Bank("Delhi", 1.5f);
		SBI sbiBranch = new SBI("Dehradun", 5.7f, "35");
		BOI boiBranch = new BOI("Noida", 5.8f, "800");
		ICICI iciciBranch = new ICICI("Nagpur", 9.2f, "272");
		
		
		//bank.getDetails();
		//sbiBranch.getDetails();
		//boiBranch.getDetails();
		//iciciBranch.getDetails();

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the nummber of Customers ? ");
		int n = sc.nextInt();
		BankDetails C[] = new BankDetails[n];
		for (int i = 0; i < C.length; i++) {
			C[i] = new BankDetails();
			C[i].openAccount();
		}

		int ch;
		do {
			System.out.println("\n ***Banking System Application***");
			System.out.println(
					"1. Display all account details \n 2. Search by Account number\n 3. Deposit the amount \n 4. Withdraw the amount \n 5.Exit ");
			System.out.println("Enter your choice: ");
			ch = sc.nextInt();
			switch (ch) {
			case 1:
				for (int i = 0; i < C.length; i++) {
					C[i].showAccount();
				}
				break;
			case 2:
				System.out.print("Enter account no. you want to search: ");
				String ac_no = sc.next();
				Boolean found = false;
				for (int i = 0; i < C.length; i++) {
					found = C[i].search(ac_no);
					if (found) {
						break;
					}
				}
				if (!found) {
					System.out.println("Search failed! Account doesn’t exist..!!");
				}
				break;
			case 3:
				System.out.print("Enter Account no. : ");
				ac_no = sc.next();
				found = false;
				for (int i = 0; i < C.length; i++) {
					found = C[i].search(ac_no);
					if (found) {
						C[i].deposit();
						break;
					}
				}
				if (!found) {
					System.out.println("Search failed! Account doesn’t exist..!!");
				}
				break;
			case 4:
				System.out.print("Enter Account No : ");
				ac_no = sc.next();
				found = false;
				for (int i = 0; i < C.length; i++) {
					found = C[i].search(ac_no);
					if (found) {
						C[i].withdrawal();
						break;
					}
				}
				if (!found) {
					System.out.println("Search failed! Account doesn’t exist..!!");
				}
				break;
			case 5:
				System.out.println("See you soon…");
				break;
			}
		} while (ch != 5);
	}
}
