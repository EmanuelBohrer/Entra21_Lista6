package lista_cinco;

import java.util.Scanner;

public class Atv_14 {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		
		float med,value;
		
		System.out.println("Insira seu saldo m�dio : ");
		med = read.nextFloat();
		
		if(med >=0 && med<=200) {
			
			System.out.println("Seu saldo m�dio � de: R$"+med);
			System.out.println("N�o houve adi��o de percentual.");
		}else if(med >=201 && med<=400) {
			
			value = med*0.2f;
			System.out.println("Seu saldo m�dio � de: R$"+med);
			System.out.println("Seu percentual de cr�dito �: R$"+value);
			
		}else if( med >= 401 && med <=600) {
			value = med*0.3f;
			System.out.println("Seu saldo m�dio � de: R$"+med);
			System.out.println("Seu percentual de cr�dito �: R$"+value);
		}else if(med >=601) {
			value = med*0.4f;
			System.out.println("Seu saldo m�dio � de: R$"+med);
			System.out.println("Seu percentual de cr�dito �: R$"+value);
		}
		
		
		read.close();
	}

}
