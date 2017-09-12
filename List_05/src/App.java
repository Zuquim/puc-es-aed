//import java.util.ArrayList;
import java.util.Scanner;

public class App {
	
	public static Scanner input = new Scanner(System.in);

//	private static ArrayList<LinkedListNode> array = new ArrayList<LinkedListNode>();
	
	private static LinkedListNode list = new LinkedListNode();
	
	public static void main(String[] args) {
		boolean quit = false;
		int pos;
		
		System.out.println("\nTest App for LinkedListNode class\n\n");
		
		do {
			mainMenu();
			int mainMenuOption = input.nextInt();
			switch (mainMenuOption) {
			case 1:
				System.out.println("\n{1} Inserting item:");
				System.out.print("\tItem position: ");
				pos = input.nextInt();
				list.insert(list, pos);
				break;
			case 2:
				System.out.println("\n{2} Removing item:");
				System.out.print("\tItem to be removed (index): ");
				list.remove(input.nextInt());
				break;
			case 3:
				System.out.println("\n{3} Search by ID");
				System.out.print("\tInsert ID to be searched: ");
				pos = input.nextInt();
				System.out.print("\nItem found: " + list.searchPos(pos));
				break;
			case 4:
				System.out.println("\n{4} Printing LinkedList:" );
				list.write();
				break;
			case 5:
				System.out.println("\n{5} Insert item at the begining:" );
				System.out.print("\tItem to be added: ");
				pos = input.nextInt();
				break;
			case 6:
				System.out.println("\n{6} Insert item at the end:" );
				System.out.print("\tItem to be added: ");
				pos = input.nextInt();
				break;
			case 7:
				System.out.println("\n{7} Remove item at the begining:" );
				break;
			case 8:
				System.out.println("\n{8} Remove item at the end" );
				break;
			case 9:
				System.out.println("\n{9} Empty the list:" );
				list.emptyList();
				break;
			case 0:
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
		System.out.println("[1]\tInsert item in specific position");
		System.out.println("[2]\tRemove item in specific position");
		System.out.println("[3]\tSearch for an item position by ID");
		System.out.println("[4]\tPrint Linked List");
		System.out.println("[5]\tInsert item at the begining of the list");
		System.out.println("[6]\tInsert item at the end of the list");
		System.out.println("[7]\tRemove item at the begining of the list");
		System.out.println("[8]\tRemove item at the end of the list");
		System.out.println("[9]\tEmpty the list");
		System.out.println("[0]\tQuit");
		System.out.print("\n   > ");
	}
}
