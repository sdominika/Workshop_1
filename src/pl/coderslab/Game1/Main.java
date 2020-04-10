package pl.coderslab.Game1;

import javax.lang.model.util.ElementScanner9;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Random r = new Random(); // narzędzie do losowania liczb
        int newRandom = r.nextInt(100); // przechpwuje wylosowaną liczbę + zakres losowania

        Scanner scan = new Scanner(System.in);              //dostęp do terminala
        while (true) {                                      //pętla, która będzie się wykonywac do momentu wprowadzenia poprawnych wartości
            System.out.print("Zgadnij liczbę: ");         // komunikat w teminalu
            int yourTry = 0;
            while (true) {                                   // zabezpieczenie-będzie wyrzucać błąd, dopóki nie zostanie wprowadzona liczba
                String line = scan.nextLine();
                try {
                    yourTry = Integer.parseInt(line);
                    if (yourTry < 1 || yourTry > 100) {                 // zabezpiecza przed podaniem liczby spoza zakresu
                        throw new IllegalStateException("Podaj liczbę od 1 do 100");
                    }
                    break;
                } catch (IllegalStateException e) {
                    System.out.println(e.getMessage());
                } catch (Exception e) {
                    System.out.println("To nie jest liczba!");
                }
            }
            if (yourTry < newRandom) {
                System.out.println("Za mało!");
            } else if (yourTry > newRandom) {
                System.out.println("Za dużo!");
            } else {
                System.out.println("Trafiłeś!");
                break;
            }
        }
    }
}
