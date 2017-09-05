import java.util.Scanner;
import java.util.ArrayList; 

public class App {
	
	public static Scanner input = new Scanner(System.in);

	private static ArrayList<Date> dateArray = new ArrayList<Date>();
		
	public static void main(String[] args) {
		
		boolean quit = false;
		
		System.out.println("\nTest App for Date class\n\n");
		
		do {
			mainMenu();
			int mainMenuOption = input.nextInt();
			switch (mainMenuOption) {
			case 1:
				dateArray.add(new Date());
				System.out.println("\n{1} Current date set!\n");
				break;
			case 2:
				System.out.println("\n{2} Enter date:");
				setCustomDate();
				System.out.println("\n{2} Custom date set!\n");
				break;
			case 3:
				Date currDate = new Date();
				System.out.println("\n{3} Today is " + currDate.writeOut());
				break;
			case 9:
				quit = true;
				System.out.println("\n < Quitting >\n");
				break;
			default:
				break;
			}

		} while (!quit);
	}
	
	private static void mainMenu() {
		System.out.println("\n\t[Main Menu]\n");
		System.out.println("[1]\tSet current date");
		System.out.println("[2]\tSet custom date");
		System.out.println("[3]\tPrint current date");
		System.out.println("[9]\tQuit");
		System.out.print("\n   > ");
	}
	
	private static void setCustomDate() {
		System.out.print("\tyear: ");
		int setYear = input.nextInt();
		System.out.print("\tmonth: ");
		int setMonth = input.nextInt();
		System.out.print("\tday: ");
		int setDay = input.nextInt();
		dateArray.add(new Date(setYear, setMonth, setDay));
	}
}
