package org.lessons.java;

public class Evento {
    private String titolo;
    private int data;
    private int  numeroPostiTotale;
    private int numeroPostiPrenotati;

public Evento(String titolo, int data, int numeroPostiTotale, int numeroPostiPrenotati){
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

    public int getData() {
        return this.data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public int getNumeroPostiTotale() {
        return this.numeroPostiTotale;
    }


    public int getNumeroPostiPrenotati() {
        return this.numeroPostiPrenotati;
    }


}
