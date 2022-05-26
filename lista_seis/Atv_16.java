package lista_seis;

import java.util.Scanner;

public class Atv_16 {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		
		String nome;
		int idade;
		float sal;
		
		
		System.out.println("Insira seu nome : ");
		nome = read.next();
		
		System.out.println("Insira sua idade : ");
		idade = read.nextInt();
		
		while(idade<0 || idade >100) {
			System.out.println("Idade inv�lida, tente novamente (Idades aceitas apenas entre 0 e 100)   ");
			System.out.println("Insira sua idade : ");
			idade = read.nextInt();
		}
		
		System.out.println("Insira seu sal�rio : ");
		sal = read.nextFloat();
		
		while(sal<0) {
			System.out.println("Sal�rio inv�lido, tente novamente (Sal�rios devem ser maiores que 0) ");
			System.out.println("Insira seu sal�rio : ");
			sal = read.nextFloat();
		}
		
		System.out.println("Insira seu sexo (f) ou (m) : ");
		char sex = read.next().charAt(0);
		System.out.println(sex);
		while(sex!='f' && sex!='m') {
			System.out.println("Sexo inv�lido, tente novamente (Sexos aceitos apenas em letra minuscula (f) ou (m))");
			System.out.println("Insira seu sexo (f) ou (m) : ");
			 sex = read.next().charAt(0);
		}
		
		System.out.println("Insira seu estado civil (c), (s), (v), (d) : ");
		char civil = read.next().charAt(0);
		while(civil!='c' && civil!='s' && civil!='v' && civil!='d') {
			System.out.println("Estado civil inv�lido, tente novamente (Estado Civil s�o aceitos apenas em letras min�sculas)");
			System.out.println("Insira seu estado civil (c), (s), (v), (d) : ");
			civil = read.next().charAt(0);

		}
		
		System.out.println("Nome: "+nome);
		System.out.println("Idade: "+idade);
		System.out.println("Sexo: "+sex);
		System.out.println("Sal�rio: R$"+sal);
		System.out.println("Estado Civil : "+civil);
		
		
		
		
		
		

		read.close();
	}

}
