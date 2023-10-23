import entities.Palavra;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Palavra palavra = new Palavra();

        String chute;

        System.out.println("------------------------------------------------");
        System.out.println("-------- ###### PALAVRA DO DIA! ###### ---------");
        System.out.println("------------------------------------------------");
        System.out.println("............... dica: 4 letras .................");
        System.out.println("------------------------------------------------");

        do {

            System.out.println("\n________________________________________________");
            System.out.print("Digite a palavra: ");
            chute = sc.nextLine().toUpperCase();

            if (!chute.equals(palavra.getPalavraDodia())) {
                System.out.println("Errou, tente novamente.");
                palavra.verificaLetra(chute, palavra.getPalavraDodia());
            }

        } while (!chute.equals(palavra.getPalavraDodia()));

        System.out.println("Palavra correta, PARABENS");
        palavra.verificaLetra(chute, palavra.getPalavraDodia());

        sc.close();
    }
    
}