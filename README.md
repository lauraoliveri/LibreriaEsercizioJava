Realizza due classi: Libro e Libreria. La classe Libreria gestisce una collezione di libri, permettendo operazioni come aggiunta, rimozione e ricerca.

🔧 Requisiti della classe Libro:

Deve contenere i seguenti attributi:

    String titolo

    String autore

    int annoPubblicazione

    boolean disponibile

Metodi richiesti:

    public Libro(String titolo, String autore, int annoPubblicazione)
    👉 Costruttore per inizializzare i campi. L’attributo disponibile deve essere inizializzato a true.

    public String dettagliLibro()
    👉 Restituisce una stringa con le informazioni del libro nel formato:
    "Titolo: ..., Autore: ..., Anno: ..., Disponibile: Sì/No"

    public void prestareLibro()
    👉 Imposta disponibile = false solo se è disponibile.

    public void restituireLibro()
    👉 Imposta disponibile = true.

    public String getTitolo()
    👉 Restituisce il titolo del libro (utile per ricerche nella libreria).

    public boolean isDisponibile()
    👉 Restituisce true o false a seconda della disponibilità del libro.

🔧 Requisiti della classe Libreria:

Deve gestire una collezione di oggetti Libro.

Metodi richiesti:

    public Libreria()
    👉 Costruttore: inizializza una collezione vuota di libri.

    public boolean aggiungiLibro(Libro libro)
    👉 Aggiunge un libro al catalogo e restituisce true.

    public boolean rimuoviLibro(String titolo)
    👉 Rimuove il libro dal catalogo se esiste, cercandolo per titolo (case-insensitive), e restituisce true. Se il libro non esiste, restituisce false.

    public Libro cercaLibro(String titolo)
    👉 Cerca un libro per titolo (case-insensitive) e lo restituisce. Se non trovato, restituisce null.

    public List<String> mostraCatalogo()
    👉 Restituisce una lista di stringhe con le informazioni di tutti i libri nel catalogo, usando il metodo dettagliLibro() di ciascun libro. Se il catalogo è vuoto, la lista sarà vuota.

💡 Nota:

I metodi devono avere i nomi indicati altrimenti i test non funzioneranno.