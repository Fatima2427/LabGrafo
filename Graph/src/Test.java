
public class Test<E> {
	public static void main ( String [] args) {// tarea
		Grafo <Integer> g= new Grafo<Integer> ();
		g.insertV(2);
		g.insertV(1);
		g.insertV(3);
		g.insertV(4); 
		g.insertV(7);
		g.insertV(10);
		g.insertV(8);
 
	
		g.insertAri(2, 1);
		g.insertAri(4, 1);
		g.insertAri(3, 4);
		g.insertAri(7,3);
		g.insertAri(2, 4);
		System.out.println("-----------grafo G1-----------");
		System.out.println("\n" + g);
		System.out.println("-----------grafo G2-----------");
		Grafo <Integer> g2= new Grafo<Integer> ();
		g2.insertV(2);
		g2.insertV(1);
		g2.insertAri(1, 2);
		System.out.println("\n" + g2);
		g.DFS();
		System.out.println("\n Esta g2 dentro de g1 ?"+g.compararGrafos(g, g2));
	}
	
}
