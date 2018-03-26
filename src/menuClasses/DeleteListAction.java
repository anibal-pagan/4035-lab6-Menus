package menuClasses;

import dataManager.DMComponent;
import ioManagementClasses.IOComponent;

public class DeleteListAction implements Action {

	@Override
	public void execute(Object args) {
		DMComponent dm = (DMComponent) args; 
		IOComponent io = IOComponent.getComponent(); 
		io.output("\nDeleting list of Integer values from the system:\n"); 
		String listName = io.getInput("\nEnter name of list: "); 
		dm.removeList(listName); 

	}

}
