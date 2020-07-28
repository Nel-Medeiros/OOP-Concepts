

//ABSTRA��O: Nesse exemplo usamos a abstra��o "Mam�fero" e criamos um atributo encapsulado e tr�s m�todos com seus respectivos valores padr�es.
public class Manifero 
{
	//ENCAPSULAMENTO: para garantir que nenhum objeto tenha acesso direto ao nosso atributo, criamos ele como privato, assim ele s� poder� ser operado atrav�s de m�todos.
	//Criamos um atributo encapsulado e, em seguida, criamos seus m�todos getters e setters para que possamos manipular esse atributo encapsulado.
	private int quantidadeFilhotes;
	
	public int getQuantidadeFilhotes() {
		return quantidadeFilhotes;
	}

	public void setQuantidadeFilhotes(int quantidadeFilhotes) {
		this.quantidadeFilhotes = quantidadeFilhotes;
	} 
	
	
	public void nasce() {
		System.out.println("Um mam�fero nasce e � amamentado.");
	}
	
	public void cresce() {
		System.out.println("Um mam�fero cresce e se torna adulto.");
	}
	
	public void reproduz() {
		System.out.println("Um mam�fero adulto se reproduz e amamenta seu filhote.");
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

//HERAN�A: o mam�fero X herda as caracter�sticas, no nosso caso, m�todos, da classe Pai Mam�fero.
//Como a classe pai Mam�fero possui 3 m�todos, suas classes herdeiras ter�o acesso � esses 3 m�todos.

class Gata extends Manifero {
	
	 
	
	//POLIMORFISMO: � quando a classe herdeira invoca um atributo ou m�todo da classe pai mas modifica seu conte�do ou comportamento.
	//Nesse exemplo, as classes herdeiras implementaram os m�todos contidos na classe pai mas alteraram seu conte�do.
	public void nasce() {
		System.out.println("Uma gatinha nasce e � amamentada.");
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
		System.out.println("Uma girafa nasce e � amamentada.");
	}
	
	public void cresce() {
		System.out.println("A girafa cresce e se torna adulta e grande.");
	}
	
	public void reproduz() {
		System.out.println("A girafa adulta se reproduziu e amamenta seus filhotinhos.");
	}
}
