
public class LList {
	
	private static int value;
	private static LList next;
	
	public LList() {
		setValue(0);
		setNext(null);
	}
	
	public static int getValue() {
		return value;
	}

	public static void setValue(int value) {
		LList.value = value;
	}

	public static LList getNext() {
		return next;
	}

	public static void setNext(LList next) {
		LList.next = next;
	}

	public static boolean isEmpty() {
		return (getNext() == null);
	}
	
	public static void insert(LList l, int v) {
		if ()
	}
}
