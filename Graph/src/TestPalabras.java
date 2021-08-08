
public class TestPalabras {
	public static void main ( String [] args) {// tarea
		Grafo <String> g= new Grafo<String> ();
		String[] word = {"words", "cords", "corps", "coops",
"crops", "drops", "drips", "grips", "gripe", "grape" ,"graph"};
		
		for (int i=0; i<word.length; i++) {
			g.insertV(word[i]);
		}
		for (int i=0; i<word.length; i++) {
			for (int j=i; j<word.length; j++) {
				g.inserWord(word[i],word[j]);
			}
		}
		System.out.println(g);
	}
}

