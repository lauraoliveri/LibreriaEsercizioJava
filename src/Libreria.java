import java.util.ArrayList;
import java.util.List;

public class Libreria {
    private List<Libro> catalogo;

    public Libreria() {
        catalogo = new ArrayList<>();
    }

    public boolean aggiungiLibro(Libro libro) {
        catalogo.add(libro);
        return true;
    }

    public boolean rimuoviLibro(String titolo) {

        boolean rimosso = false;

        for (Libro libro : catalogo){
            if (libro.getTitolo().toLowerCase().contains(titolo.toLowerCase())) {
                catalogo.remove(libro);
                rimosso = true;
                break;
            }
        }

        return rimosso;

    }

    public Libro cercaLibro(String titolo) {
        for (Libro libro : catalogo){
            if (libro.getTitolo().toLowerCase().contains(titolo.toLowerCase())) {
                return libro;
            }
        }
        return null;
    }

    public List<String> mostraCatalogo() {

        // creo una nuova lista
        List<String> dettagli = new ArrayList<>();

        for (Libro libro : catalogo){
           dettagli.add(libro.dettagliLibro()); // richiamo la funziona di libro
        }

        return dettagli;
    }
}
