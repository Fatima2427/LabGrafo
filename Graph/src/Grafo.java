import java.util.*;
public class Grafo<E> {
	ArrayList<Vertice> vertices ;
	
	public Grafo() {
		vertices = new ArrayList<Vertice>();
		
	}
	boolean search( E data) {
		for ( int i=0; i<vertices.size(); i++) {
			if(vertices.get(i).data.equals(data))
				return true;
			}
		return false;
	}
	public void insertV(E data) {
		if(this.search(data) != false){
			System.out.println("Vertice ya fue insertado anteriormente");
			return;
		}
		this.vertices.add(new Vertice<E>(data));
		
	}
	public void insertAri(E verOri, E verDes) {//arista insert
		insertAri(verOri, verDes, -1);
	}
	public void inserWord(String w1, String w2) {
		if(comparar(w1,w2)==true)
			insertAri((E)w1, (E)w2, -1);
		else
			return;
	}
	public void insertAri(E verOri, E verDes, int weitght) {
		Vertice<E> orig= new Vertice<E> (verOri);
		Vertice<E> des= new Vertice<E> (verDes);
		if(this.search(verOri)==false || this.search(verOri) == false){
			System.out.println("Vertice origen o destino no existen");
			return;
			}
		for ( int i = 0; i <vertices.size(); i++) {
				if ( vertices.get(i).data.equals(verOri)) {
					if( weitght >-1) 
						vertices.get(i).addEdge(new Arista<E>(des, weitght));
					else
						vertices.get(i).addEdge(new Arista<E>(des));
				}
			}
			for ( int i = 0; i <vertices.size(); i++) {
				if ( vertices.get(i).data.equals(verDes)) {
					if( weitght >-1) 
						vertices.get(i).addEdge(new Arista<E>(orig, weitght));
					else
						vertices.get(i).addEdge(new Arista<E>(orig));
				}
			}
		}
	 
	public void DFS(){
		for (int i = 0; i < tamaņoGrafo(); i++) {
            this.vertices.get(i).visitado=false;
		}
            for(int i=0;i<tamaņoGrafo();i++){
                if(this.vertices.get(i).visitado==false){
                    visitas(this.vertices.get(i));
                }
          }
 
    }
	public void visitas(Vertice<E> nuevo ) {//visitamos los vertices 
		System.out.print(this.vertices.get(this.posicion(nuevo)).data +" ");
		nuevo.visitado=true;
			for ( int i=0; i<nuevo.edges.size();i++) {	
				Vertice <E> x= nuevo.edges.get(i).refDes;
				if (x.data.equals(this.vertices.get(posicion(x)).data) ) {
					if(this.vertices.get(posicion(x)).visitado==false)
						visitas(this.vertices.get(posicion(x)));		
				}

				}
		
		
	}
	public int tamaņoGrafo() {
		return this.vertices.size();
	}
	public int posicion ( Vertice<E> aux) {// arroja la posicion de un vertice
		int pos=-1;
		for ( int i =0; i<this.vertices.size();i++) {
			if(vertices.get(i).data.equals(aux.data))
				pos=i;
			
		}
		return pos;		
	}
	public void BFS( E n) {
		ArrayList<Vertice> listaAdy = new ArrayList<Vertice>();
		Vertice ver= new Vertice(n);
		Vertice nodo = this.vertices.get(this.posicion(ver));
		int [] distancia= new int[this.vertices.size()];
		String[] padres = new String[this.vertices.size()];
		Queue<Vertice<E>> queue = new LinkedList<Vertice<E>>();
	
		queue.add(nodo);
		distancia[this.posicion(ver)]=0;
		Vertice<E> aux, siguiente, i;
		while (!queue.isEmpty()){
			aux=queue.poll();
			for ( int j=0; j<aux.edges.size();j++) {
				siguiente=aux.edges.get(j).refDes;
				if( siguiente.visitado==false) {
					listaAdy.add(siguiente);
					siguiente.visitado=true;
					distancia[this.posicion(siguiente)]=distancia[this.posicion(aux)]+1;
					queue.add(siguiente);
				}
			}
		}
		for ( int l =0; l<listaAdy.size();l++) {
			System.out.println(listaAdy.get(l).mostrar());	
		}
		
    }
	
	public String toString () {
		String r ="";
		for ( int i =0; i<vertices.size(); i++)
			r +=vertices.get(i).mostrar() ;
		return r;
	}
	 public boolean comparar(String p1, String p2){
		 int cont=0;
		 for(int i=0;i<p1.length();i++) {
			 if(p1.charAt(i)!=p2.charAt(i))
				 cont++; 
		 }
		 if ( cont ==1) {
			 return true;}
		 return false;
		 }
	 public  boolean compararGrafos(Grafo<E> n1, Grafo<E> n2) {
		 int cantAristas=0;
		 int cont=0;
		 //primera comparación sobre si los vertices del mas pequeņo es igual al grafo mayor
		 if (n1.vertices.size()<n2.vertices.size() ) {
			compararGrafos(n2,n1);
		 } 
		 for ( int i =0; i<n2.vertices.size();i++) {
			 for ( int j =0; j<n1.vertices.size();j++) {
				 if( n2.vertices.get(i).data.equals(n1.vertices.get(j).data))
					 cont++;
				 
			 }
		 }
		 if( cont ==n2.vertices.size()){//comparo cant de vertices 
			 cont=0;
			 for ( int i =0; i<n2.vertices.size();i++) {//2
				 for ( int j =0; j<n2.vertices.get(i).edges.size();j++) {// vertices de 2
					 cantAristas++;
					 int pos =posicion(n2.vertices.get(i));
					 ArrayList<Arista> n= n2.vertices.get(i).edges;
					 cont +=buscarVertice(n1.vertices.get(pos).edges, n.get(j));
				 }
			 }
		 }
		 if( cont==cantAristas)
			 return true;
		 return false;
	 }
	 public int buscarVertice( ArrayList<Arista> a, Arista arista) {// busca si el vertice-arista esta en el grafo 1 como arista del vertice indicado
		 int cont=0;
			 int  c =a.size();
			 for ( int i =0; i<c;i++) {
					 if ( a.get(i).refDes.data.equals(arista.refDes.data))
						 cont++;
		 }
			 return cont;
		 }

}
