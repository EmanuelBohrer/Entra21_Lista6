package lista_extra_cinco;

import java.util.Scanner;

public class Questao_4 {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		
		int var=0;
		String caso;
		
		System.out.println("Bem vindo ao interrogat�rio. Vamos iniciar as perguntas. Responda apenas com Sim e N�o");
		System.out.println("======================================================================================");
		System.out.println("A) Voc� telefonou para a v�tima? (Sim) ou (N�o)");
		caso = read.next();
		if(caso.equalsIgnoreCase("sim")) {
			++var;
		}else {
			System.out.println("Hm... entendo.");
		}
		System.out.println("B) Voc� esteve no local do crime? (Sim) ou (N�o)");
		caso = read.next();
		if(caso.equalsIgnoreCase("sim")) {
			++var;
		}else {
			System.out.println("Sei.. continue.");
		}
		System.out.println("C) Voc� morava perto da v�tima? (Sim) ou (N�o)");
		caso = read.next();
		if(caso.equalsIgnoreCase("sim")) {
			++var;
		}else {
			System.out.println("N�o? Hm..");
		}
		System.out.println("D) Voc� devia a v�tima? (Sim) ou (N�o)");
		caso = read.next();
		if(caso.equalsIgnoreCase("sim")) {
			++var;
		}else {
			System.out.println("Pagava sempre em dia ent�o..");
		}
		System.out.println("E) J� trabalhou com a v�tima? (Sim) ou (N�o)");
		caso = read.next();
		if(caso.equalsIgnoreCase("sim")) {
			++var;
		}else {
			System.out.println("Entendo.");
		}
		
		if(var==2) {
			System.out.println("Com os dados atuais, posso dizer.. voc� � Suspeito!");
			System.out.println("Quest�es positivas : "+var);
		}else if(var>=3 && var<=4) {
			System.out.println("Com base no que falamos hoje.. posso dizer que voc� � Cumplice!");
			System.out.println("Quest�es positivas : "+var);
		}else {
			System.out.println("N�o me resta d�vidas! Voc� � o ASSASSINO!");
			System.out.println("Quest�es positivas : "+var);
		}
		

		read.close();
	}

}
