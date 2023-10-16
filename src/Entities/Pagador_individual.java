package Entities;

public class Pagador_individual extends Pagador{

	private Double despesas_medicas;
	
	public Pagador_individual() {
		super();
	}
	
	public Pagador_individual(String nome, Double ganho_anual, Double despesas_medicas) {
		super(nome,ganho_anual);
		this.despesas_medicas=despesas_medicas;
	}
	
	public Double getDespesas_medicas() {
		return despesas_medicas;
	}
	
	public void setDespesas_medicas(Double despesas_medicas) {
		this.despesas_medicas = despesas_medicas;
	}
	
	@Override
	public Double taxa_pagar() {
		Double imposto =0.0;
		if(getGanho_anual()<20000) {
			imposto=0.15*getGanho_anual();
		}else {
			imposto=0.25*getGanho_anual();
		}
		
		if(getDespesas_medicas()>0) {
			imposto-=getDespesas_medicas()/2;
		}
		
		return imposto;
	}

	
}
