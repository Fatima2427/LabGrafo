
public class Test<E> {
	public static void main ( String [] args) {// tarea
		Grafo <String> g= new Grafo<String> ();
		g.insertV("a");
		g.insertV("c");
		g.insertV("b");
		g.insertV("d");
		g.insertV("e");
		g.insertV("f");
		g.insertV("g");
		g.insertV("h");
		g.insertV("i");
		g.insertV("j"); 
	
		g.insertAri("b", "c", 5);
		g.insertAri("a", "d", 4);
		g.insertAri("c", "g", 2);
		g.insertAri("e", "f", 1);
		g.insertAri("e", "h" ,4);
		g.insertAri("i", "h", 0);
		g.insertAri("g", "j", 1);
		g.insertAri("b", "e", 5);
		g.insertAri("b", "a", 6);
		g.insertAri("b", "h", 7);
		System.out.println("\n" + g);
		System.out.println(g.search("c"));
		g.BFS("c");
	
	}
	
}
