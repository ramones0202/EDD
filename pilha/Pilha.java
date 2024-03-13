public class Pilha{
	private String[] pilha;
	private int topo;

	public Pilha(int c) {
		this.topo = -1;
		this.pilha = new String[c];
	}

	public boolean isEmpty() {
		return this.topo == -1;
	}

	public boolean isFull() {
		return this.pilha.length == this.topo + 1;
	}

	public String peek() {
		if (isEmpty()) throw new RuntimeException("A pilha está vazia!");
		return this.pilha[this.topo];
	}

	public int size() {
		return this.topo + 1;
	}

	public String push(String element) {
		if (isFull()) throw new RuntimeException("A pilha está cheia!");
		this.topo = this.topo + 1;
		this.pilha[topo] = element;
		return element;
	}

	public String pop() {
		if (isEmpty()) throw new RuntimeException("A pilha está vazia!");
		//this.topo = this.topo - 1;
		return this.pilha[topo--]; 
	}

	public void imprime() {
		for (int i = 0; i <= topo; i++) {
			System.out.println(this.pilha[i]);
		}
	}
	
	//Testes de João Arthur	
	public static void main(String[] args) {
       	  Pilha pilha = new Pilha(3);
          assert pilha.isEmpty();
          assert !pilha.isFull();
          assert pilha.size() == 0; 
        
       	  pilha.push("a");
          assert "a".equals(pilha.peek());
          assert pilha.size() == 1; 

          pilha.push("b");
          assert "b".equals(pilha.peek());
          assert 2 == pilha.size();

          assert pilha.pop().equals("b");
          assert 1 == pilha.size();
          assert "a".equals(pilha.peek());

          pilha.push("b");
          pilha.push("c");
    
          assert pilha.peek().equals("c");
          assert 3 == pilha.size();
          assert pilha.pop().equals("c");
          assert pilha.pop().equals("b");
          assert pilha.pop().equals("a");
          assert pilha.isEmpty();	
	}
}
