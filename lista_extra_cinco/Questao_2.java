package lista_extra_cinco;

import java.util.Scanner;

public class Questao_2 {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		
		float p1,p2,p3;
		System.out.println("Informe o pre�o do 1 produto : ");
		p1 = read.nextFloat();
		
		System.out.println("Informe o pre�o do 2 produto : ");
		p2 = read.nextFloat();
		
		System.out.println("Informe o pre�o do 3 produto : ");
		p3 = read.nextFloat();
		
		if(p1<p2 && p1<p3) {
			System.out.println("O sistema informa : Baseado nos pre�os, o produto 1 custando R$"+p1+" � o mais em conta.");
		}else if(p2<p1 && p2<p3) {
			System.out.println("O sistema informa : Baseado nos pre�os, o produto 2 custando R$"+p2+" � o mais em conta.");
		}else if(p3<p1 && p3<p2) {
			System.out.println("O sistema informa : Baseado nos pre�os, o produto 3 custando R$"+p3+" � o mais em conta.");
		}else if(p1>p2 && p2==p3){
			System.out.println("O sistema informa : Baseado nos pre�os, o produto 2 custando R$"+p2+" � o mais em conta.");
		}else if(p2>p1 && p1==p3) {
			System.out.println("O sistema informa : Baseado nos pre�os, o produto 1 custando R$"+p1+" � o mais em conta.");
		}else if(p3>p1 && p1==p2) {
			System.out.println("O sistema informa : Baseado nos pre�os, o produto 1 custando R$"+p1+" � o mais em conta.");
		}else {
			System.out.println("Todos os produtos tem o mesmo pre�o!");
		}
		

		read.close();
	}

}
