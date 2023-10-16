package Entities;

public class Pagador_companhia extends Pagador {

	private int numero_empregados;
	
	public Pagador_companhia() {
		super();
	}

	public Pagador_companhia(String nome, Double ganho_anual,int numero_empregados) {
		super(nome, ganho_anual);
		this.numero_empregados = numero_empregados;
	}
	
	public int getNumero_empregados() {
		return numero_empregados;
	}
	
	public void setNumero_empregados(int numero_empregados) {
		this.numero_empregados=numero_empregados;
	}

	@Override
	public Double taxa_pagar() {
		Double imposto = 0.16 * getGanho_anual();
		if(getNumero_empregados()>10) {
			imposto = 0.14*getGanho_anual();
		}
		return imposto;
	}


}
