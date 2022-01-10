package digitalinnovation;

import java.util.Scanner;

import javax.sound.sampled.SourceDataLine;

public class Ex04_Par_Impar {
           public static void main(String[] args) {
                    Scanner scan = new Scanner(System.in);
                    
                    int quantNum;
                    int numero;
                    int quantPar = 0;
                    int quantImp = 0;


                    System.out.println("Digite uma quantidade de números: ");
                    quantNum = scan.nextInt();

                    int count = 0;
                    do {
                        System.out.println("Número: ");                
                        numero = scan.nextInt();


                        if (numero % 2 == 0) quantPar++;
                        else quantImp++;         


                        count++;               
                    } while (count < quantNum);
                    System.out.println("Quantidade Par: " + quantPar);
                    System.out.println("Quantidade Impar: " + quantImp);

                       

   }
}