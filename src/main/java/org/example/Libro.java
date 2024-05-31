package org.example;

public class Libro extends ElementoCatalogo {
    private static final long serialVersionUID = 1L;

    private String autore;
    private String genere;

    public Libro(String codiceISBN, int annoPubblicazione, int numeroPagine, String autore, String genere) {
        super(codiceISBN, annoPubblicazione, numeroPagine);
        this.autore = autore;
        this.genere = genere;
    }

    public String getAutore() {
        return autore;
    }

    public String getGenere() {
        return genere;
    }

    @Override
    public String toString() {
        return "Libro{" +
                "autore='" + autore + '\'' +
                ", genere='" + genere + '\'' +
                "} " + super.toString();
    }
}
