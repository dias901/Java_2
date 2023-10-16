package Entities;

public abstract class Pagador {

	private String nome;
	private Double ganho_anual;
	
	public abstract Double taxa_pagar();

	public Pagador() {
	}

	public Pagador(String nome, Double ganho_anual) {
		this.nome=nome;
		this.ganho_anual=ganho_anual;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Double getGanho_anual() {
		return ganho_anual;
	}

	public void setGanho_anual(Double ganho_anual) {
		this.ganho_anual = ganho_anual;
	}

	
}