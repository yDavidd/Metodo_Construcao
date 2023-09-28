package Projeto;

import Projeto.Cliente.Cliente;
import Projeto.Endereco.Endereco;
import Projeto.ItemTema.ItemTema;
import Projeto.Tema.Tema;


public class Main {

	public static void main(String[] args) {
		Tema tema1 = new Tema(157, "Casa", 2000, "Azul");
		Cliente cliente1 = new Cliente(158,"David Kauan", "15998455637", "46288656765", "3.021.415" );
		ItemTema itemTema1 = new ItemTema(159, "David Kauan", "Lindo");
		Endereco endereco1 = new Endereco(159, "Av.Wenceslau Brás", 56, "1968", "Vila Popular", "São Paulo", "1821713", "SP");
		
		System.out.println(tema1.getId());
		System.out.println(tema1.getNome());
		System.out.println(tema1.getValorAluguel());
		System.out.println(tema1.getCorTolha());
		
		System.out.println(cliente1.getId());
		System.out.println(cliente1.getNome());
		System.out.println(cliente1.getTelefone());
		System.out.println(cliente1.getCpf());
		System.out.println(cliente1.getRg());
		
		System.out.println(itemTema1.getId());
		System.out.println(itemTema1.getNome());
		System.out.println(itemTema1.getDescricao());
		
		System.out.println(endereco1.getId());
		System.out.println(endereco1.getLogradouro());
		System.out.println(endereco1.getNumero());
		System.out.println(endereco1.getComplemento());
		System.out.println(endereco1.getBairro());
		System.out.println(endereco1.getCidade());
		System.out.println(endereco1.getCep());
		System.out.println(endereco1.getUf());
		
		

	}

}
