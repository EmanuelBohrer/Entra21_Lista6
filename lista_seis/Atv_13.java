package lista_seis;

import java.util.Scanner;

public class Atv_13 {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		
		int maior =0,num;
		System.out.println("Insira um n�mero : ");
		num = read.nextInt();
		if(num>maior) {
			maior = num;
		}
		while(num!=-1) {
			System.out.println("Insira um n�mero : ");
			num = read.nextInt();
			if(num>maior) {
				maior = num;
			}
		}
		System.out.println("Maior n�mero digitado : "+maior);

		read.close();
	}

}
