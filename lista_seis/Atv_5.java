package lista_seis;

import java.util.Scanner;

public class Atv_5 {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		
		int num,val=1,resul=0;
		int val1=0;
		int val2=0;
		
		System.out.println("Insira um n�mero para a verifica��o : ");
		num = read.nextInt();
		
		while(resul<num) {
			val = val +1;
			resul = val*(val+1)*(val+2);
			
		}
		
		val1 =val+1;
		val2 = val1+1;
		if(resul == num) {
			System.out.println("O n�mero "+num+" � o resultado dos produtos de "+val+"|"+val1+"|"+val2);
		}else {
			System.out.println("O n�mero "+num+" n�o � um n�mero triangular.");
		}
		

		read.close();
	}

}
