package br.com.senac.pooc;

/**
 *  POOC - Estudo das Classes - Exemplo de criação de cachorro
 * @author Evandro Borzi Marques
 */
public class Shitzu {
    public static void main(String[] args) {
	Cachorro pequeno = new Cachorro();
	pequeno.tamanho = 30;
	pequeno.raça = "Shitzu";
	System.out.println("Cachorro: Pequeno");
	System.out.println("Tamanho: " + pequeno.tamanho + " cm");
	System.out.println("Raça: " + pequeno.raça);
	pequeno.latir();
	}
}
