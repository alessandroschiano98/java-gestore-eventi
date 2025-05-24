package org.lessons.java;

import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {

        Evento eventoTechno = new Evento("TechnoMilano2047", LocalDate.of(2025, 8, 15), 1000, 0);
        Evento eventoHouse = new Evento("HouseMTorino2047", LocalDate.of(2026, 5, 18), 1000, 0);

        Scanner scanner = new Scanner(System.in);

        // ! Inserimento evento da parte dell’utente
        System.out.println("Inserisci l'evento: ");
        String titolo = scanner.nextLine();

        System.out.println("Inserisci l'anno: ");
        int anno = scanner.nextInt();

        System.out.println("Inserisci il mese: ");
        int mese = scanner.nextInt();

        System.out.println("Inserisci il giorno: ");
        int giorno = scanner.nextInt();
        scanner.nextLine();

        System.out.println(
                "L'evento che hai appena inserito è: " + titolo.toUpperCase() + LocalDate.of(anno, mese, giorno));

        // ! Prenotazioni da effettuare
        System.out.println("Quante prenotazioni vuoi effettuare?");
        int numeroPostiPrenotati = scanner.nextInt();
        System.out.println("Il numero di prenotazioni inserite è: " + numeroPostiPrenotati);

        // ! Riepilogo evento predefinito
        System.out.println(eventoTechno.toString());
        System.out.println(eventoHouse.toString());

        scanner.close();
    }
}
