import java.util.*;

public class Vertice<E> {
	protected E data;
	protected ArrayList<Arista> edges;
	protected boolean visitado;
	
	public Vertice(E data) {
		this.data=data;
		edges= new ArrayList<Arista>();
		
	}
	public E getInfo() {return data;
	}

	public void setData(E data) { this.data=data;}
	public List<Arista> getEdges() {
		return edges;
	}
	public void setEdges(ArrayList<Arista> edges) {
		this.edges = edges;
	}
	public E getData() {
		return data;
	}
	public void addEdge(Arista<E> edge) {
        if (edges == null) {
            edges = new ArrayList<>();
        }
        edges.add(edge);
    }
	public String mostrar() {
		String r ="";
		for ( int i =0; i<edges.size(); i++)
			r+= edges.get(i).mostrar() ;
		return this.data +"-->" +r+ "\n";
	}
	public boolean isVisitado() {
		return false;
	}
	public void setVisitado(boolean visitado) {
		this.visitado = visitado;
	}
}
