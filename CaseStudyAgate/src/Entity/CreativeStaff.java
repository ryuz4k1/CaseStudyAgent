

package Entity;

import App.Main;
import Control.AddNewStaff;
import Printer.Printer;

public class CreativeStaff extends StaffMember {

    
    public CreativeStaff(String staffName, int staffNo, String staffStartDate) {
        super(staffName, staffNo, staffStartDate);
    }

    public void assignStaffContact() {
        System.out.println("assign staff contact" + this.getStaffName());
    }
    
    
    public static void addNewStaff() {
    	Printer.print("\nStaff Name: ");
    	String staffName = Printer.scanString();
    	Printer.print("\nStaff No: ");
    	int staffNo = Printer.scanInt();
    	Printer.print("\nStart Date: ");
    	String staffStartDate = Printer.scanString();
    	CreativeStaff createdStaff = new CreativeStaff(staffName,staffNo,staffStartDate);
    	AddNewStaff.getInstance().createNewStaff(createdStaff);
    	System.out.printf("The staff named '%s' has added the system.\n", staffName);
    	Main.mainMenu();
    }

}
