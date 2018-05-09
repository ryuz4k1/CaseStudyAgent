

package App;

import Printer.Printer;
import Entity.Client;
import Control.AssignStaffToCampaign;
import Entity.CreativeStaff;
import Entity.Campaign;



public class Main {
	public static void main(String[] args) {
		Database.init();
		mainMenu();
	}

	public static void mainMenu() {
		Printer.println("Select one of the following:");
		Printer.println("1- Add a new client");
		Printer.println("2- Add a new campaign");
		Printer.println("3- Add a new staff");
		Printer.println("4- Assign staff to campaign");
		Printer.println("5- Add a new Advert");
		Printer.println("6- Show Client List");
		Printer.println("7- Show Campaign List");
		
		Printer.printSymbol("-", 20);
		Printer.print("\nYour choice: ");
		int choice = Printer.scanInt();

		switch (choice) {
		case 1:
			Printer.printSymbol("*", 30);
			Printer.println("\nAdd a new client");
			Client.addNewClient();
			break;
		case 2:
			Printer.printSymbol("*", 30);
			Printer.println("\nAdd a new campaign");
			Client.addNewCampaign();
			break;
		case 3:
			Printer.printSymbol("*", 30);
			Printer.println("\nAdd a new staff");
			CreativeStaff.addNewStaff();
			break;
		case 4:
			Printer.printSymbol("*", 30);
			Printer.println("\nAssign staff to campaign");
			AssignStaffToCampaign.assign();
			break;			
		case 5:
			Printer.printSymbol("*", 30);
			Printer.println("\nAdd a new Advert");
			Campaign.addNewAdvert();
			break;			
		case 6:
			Printer.printSymbol("*", 30);
			Printer.showClientList();
			mainMenu();
			break;
		case 7:
			Printer.printSymbol("*", 30);
			Printer.showCampaignList();
			mainMenu();
			break;	
		default:
			Printer.println("Error. Please choose between 1 - 7");
			mainMenu();
			break;
		}

	}


}
