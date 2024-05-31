package org.example;

import java.util.List;
import java.util.Optional;

public class Application {
    public static void main(String[] args) {
        CatalogoBibliotecario catalogo = new CatalogoBibliotecario();

        Libro libro1 = new Libro("1234567890", 2020, 300, "Autore1", "Genere1");
        Libro libro2 = new Libro("0987654321", 2019, 150, "Autore2", "Genere2");
        Rivista rivista1 = new Rivista("1122334455", 2021, 50, Periodicita.MENSILE);

        catalogo.aggiungiElemento(libro1);
        catalogo.aggiungiElemento(libro2);
        catalogo.aggiungiElemento(rivista1);

        System.out.println("Catalogo iniziale:");
        System.out.println(catalogo);

        // Ricerca per ISBN
        Optional<ElementoCatalogo> elementoTrovato = catalogo.cercaElementoPerISBN("1234567890");
        elementoTrovato.ifPresent(System.out::println);

        // Ricerca per anno di pubblicazione
        List<ElementoCatalogo> elementiAnno = catalogo.cercaElementoPerAnno(2021);
        System.out.println("Elementi trovati per anno 2021: " + elementiAnno);

        // Ricerca per autore
        List<ElementoCatalogo> elementiAutore = catalogo.cercaElementoPerAutore("Autore1");
        System.out.println("Elementi trovati per autore 'Autore1': " + elementiAutore);

        // Rimozione di un elemento
        catalogo.rimuoviElemento("1234567890");
        System.out.println("Catalogo dopo rimozione:");
        System.out.println(catalogo);

        // Salvataggio su disco
        catalogo.salvaSuDisco("catalogo.dat");

        // Caricamento da disco
        CatalogoBibliotecario nuovoCatalogo = new CatalogoBibliotecario();
        nuovoCatalogo.caricaDaDisco("catalogo.dat");
        System.out.println("Nuovo catalogo caricato da disco:");
        System.out.println(nuovoCatalogo);
    }
}
