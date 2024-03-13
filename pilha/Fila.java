public class Fila{
  private String[] fila;
  private int size;
  private int head;
  private int tail;

  public Fila(int c) {
    this.fila = new String[c];
    this.size = 0;
    this.head = -1;
    this.tail = -1;
  }

  public boolean isEmpty() {
    return this.fila.length == -1;
  }

  public String addLast(String element){
    if (isEmpty()){
	this.head = 0;
	this.tail = 0;
	System.out.println(head);
	System.out.println(tail);
    } 
 
    else {
	this.tail += 1;
    }
	this.fila[tail] = element;
	return element;
  }
  
  public void shiftLeft(int index) {
    for (int i = index; i < this.tail - 1; i++) {
      this.fila[i] = this.fila[i + 1];
    }
  }

  public String toString() {
        String out = "";
        for (int i = head; i <= tail; i += 1) {
            out += this.fila[i] + " ";
        }
        return out.trim();
    }

  public static void main(String[] args) {
    Fila f = new Fila(3);
    assert f.isEmpty();

    System.out.println(f.addLast("a"));
    System.out.println(f.toString());
  
    f.shiftLeft(0);
    System.out.println(f.toString());
  }
}	
