package lista_seis;

import java.util.Scanner;

public class Atv_19 {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		
		int num1;
		int num2;
		int resul=0;
		
		System.out.println("Insira um n�mero inteiro: ");
		num1 = read.nextInt();
		
		System.out.println("Insira outro n�mero inteiro : ");
		num2 = read.nextInt();
		
		int i=num1;
		for(; i<num2; ++i) {
			if(num1==i) {
				continue;
			}
			System.out.println("Intervalos : "+i);
			
			
		}

		read.close();
	}

}
