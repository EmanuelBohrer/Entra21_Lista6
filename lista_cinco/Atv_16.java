package lista_cinco;

import java.util.Scanner;

public class Atv_16 {

	public static void main(String[] args) {
		int resul,n1,n2;
		
		
		Scanner read = new Scanner(System.in);
		System.out.println("Calculadora - Op��es atuais : Soma (+) Subtra��o (-) Multiplica��o (*) Divis�o(/)!");
		System.out.println("Insira o tipo da opera��o com seu caractere: ");
		char opt = read.next().charAt(0);
		
		
		// Op��o Adi��o
		if(opt == '+') {
			System.out.println("Insira o 1 valor : ");
			n1 = read.nextInt();
			System.out.println("Insira o 2 valor : ");
			n2 = read.nextInt();
			resul = n1+n2;
			System.out.println("O resultado da soma de: "+n1+" + "+n2+" foi de : "+resul);
			if(resul>0) {
				System.out.println("O resultado foi positivo!");
			}else {
				System.out.println("O resultado foi negativo!");
			}
			if(resul%2==0) {
				System.out.println("� par!");
			}else {
				System.out.println("� impar!");
			}
			
			//Op��o Subtra��o
		}else if(opt=='-') {
			System.out.println("Insira o 1 valor : ");
			n1 = read.nextInt();
			System.out.println("Insira o 2 valor : ");
			n2 = read.nextInt();
			resul =n1-n2;
			System.out.println("O resultado da subtra��o de: "+n1+" - "+n2+" foi de : "+resul);
			if(resul>0) {
				System.out.println("O resultado foi positivo!");
			}else {
				System.out.println("O resultado foi negativo!");
			}
			if(resul%2==0) {
				System.out.println("� par!");
			}else {
				System.out.println("� impar!");
			}

			
			//Op��o Multiplica��o
		}else if(opt=='*') {
			System.out.println("Insira o 1 valor : ");
			n1 = read.nextInt();
			System.out.println("Insira o 2 valor : ");
			n2 = read.nextInt();
			resul = n1*n2;
			System.out.println("O resultado da multiplica��o de: "+n1+" * "+n2+" foi de : "+resul);
			if(resul>0) {
				System.out.println("O resultado foi positivo!");
			}else {
				System.out.println("O resultado foi negativo!");
			}
			if(resul%2==0) {
				System.out.println("� par!");
			}else {
				System.out.println("� impar!");
			}
			
			
			//Op��o Divis�o
		}else if(opt=='/') {
			System.out.println("Insira o 1 valor : ");
			n1 = read.nextInt();
			System.out.println("Insira o 2 valor : ");
			n2 = read.nextInt();
			resul = n1*n2;
			System.out.println("O resultado da divis�o de: "+n1+" / "+n2+" foi de : "+resul);
			if(resul>0) {
				System.out.println("O resultado foi positivo!");
			}else {
				System.out.println("O resultado foi negativo!");
			}
			if(resul%2==0) {
				System.out.println("� par!");
			}else {
				System.out.println("� impar!");
			}
		
			
			//Op��o Inv�lida
		}else {
			System.out.println("Opera��o desconhecida!");
		}
		

		read.close();
	}

}
