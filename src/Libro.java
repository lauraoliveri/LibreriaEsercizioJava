import java.util.ArrayList;
import java.util.List;

// Classe Libro
class Libro {
    private String titolo;
    private String autore;
    private int annoPubblicazione;
    private boolean disponibile;


    // Costruttore
    public Libro(String titolo, String autore, int annoPubblicazione) {
       this.titolo = titolo;
       this.autore = autore;
       this.annoPubblicazione = annoPubblicazione;
       disponibile = true;
    }


    // Metodo per ottenere i dettagli del libro
    public String dettagliLibro() {

        return "Libro{" +
                "titolo='" + titolo + '\'' +
                ", autore='" + autore + '\'' +
                ", annoPubblicazione=" + annoPubblicazione +
                ", disponibile=" + disponibile +
                '}';

    }

    // Metodo per prestare un libro
    public void prestareLibro() {

        if (disponibile){
            disponibile = false;
        }
    }

    // Metodo per restituire un libro
    public void restituireLibro() {

        disponibile = true;
    }

    // Getter per titolo (usato nella ricerca)

    public String getTitolo() {
        return titolo;
    }

    public boolean isDisponibile() {

        if (disponibile){
            return true;
        }
        else{
            return false;
        }
    }

}