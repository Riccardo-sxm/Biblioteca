public class Libro extends Materiale {

    private String autore;
    private String editore;
    private String isbn;
    private int nPagine;
    private static int nLibri = 1;

    public Libro(String titolo, String genere, boolean disponibile, int id, String autore,
            String editore, String isbn, int nPagine) {
        super("L" + nLibri, titolo, genere, disponibile, id);
        this.autore = autore;
        this.editore = editore;
        this.isbn = isbn;
        this.nPagine = nPagine;
        nLibri++;
    }

    public String getAutore() {
        return autore;
    }

    public void setAutore(String autore) {
        this.autore = autore;
    }

    public String getEditore() {
        return editore;
    }

    public void setEditore(String editore) {
        this.editore = editore;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public int getnPagine() {
        return nPagine;
    }

    public void setnPagine(int nPagine) {
        this.nPagine = nPagine;
    }

    @Override
    public String toString() {
        return "Libro [\n"+
        "  codiceInterno=" + getCodiceInterno() + ",\n"+
        "  titolo=" + getTitolo() + ",\n"+ 
        "  genere=" + getGenere() + ",\n"+
        "  autore=" + autore + ",\n"+
        "  editore=" + editore + ",\n"+
        "  isbn=" + isbn + ",\n"+
        "  nPagine=" + nPagine + ",\n"+
        "  disponibile=" + isDisponibile() + ",\n"+
        "  idBiblioteca=" + getId() + "\n"+
        "]";
    }
}
