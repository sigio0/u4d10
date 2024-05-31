package org.example;

public class Rivista extends ElementoCatalogo {
    private static final long serialVersionUID = 1L;

    private Periodicita periodicita;

    public Rivista(String codiceISBN, int annoPubblicazione, int numeroPagine, Periodicita periodicita) {
        super(codiceISBN, annoPubblicazione, numeroPagine);
        this.periodicita = periodicita;
    }

    public Periodicita getPeriodicita() {
        return periodicita;
    }

    @Override
    public String toString() {
        return "Rivista{" +
                "periodicita=" + periodicita +
                "} " + super.toString();
    }
}
