package elevador;

import java.util.ArrayList;
import java.util.Scanner;

public class Elevador {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> andares = new ArrayList();
		System.out.println("Pr�dio com 7 andares");
		
				
		for (int i = 0; i < 8 ; i++ ) {
			andares.add(i);
		}
				
		int elevador = 0;
		String posicao= "";
				
		if (elevador == 0 ) {
			posicao = "O elevador se encontra no T�rreo";
		}else {
			posicao = "O elevador se encontra no "+elevador+"� andar";
		}
		
		System.out.println(posicao);
		
		System.out.println("Digite o andar que voc� est� para chamar o elevador (para t�rreo digite 0): ");
		elevador = sc.nextInt();
		System.out.println("O elevador chegou! Digite para que andar quer ir.");
		elevador = sc.nextInt();
		System.out.printf("Voc� chegou ao %d� andar", elevador);
		
	}

}
