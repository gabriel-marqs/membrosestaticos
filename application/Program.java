package application;

import java.util.Locale;
import java.util.Scanner;

import util.CurrencyConverter;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Qual a cotação do dólar? ");
		double dolarPreco = sc.nextDouble();
		System.out.print("Quantos dólares irá comprar? ");
		double compra = sc.nextDouble();
		System.out.printf("Valor a ser pago em REAL: %.2f", CurrencyConverter.conversao(dolarPreco, compra));		
		
		sc.close();

	}

}
