/*
 * Leia um valor inteiro N. Apresente o quadrado de cada um dos valores pares, de 1 at? N, inclusive N, se for o caso.

Entrada
A entrada cont?m um valor inteiro N (5 < N < 2000).

Sa?da
Imprima o quadrado de cada um dos valores pares, de 1 at? N, conforme o exemplo abaixo.

Tome cuidado! Algumas linguagens tem por padr?o apresentarem como sa?da 1e+006 ao inv?s de 1000000 o que ocasionar? resposta errada. 
Neste caso, configure a precis?o adequadamente para que isso n?o ocorra.
 * */

package study.bee.basic;

import java.util.Scanner;

public class Ex1073 {
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();

		for (int i = 1; i <= n; i++) {
			if (i % 2 == 0) {
				System.out.printf("%d^2 = %d\n", i, (int) Math.pow(i, 2));
			}
		}
		
		kb.close();
	}

}
