import java.util.ArrayList;

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
		System.out.println(g.vertices.get(1).visitado);
		g.DFS();
		System.out.println("\n Esta g2 dentro de g1 ?"+g.compararGrafos(g, g2));
		ArrayList<Arista> a = g.vertices.get(3).edges;
		System.out.println(a.get(1).refDes.data);
		System.out.println(g.vertices.get(0).data);
		System.out.println(g.vertices.get(1).visitado);
	}
	
}
