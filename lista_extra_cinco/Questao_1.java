package lista_extra_cinco;

import java.util.Scanner;

public class Questao_1 {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		
		float ind;
		
		System.out.println("Qual o �ndice de polui��o hoje? : ");
		ind = read.nextFloat();
		
		if (ind >0.25 && ind<=0.3) {
			System.out.println("Aviso : As ind�strias do grupo 1 devem suspender suas atividades.");
			
		}else if(ind>=0.4) {
			System.out.println("Aviso : As ind�strias do grupo 1 e 2 devem suspender suas atividades.");
		}else if(ind<=0.25) {
			System.out.println("Aviso : N�vel de polui��o ok.");
		}else {
			System.out.println("Aviso : As industrias de todos os grupos devem suspender suas atividades. ");
		}

		read.close();
	}

}
