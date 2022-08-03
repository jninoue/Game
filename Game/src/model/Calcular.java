package model;

import java.util.Random;

public class Calcular {

	private int dificuldade, valor1, valor2, operacao, resultado;

	
	
	public Calcular(int dificuldade) {
		Random rand = new Random();
		
		this.operacao = rand.nextInt(3); // 0 - adicionar, 1 - subtrair, 2 - multiplicar
		this.dificuldade = dificuldade;
		
		if (dificuldade == 1){
			//facil
			this.valor1 = rand.nextInt(10);
			this.valor2 = rand.nextInt(10);
		}else if (dificuldade == 2) {
			//médio
			this.valor1 = rand.nextInt(100);
			this.valor2 = rand.nextInt(100);
		}else if (dificuldade == 3) {
			//dificil
			this.valor1 = rand.nextInt(1000);
			this.valor2 = rand.nextInt(1000);
		}else if (dificuldade == 4) {
			//insano
			this.valor1 = rand.nextInt(10000);
			this.valor2 = rand.nextInt(10000);
		}else {
			//ultra
			this.valor1 = rand.nextInt(100000);
			this.valor2 = rand.nextInt(100000);
		}
	}


	public int getDificuldade() {
		return dificuldade;
	}


	public int getValor1() {
		return valor1;
	}


	public int getValor2() {
		return valor2;
	}


	public int getOperacao() {
		return operacao;
	}


	public int getResultado() {
		return resultado;
	}

	@Override
	public String toString() {
		String op;
		if (this.getOperacao() == 0) {
			op = "Adição";
		}else if(this.getOperacao() == 1) {
			op = "Subtração";
		}else if (this.getOperacao() == 3){
			op = "Multiplicacao";
		}else {
			op = "Operação desconhecida";
		}
		return "Valor 1: " + this.getValor1() +
				"\nValor 2: " + this.getValor2() +
				"\nDificuldade: " + this.dificuldade + 
				"\nOperacao: " + op;
	}
	
	public boolean somar(int resposta) {
		this.resultado = this.getValor1() + this.getValor2();
		if (this.resultado == resposta) {
			System.out.println("Resposta correta!");
		}else {
			System.err.println("Respota errada!");
		}
		System.out.println(this.getValor1() + " + " + this.getValor2() + " = " + this.resultado);
		return this.resultado == resposta;
	}
	
	public boolean subtrair(int resposta) {
		this.resultado = this.getValor1() - this.getValor2();
		if (this.resultado == resposta) {
			System.out.println("Resposta correta!");
		}else {
			System.err.println("Respota errada!");
		}
		System.out.println(this.getValor1() + " - " + this.getValor2() + " = " + this.resultado);
		return this.resultado == resposta;
	}
	
	public boolean multiplicar(int resposta) {
		this.resultado = this.getValor1() * this.getValor2();
		if (this.resultado == resposta) {
			System.out.println("Resposta correta!");
		}else {
			System.err.println("Respota errada!");
		}
		System.out.println(this.getValor1() + " x " + this.getValor2() + " = " + this.resultado);
		return this.resultado == resposta;
	}
}
