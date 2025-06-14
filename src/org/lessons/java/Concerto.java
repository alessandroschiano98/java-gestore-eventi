
import java.time.LocalTime;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Concerto extends Evento {
    private static final DateTimeFormatter dataFormattata = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    private static final DateTimeFormatter oraFormattata = DateTimeFormatter.ofPattern("HH:mm");
    private LocalTime ora;
    private BigDecimal prezzo;

    public Concerto(String titolo, LocalDate data, int numeroPostiTotale, int numeroPostiPrenotati, LocalTime ora,
            BigDecimal prezzo) {
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

    public BigDecimal getPrezzo() {
        return this.prezzo;
    }

    public void setPrezzo(BigDecimal prezzo) {
        this.prezzo = prezzo;
    }

    @Override
    public String toString() {

        return super.toString() + " | Data: " + getData().format(dataFormattata) + " | Ora: "
                + getOra().format(oraFormattata) + " | Prezzo: $" + String.format("%.2f", prezzo);
    }

}
