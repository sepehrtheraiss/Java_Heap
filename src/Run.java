
public class Run {

	public static void main(String[] args) {
		Heap h = new Heap(3);
		h.insert(2);
		h.insert(1);
		h.insert(2);
		//h.removeMin();
		h.printInorder();

	}

}
