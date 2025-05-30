package org.lessons.java;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Scanner;
import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        Concerto eventoTechno = new Concerto("TechnoMilano2025", LocalDate.of(2025, 8, 15), 1000, 0,
                LocalTime.of(12, 30), new BigDecimal(25.00));
        Concerto eventoHouse = new Concerto("HouseTorino2026", LocalDate.of(2026, 5, 18), 1000, 0, LocalTime.of(11, 30),
                new BigDecimal(25.00));
        Concerto eventoEDM = new Concerto("EDMNapoli2024", LocalDate.of(2024, 4, 11), 1000, 0, LocalTime.of(12, 00),
                new BigDecimal(25.00));

        // ! Lista eventi:
        System.out.println("Eventi disponibili:");
        System.out.println("1. " + eventoTechno.toString());
        System.out.println("2. " + eventoHouse.toString());
        System.out.println("3. " + eventoEDM.toString());

        Scanner scanner = new Scanner(System.in);

        // ! Scelta dell'evento da prenotare:
        System.out.println("\nQuale evento vuoi selezionare? (1 = Techno, 2 = House, 3 = EDM)");
        int sceltaEvento = scanner.nextInt();

        Evento eventoSelezionato;

        if (sceltaEvento == 1) {
            eventoSelezionato = eventoTechno;
        } else if (sceltaEvento == 2) {
            eventoSelezionato = eventoHouse;
        } else if (sceltaEvento == 3) {
            eventoSelezionato = eventoEDM;
        } else {
            System.out.println("Scelta non valida. Riprova.");
            scanner.close();
            return;
        }

        // ! Prenotazioni:
        System.out.println("Quante prenotazioni vuoi effettuare per: " + eventoSelezionato.getTitolo() + " " + "?");
        int numeroPostiPrenotati = scanner.nextInt();

        for (int i = 0; i < numeroPostiPrenotati; i++) {
            try {
                eventoSelezionato.prenota();
            } catch (IllegalStateException errore) {
                System.out.println("Errore durante la prenotazione: " + errore.getMessage());
                break;
            }
        }

        // ! Riepilogo (prenotazioni):
        System.out.println("\nRiepilogo prenotazione:".toUpperCase());
        System.out.println(eventoSelezionato.toStringBase());

        // ! Possibilità di disdire/confermare la prenotazione:
        System.out.println(
                "\nPrenotazione completata. Vuoi disdire qualche prenotazione? (digita 'disdici' per procedere oppure 'conferma' per terminare)");
        scanner.nextLine();
        String sceltaUtente = scanner.nextLine().trim().toLowerCase();

        if (sceltaUtente.equals("disdici")) {
            System.out.println("\nQuante prenotazioni vuoi disdire per: " + eventoSelezionato.getTitolo() + "?");
            int numeroPostiDisdetti = scanner.nextInt();

            for (int i = 0; i < numeroPostiDisdetti; i++) {
                try {
                    eventoSelezionato.disdici();
                } catch (IllegalStateException errore) {
                    System.out.println("Errore durante la disdetta: " + errore.getMessage());
                    break;
                }
            }
            System.out.println("\nRiepilogo finale:".toUpperCase());
            System.out.println(eventoSelezionato.toString());

        } else {
            System.out.println("Prenotazioni confermate. Nessuna disdetta effettuata.");
            System.out.println("\nRiepilogo finale:".toUpperCase());
            System.out.println(eventoSelezionato.toString());
        }

    

        scanner.close();

    }
}
