package lista_cinco;

import java.util.Scanner;

public class Atv_4 {

	public static void main(String[] args) {
			Scanner read = new Scanner(System.in);
			
			int opt;
			
			
			System.out.println("Insira sua op��o em c�digos : ");
			opt = read.nextInt();
			
			
			if(opt == 1) {
				System.out.println("C�digo 1 : Alimento n�o perec�vel.");
			}else if(opt == 2 || opt == 3 || opt == 4) {
				System.out.println("C�digo digitado : "+opt+"  | Alimento perec�vel.");
			}else if(opt ==5 || opt== 6) {
				System.out.println("C�digo digitado : "+opt+" Vestu�rio");
			}else if(opt==7) {
				System.out.println("C�digo 7 : Higiene Pessoal.");
			}else if(opt>= 8 && opt <=15) {
				System.out.println("C�digo digitado : "+opt+" | Limpeza e utensilos dom�sticos.");
			}else {
				System.out.println("C�digo informado inv�lido, tente novamente.");
			}
			

			read.close();
	}

}

