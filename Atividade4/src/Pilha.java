import java.util.ArrayList;

public class Pilha<T> {
	
	private ArrayList<T> itens = new ArrayList<T>();
	
	
	public void empilhar(T item) {
		this.itens.add(item);
	}
	
	public T desimpilhar() {
		int ultimoItemIndex = this.itens.size() - 1;  
		T ultimeItem = this.itens.get(ultimoItemIndex);
		this.itens.remove(ultimoItemIndex);
		return ultimeItem;
	}
	
}
