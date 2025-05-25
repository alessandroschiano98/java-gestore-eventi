package org.lessons.java;

import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Evento eventoTechno = new Evento("TechnoMilano2047", LocalDate.of(2025, 8, 15), 1000, 0);
        Evento eventoHouse = new Evento("HouseMTorino2047", LocalDate.of(2026, 5, 18), 1000, 0);
        Evento eventoEDM = new Evento("EDMTorino2047", LocalDate.of(2024, 4, 11), 1000, 0);

        // Riepilogo eventi
        System.out.println("Eventi disponibili:");
        System.out.println("1. " + eventoTechno.toString());
        System.out.println("2. " + eventoHouse.toString());
        System.out.println("3. " + eventoEDM.toString());

        Scanner scanner = new Scanner(System.in);

        // ! Scelta dell'evento
        System.out.println("\nQuale evento vuoi selezionare? (1 = Techno, 2 = House, 3= EDM)");
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

        // ! Prenotazioni
        System.out.println("Quante prenotazioni vuoi effettuare per: " + eventoSelezionato.getTitolo() + "?");
        int numeroPostiPrenotati = scanner.nextInt();

        for (int i = 0; i < numeroPostiPrenotati; i++) {
            try {
                eventoSelezionato.prenota();
            } catch (IllegalStateException e) {
                System.out.println("Errore durante la prenotazione: " + e.getMessage());
                break;
            }
        }

        // ! Riepilogo finale
        System.out.println("\nRiepilogo finale:");
        System.out.println(eventoSelezionato.toString());

        scanner.close();
    }}
