package lista_seis;

import java.util.Scanner;

public class Atv_15 {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		
		int cod,psw;
		
		System.out.println("Cria��o de Cadastros");
		System.out.println("Insira um c�digo de usu�rio (ex: 3444) : ");
		cod = read.nextInt();
		
		while(cod!=-1) {
			System.out.println("Insira uma senha para seu login : ");
			psw = read.nextInt();
			if(psw==cod) {
				System.out.println("N�o aceitamos c�digos e senhas iguais! ");
				
			}else {
				System.out.println("Cadastro feito!");
				break;
			}
		}

		read.close();
	}

}
