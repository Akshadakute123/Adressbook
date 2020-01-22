package Com.Bridgelabz.Oops.Adressbook;


import java.io.IOException;


public class AddressBookApp {

	public static void main(String[] args) throws IOException {

		AddressBookApp.start();
	}

	public static void start() throws IOException {
		// TODO Auto-generated method stub
		int c;
		do {

			System.out.println("WelCome To AbbressBook\n");
			System.out.println(" 1. New \n 2.Open \n 3.delete \n 4.back \n 5.Exit\n");
			System.out.println("=================\n");

			int ch;
			ch = Utility.inputNumber();

			switch (ch) {
			case 1:
				AddressBookController.createNewAddressBook();
				break;

			case 2:
				AddressBookController.open();
				break;
			case 3:
				AddressBookController.detete();
				break;	
			case 4 : start();
			break ;
			case 5 : 
				System.out.println("Application is Terminated .......");
				System.exit(0);
				break;
			default:
				System.out.println("Enter the Valid Choice :");
			}
			System.out.println("Do you want to Continue......Press Y or y");
			c = Utility.inputchar();
		} while (c == 'y' || c == 'Y');
	}
}
