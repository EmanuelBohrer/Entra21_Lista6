package lista_cinco;

import java.util.Scanner;

public class Atv_5 {

	public static void main(String[] args) {
			Scanner read = new Scanner(System.in);
			
			int opt;
			
			System.out.println("Insira o c�digo do nadador : ");
			opt = read.nextInt();
			
			switch(opt) {
			case 1,2,3,4:
				System.out.println("C�digo digitado: "+opt+" | Classifica��o inexistente.");
			
			case 5,6,7:
				System.out.println("C�digo digitado: "+opt+" | Classifica��o Infantil A ");
			break;
			
			case 8,9,10:
				System.out.println("C�digo digitado: "+opt+" | Classifica��o Juvenil B ");
			break;
			
			
			case 11,12,13:
				System.out.println("C�digo digitado: "+opt+" | Classifica��o Juvenil A ");
			break;
			
			
			case 14,15,16,17:
				System.out.println("C�digo digitado: "+opt+" | Classifica��o Juvenil B");
			break;
			
			default:
				System.out.println("C�digo digitado: "+opt+" | Clasifica��o Adulto");
			
			}
				

			read.close();
	}

}
