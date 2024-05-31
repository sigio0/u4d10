package org.example;

import java.io.Serializable;

public abstract class ElementoCatalogo implements Serializable {
    private static final long serialVersionUID = 1L;

    private String codiceISBN;
    private int annoPubblicazione;
    private int numeroPagine;

    public ElementoCatalogo(String codiceISBN, int annoPubblicazione, int numeroPagine) {
        this.codiceISBN = codiceISBN;
        this.annoPubblicazione = annoPubblicazione;
        this.numeroPagine = numeroPagine;
    }

    public String getCodiceISBN() {
        return codiceISBN;
    }

    public int getAnnoPubblicazione() {
        return annoPubblicazione;
    }

    public int getNumeroPagine() {
        return numeroPagine;
    }

    @Override
    public String toString() {
        return "ElementoCatalogo{" +
                "codiceISBN='" + codiceISBN + '\'' +
                ", annoPubblicazione=" + annoPubblicazione +
                ", numeroPagine=" + numeroPagine +
                '}';
    }
}
