package lista_cinco;

import java.util.Scanner;

public class Atv_3 {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		
		float var,ideal;
		
		
		System.out.println("Insira seu sexo utilizando M ou F para verifica��o : ");
		char gen = read.next().charAt(0);
		
		if (gen == 'M' || gen == 'm') {
			System.out.println("Insira sua altura : ");
			var = read.nextFloat();
			ideal = (72.7f*var)-58f;
			System.out.println("Seu peso ideal � : "+ideal);
			
		}else if(gen == 'F' || gen == 'f') {
			System.out.println("Insira sua altura : ");
			var = read.nextFloat();
			ideal = (62.1f*var)-44.7f;
			System.out.println("Seu peso ideal � : "+ideal);
		}else {
			System.out.println("Op��o inv�lida.");
		}
		
		

		read.close();

	}

}
