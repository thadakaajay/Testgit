package project.lockedme;


	public class LockedmeMain {

		public static void main(String[] args) {
			
			
			FileOperations.createMainFolderIfNotPresent("main");
			
			MenuOptions.printWelcomeScreen("LockedMe", "Ajay");
			
			HandleOptions.handleWelcomeScreenInput();
		}

		
	}
