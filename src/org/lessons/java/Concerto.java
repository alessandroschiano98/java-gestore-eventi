package org.lessons.java;

import java.time.LocalTime;
import java.time.LocalDate;

public class Concerto extends Evento {
    private LocalTime ora;
    private float prezzo;

    public Concerto(String titolo, LocalDate data, int numeroPostiTotale, int numeroPostiPrenotati, LocalTime ora,
            float prezzo) {
        super(titolo, data, numeroPostiTotale);
        this.ora = ora;
        this.prezzo = prezzo;

    }

    public LocalTime getOra() {
        return this.ora;
    }

    public void setOra(LocalTime ora) {
        this.ora = ora;
    }

    public float getPrezzo() {
        return this.prezzo;
    }

    public void setPrezzo(float prezzo) {
        this.prezzo = prezzo;
    }



}
