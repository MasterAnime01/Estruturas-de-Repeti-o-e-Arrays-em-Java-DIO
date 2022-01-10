package digitalinnovation;

import java.util.Scanner;

import javax.swing.event.SwingPropertyChangeSupport;

public class Ex01_Idade_Nome {
public static void main(String[] args) {
       Scanner  scan = new Scanner(System.in); 


            String nome;
            int idade;

            while (true) {
     System.out.println("Nome : ");
     nome = scan.next();
     if (nome.equals("0")) break;
     System.out.println("Idade: ");
     idade = scan.nextInt();        
                    }

     System.out.println("Exércicio 01 De Nome e Idade Finalizado.");

           }
}
