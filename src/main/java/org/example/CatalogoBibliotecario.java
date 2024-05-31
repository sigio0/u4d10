package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class CatalogoBibliotecario {
    private List<ElementoCatalogo> catalogo;

    public CatalogoBibliotecario() {
        this.catalogo = new ArrayList<>();
    }

    public void aggiungiElemento(ElementoCatalogo elemento) {
        catalogo.add(elemento);
    }

    public void rimuoviElemento(String codiceISBN) {
        catalogo.removeIf(elemento -> elemento.getCodiceISBN().equals(codiceISBN));
    }

    public Optional<ElementoCatalogo> cercaElementoPerISBN(String codiceISBN) {
        return catalogo.stream()
                .filter(elemento -> elemento.getCodiceISBN().equals(codiceISBN))
                .findFirst();
    }

    public List<ElementoCatalogo> cercaElementoPerAnno(int annoPubblicazione) {
        return catalogo.stream()
                .filter(elemento -> elemento.getAnnoPubblicazione() == annoPubblicazione)
                .collect(Collectors.toList());
    }

    public List<ElementoCatalogo> cercaElementoPerAutore(String autore) {
        return catalogo.stream()
                .filter(elemento -> elemento instanceof Libro)
                .map(elemento -> (Libro) elemento)
                .filter(libro -> libro.getAutore().equalsIgnoreCase(autore))
                .collect(Collectors.toList());
    }

    @Override
    public String toString() {
        return "CatalogoBibliotecario{" +
                "catalogo=" + catalogo +
                '}';
    }
}
