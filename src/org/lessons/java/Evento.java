package org.lessons.java;

import java.time.LocalDate;

public class Evento {
    private String titolo;
    private LocalDate data;
    private int numeroPostiTotale;
    private int numeroPostiPrenotati;

    public Evento(String titolo, LocalDate data, int numeroPostiTotale) {
        this.titolo = titolo;
        this.data = data;
        this.numeroPostiTotale = numeroPostiTotale;
        this.numeroPostiPrenotati = 0;
    }

    public String getTitolo() {
        return this.titolo;
    }

    public void setTitolo(String titolo) {
        this.titolo = titolo;
    }

    public LocalDate getData() {
        return this.data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public int getNumeroPostiTotale() {
        return this.numeroPostiTotale;
    }

    public int getNumeroPostiPrenotati() {
        return this.numeroPostiPrenotati;
    }

    // ! PRENOTA
    public void prenota() {
        if (LocalDate.now().isAfter(data)) {
            throw new IllegalStateException("L'evento è già passato, non è possibile prenotare.");
        } else if (numeroPostiPrenotati >= numeroPostiTotale) {
            throw new IllegalStateException("Posti esauriti.");
        } else {
            numeroPostiPrenotati++;
            System.out.println("<[La prenotazione è stata effettuata con successo]>");
        }
    }

    // ! DISDICI
    public void disdici() {
        if (LocalDate.now().isAfter(data)) {
            throw new IllegalStateException("L'evento è già passato, non è possibile disdire.");
        } else if (numeroPostiPrenotati <= 0) {
            throw new IllegalStateException("Nessuna prenotazione da disdire.");
        } else {
            numeroPostiPrenotati--;
            System.out.println("<[La prenotazione effettuata è stata disdetta con successo]>");

        }
    }

    @Override
    public String toString() {
        return toStringBase();
    }

    public String toStringBase() {
        return "Evento: " + titolo + " - Data: " + data + " - PostiPrenotati: [" +
                numeroPostiPrenotati + "/" + numeroPostiTotale + "]";
    }

}
