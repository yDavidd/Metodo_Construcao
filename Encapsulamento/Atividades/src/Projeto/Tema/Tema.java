package Projeto.Tema;

public class Tema {
	private long id;
	private String nome;
	private double valorAluguel;
	private String corTolha;
	public Tema(long id, String nome, double valorAluguel, String corTolha) {
		super();
		this.id = id;
		this.nome = nome;
		this.valorAluguel = valorAluguel;
		this.corTolha = corTolha;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getValorAluguel() {
		return valorAluguel;
	}
	public void setValorAluguel(double valorAluguel) {
		this.valorAluguel = valorAluguel;
	}
	public String getCorTolha() {
		return corTolha;
	}
	public void setCorTolha(String corTolha) {
		this.corTolha = corTolha;
	}
}
