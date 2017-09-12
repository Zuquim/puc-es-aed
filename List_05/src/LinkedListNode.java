
public class LinkedListNode {

	private int id;
	private LinkedListNode next;

	public LinkedListNode() {
		this.id = 0;
		this.next = null;
	}

	public boolean emptyList() {
		return (this.getNext() == null);
	}

	public boolean insert(LinkedListNode node, int n) {
		boolean done = false;
		if (this.getNext() == null || n == 1) {
			LinkedListNode aux = getNext();
			this.setNext(node);
			node.setNext(aux);
			done = true;
		} else {
			n--;
			next.insert(node, n);
		}
		return done;
	}

	public boolean remove(int n) {
		boolean done = false;
		if (n == 1 || this.getNext().getNext() == null) {
			setNext(getNext().getNext());
		} else {
			n--;
			getNext().remove(n);
		}
		return done;
	}

	public void makeEmptyList() {
		this.setNext(null);
	}

	public void write() {
		if (getNext() != null) {
			System.out.println(getNext().getId());
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
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public LinkedListNode getNext() {
		return next;
	}

	public void setNext(LinkedListNode next) {
		this.next = next;
	}

}
