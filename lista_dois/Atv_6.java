package lista_dois;

import java.util.Scanner;

public class Atv_6 {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		
		float vm,vtempo,vdistancia;
		String nome;
		
		System.out.println("Insira seu nome : ");
		nome = read.next();
		
		System.out.println("Insira a dist�ncia percorrida em quil�metros : ");
		vdistancia = read.nextFloat();
		
		System.out.println("Insira a dura��o do tempo em horas : ");
		vtempo = read.nextFloat();
		
		vm= vdistancia/vtempo;
		
		System.out.println("A velocidade m�dia foi de : "+vm);
		read.close();

	}

}
