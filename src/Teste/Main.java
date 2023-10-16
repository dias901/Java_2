package Teste;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import Entities.Pagador;
import Entities.Pagador_companhia;
import Entities.Pagador_individual;

public class Main {
	
	public static void main (String[] args) {

		Scanner sc = new Scanner(System.in);
		List<Pagador> pg = new ArrayList<>();
		
		System.out.print("Insira o numero de Pagantes: ");
		int n = sc.nextInt();
		
		for(int i = 0; i<n; i++) {
			System.out.print("Individual ou Empresa? (i/e): ");
			char c = sc.next().charAt(0);
			sc.nextLine();
			System.out.println("Nome: ");
			String nome = sc.nextLine();
			System.out.println("Ganho Anual: ");
			Double ganho = sc.nextDouble();
			
			if(c=='i') {
				System.out.println("Despesas médicas: ");
				Double despesas = sc.nextDouble();
				pg.add(new Pagador_individual(nome,ganho,despesas));
			}else {
				System.out.println("Número de empregados: ");
				int func = sc.nextInt();
				pg.add(new Pagador_companhia(nome,ganho,func));
			}
		}
		
		System.out.println("IMPOSTOS PAGOS");
		double total =0.0;
		for (Pagador c : pg) {
			System.out.println(c.getNome()+": $ "+ String.format("%.2f", c.taxa_pagar()));
			total += c.taxa_pagar();
		}
		System.out.println("%nTaxas Totais: $ "+total);
		
		
		sc.close();
	}
}
