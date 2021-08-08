
public class Test<E> {
	public static void main ( String [] args) {// tarea
		Grafo <Integer> g= new Grafo<Integer> ();
		g.insertV(2);
		g.insertV(1);
		g.insertV(3);
		g.insertV(4); 
	
		g.insertAri(1, 2);
		g.insertAri(2, 3);
		g.insertAri(3, 4);
		g.insertAri(1,3);
		g.insertAri(2, 4);

		System.out.println("\n" + g);
		System.out.println("-----------Subgrafo-----------");
		Grafo <Integer> g2= new Grafo<Integer> ();
		g2.insertV(2);
		g2.insertV(1);
		g2.insertV(4);
		g2.insertAri(1, 2);
		g2.insertAri(1, 4);
		System.out.println("\n" + g2);
		g.DFS();
	}
	
}
