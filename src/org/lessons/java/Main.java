package org.lessons.java;

import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {

        Evento eventoTechno = new Evento("TechnoMilano2047", LocalDate.of(2025, 8, 15), 1000, 0);

        Scanner scanner = new Scanner(System.in);
        
        // ! Inserimento evento da parte dell’utente
        System.out.println("Inserisci un nuovo evento:");
        String titolo = scanner.nextLine();

        System.out.println("L'evento che hai appena inserito è: " + titolo.toUpperCase());

        // !  Prenotazioni da effettuare
        System.out.println("Quante prenotazioni vuoi effettuare?");
        int numeroPostiPrenotati = scanner.nextInt();
        System.out.println("Il numero di prenotazioni inserite è: " + numeroPostiPrenotati);

        // ! Riepilogo evento predefinito
        System.out.println(eventoTechno.toString());

        scanner.close();
    }
}
