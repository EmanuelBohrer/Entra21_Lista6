package lista_seis;

import java.util.Scanner;

public class Atv_18 {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		
		float a=0;
		float b;
		int anos=0;
		float taxaA,taxaB;
		float bP;
		
		while(a!=-1) {
			System.out.println("Insira a popula��o A : ");
			a = read.nextFloat();
			System.out.println("Insira sua taxa de crescimento : ");
			taxaA = read.nextFloat();
			
			System.out.println("Insira a popula��o B : ");
			b = read.nextFloat();
			System.out.println("Insira a taxa de crescimento : ");
			taxaB = read.nextFloat();
			
			while(a<b) {
				a = a+a*taxaA/100;
				b = b+b*taxaB/100;
				anos++;
			}
			System.out.println("Popula��o A : "+a);
			System.out.println("Popula��o B : "+b);
			System.out.println("Levar� : "+anos+" anos.");
		}
		
		

		read.close();
	}

}
