package digitalinnovation;

import java.util.Scanner;

public class Ex02_Nota {
       public static void main(String[] args) {
       Scanner scan = new Scanner(System.in);

       int nota;

       System.out.println("Nota: ");
       nota = scan.nextInt();
       while (nota >= 7) {
       System.out.println("Parabéns!!! Você passou na prova!!"); break;           
       }

       
       while (nota < 0 | nota > 10) {
       System.out.println("Nota inválida!! Digite novamente: ");
       nota = scan.nextInt();
       while (nota >= 7) {                   
       System.out.println("Parabéns!! Você errou nas primeiras tentativas mas ao menos agora conseguiu uma nota relevante."); break;
       }        
                    
          
      }                           
   }
}
