public class Main {

	public static void main(String[] args) {
		
		Pilha<String> pilhaDeString = new Pilha<String>();
		
		pilhaDeString.empilhar("PRIMEIRO");
		pilhaDeString.empilhar("SEGUNDO");
		pilhaDeString.empilhar("TERCEIRO");
		
		Pilha<Integer> pilhaDeIntenger = new Pilha<Integer>();
		
		pilhaDeIntenger.empilhar(1);
		pilhaDeIntenger.empilhar(2);
		pilhaDeIntenger.empilhar(3);
		
		for(int i=0; i < 3; i++ ) {
			System.out.println(pilhaDeString.desimpilhar());
		}
		
		for(int i=0; i < 3; i++ ) {
			System.out.println(pilhaDeIntenger.desimpilhar());
		}
		
	}

}
