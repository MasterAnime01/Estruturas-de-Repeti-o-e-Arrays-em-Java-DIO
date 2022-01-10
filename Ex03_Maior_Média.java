package digitalinnovation;

import java.
util.Scanner;

public class Ex03_Maior_Média {
         public static void main(String[] args) {
                    Scanner scan = new Scanner(System.in);

                    int numero;
                    int maior = 0;
                    int soma = 0;

                    int count = 0;
                    do {
                        System.out.println("Digite um número: ");
                        numero = scan.nextInt();

                        soma = soma + numero;

                        if (numero > maior) maior = numero;                

                        count = count + 1;
                    } while(count < 5);

                    System.out.println("O Maior Número que O Sr(a) digitou é: " + maior);
                    System.out.println("A Soma Dos Número que O Sr(a) digitou é: " + soma);
                    System.out.println("A Média dos Número que O Sr(a) digitou é: " + (soma/5));
                }
}
