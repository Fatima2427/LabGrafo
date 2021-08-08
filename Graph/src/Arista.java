
public class Arista<E> {
	protected Vertice<E> refDes;//destino
	protected int weight;
	
	public Arista(Vertice<E> refDes) {
		this(refDes, -1);
	}
	public Arista(Vertice<E> refDes, int weight) {
		this.refDes=refDes;
		this.weight=weight;
	}
	public Vertice<E> getRefDes() {
		return refDes;
	}
	public void setRefDes(Vertice<E> refDes) {
		this.refDes = refDes;
	}
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}

	public boolean equals( Object o) {
		if(o instanceof Arista<?>) {
			Arista<E> e =(Arista<E>) o;
			return this.refDes.equals(e.refDes);
			
		}
		return false;
	}
	public String mostrar(){
		if( this.weight>-1) {
			return  refDes.data + "[" +this.weight+ "] ,";}
		else 
			return refDes.data +",";
	}
	
}
