
public class LinkedListNode {

	private int id;
	private LinkedListNode next;

	public LinkedListNode() {
		setId(0);
		setNext(null);
	}

	public boolean emptyList() {
		return (this.getNext() == null);
	}

	public void insert(LinkedListNode node, int n) {
		if (this.getNext() == null || n == 1) {
			LinkedListNode aux = getNext();
			this.setNext(node);
			node.setNext(aux);
		} else {
			next.insert(node, n - 1);
		}
		return;
	}

	public void remove(int n) {
		if (n == 1 || this.getNext().getNext() == null) {                      
			this.setNext(getNext().getNext());
		} else {
			this.getNext().remove(n - 1);
		}
		return;
	}

	public void makeEmptyList() {
		this.setNext(null);
	}

	public void write() {
		if (getNext() != null) {
			System.out.print(getNext().getId());
			getNext().write();
		}
	}

	public int searchPos(int p) {
		if (p == 1) {
			return getNext().getId();
		} else {
			p--;
			return getNext().searchPos(p);
		}
	}

	public int searchId(int id) {
		if (getNext().getId() == id) {
			return getNext().getId();
		} else {
			return getNext().getNext().searchId(id);
		}
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public LinkedListNode getNext() {
		return this.next;
	}

	public void setNext(LinkedListNode next) {
		this.next = next;
	}

}
