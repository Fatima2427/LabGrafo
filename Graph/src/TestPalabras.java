
public class TestPalabras {
	public static void main ( String [] args) {// tarea
		Grafo <String> g= new Grafo<String> ();
		String[] words = {"words", "cords", "corps", "coops",
"crops", "drops", "drips", "grips", "gripe", "grape" ,"graph"};
		
		for (int i=0; i<words.length; i++)
			g.insertV(words[i]);
		
		System.out.println(g.comparar("Words", "words"));
	}
}
