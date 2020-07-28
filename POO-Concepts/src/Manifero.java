

//ABSTRAÇÃO: Nesse exemplo usamos a abstração "Mamífero" e criamos um atributo encapsulado e três métodos com seus respectivos valores padrões.
public class Manifero 
{
	//ENCAPSULAMENTO: para garantir que nenhum objeto tenha acesso direto ao nosso atributo, criamos ele como privato, assim ele só poderá ser operado através de métodos.
	//Criamos um atributo encapsulado e, em seguida, criamos seus métodos getters e setters para que possamos manipular esse atributo encapsulado.
	private int quantidadeFilhotes;
	
	public int getQuantidadeFilhotes() {
		return quantidadeFilhotes;
	}

	public void setQuantidadeFilhotes(int quantidadeFilhotes) {
		this.quantidadeFilhotes = quantidadeFilhotes;
	} 
	
	
	public void nasce() {
		System.out.println("Um mamífero nasce e é amamentado.");
	}
	
	public void cresce() {
		System.out.println("Um mamífero cresce e se torna adulto.");
	}
	
	public void reproduz() {
		System.out.println("Um mamífero adulto se reproduz e amamenta seu filhote.");
	}
	
	
	
    public static void main( String[] args )
    {
        
    	Manifero gata = new Gata();
    	Manifero girafa = new Girafa();
    	
    	gata.nasce();    	
    	gata.cresce();
    	gata.setQuantidadeFilhotes(5);
    	int filhotesGata = gata.getQuantidadeFilhotes();
    	System.out.println("A gatinha teve "+ filhotesGata + " filhotinhos.");
    	gata.reproduz();
    	
    	System.out.println();
    	
    	girafa.nasce();
    	girafa.cresce();
    	girafa.setQuantidadeFilhotes(2);
    	int filhotesGirafa = girafa.getQuantidadeFilhotes();
    	System.out.println("A girafa teve "+ filhotesGirafa + " filhotinhos.");
    	girafa.reproduz();
    	
    }
       
}

//HERANÇA: o mamífero X herda as características, no nosso caso, métodos, da classe Pai Mamífero.
//Como a classe pai Mamífero possui 3 métodos, suas classes herdeiras terão acesso à esses 3 métodos.

class Gata extends Manifero {
	
	 
	
	//POLIMORFISMO: é quando a classe herdeira invoca um atributo ou método da classe pai mas modifica seu conteúdo ou comportamento.
	//Nesse exemplo, as classes herdeiras implementaram os métodos contidos na classe pai mas alteraram seu conteúdo.
	public void nasce() {
		System.out.println("Uma gatinha nasce e é amamentada.");
	}
	
	public void cresce() {
		System.out.println("A gatinha cresce e se torna adulta.");
	}
	
	public void reproduz() {
		System.out.println("A gatinha adulta se reproduziu e amamenta seus filhotinhos.");
	}
}



class Girafa extends Manifero {
	
	public void nasce() {
		System.out.println("Uma girafa nasce e é amamentada.");
	}
	
	public void cresce() {
		System.out.println("A girafa cresce e se torna adulta e grande.");
	}
	
	public void reproduz() {
		System.out.println("A girafa adulta se reproduziu e amamenta seus filhotinhos.");
	}
}
