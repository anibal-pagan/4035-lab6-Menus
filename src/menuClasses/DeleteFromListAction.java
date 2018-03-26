package menuClasses;

import dataManager.DMComponent;
import ioManagementClasses.IOComponent;

public class DeleteFromListAction implements Action {

	@Override
	public void execute(Object args) {
		IOComponent io = IOComponent.getComponent(); 
		DMComponent dm = (DMComponent) args; 
		String name = io.getInput("Enter the name of the list you want to delete from: ");
		int index = Integer.parseInt(io.getInput("Enter the position of the element to delete: ")); 
		dm.removeElementFromList(name, index); 	

	}

}
