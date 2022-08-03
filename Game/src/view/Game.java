package view;

import java.util.Scanner;

import model.Calcular;

public class Game {
	static Scanner teclado = new Scanner(System.in);
	static int pontos = 0;
	static Calcular calc;
	
	public static void main(String[] args) {
		Game.jogar();

	}
	
	public static void jogar() {
		System.out.print("Informe o nível de dificuldade [1, 2, 3 ou 4]: ");
		int dificuldade = teclado.nextInt();
		
		Game.calc = new Calcular(dificuldade);
		System.out.println("Informe o resultado para a seguinte operação: ");
		
		if (calc.getOperacao() == 0) {
			System.out.println(calc.getValor1() + " + " + calc.getValor2());
			int resultado = teclado.nextInt();
			
			if(calc.somar(resultado)) {
				Game.pontos += 1;
				System.out.println("Você tem " + Game.pontos + " ponto");
			}
		} else 	if (calc.getOperacao() == 1) {
			System.out.println(calc.getValor1() + " - " + calc.getValor2());
			int resultado = teclado.nextInt();
			
			if(calc.subtrair(resultado)) {
				Game.pontos += 1;
				System.out.println("Você tem " + Game.pontos + " ponto");
			}
		}else if (calc.getOperacao() == 2) {
			System.out.println(calc.getValor1() + " x " + calc.getValor2());
			int resultado = teclado.nextInt();
			
			if(calc.multiplicar(resultado)) {
				Game.pontos += 1;
				System.out.println("Você tem " + Game.pontos + " ponto");
			}
		}else {
			System.out.println("A operação " + calc.getOperacao() + " não é reconhecida.");
		}
		
		System.out.println("Deseja continuar [1 - sim, 0 - não]");
		int continuar = Game.teclado.nextInt();
		
		if(continuar == 1) {
			Game.jogar();
		}else {
			System.out.println("Você fez " + Game.pontos + " pontos");
			System.out.println("Até a próxima!");
			System.exit(0);
		}
	}

}
