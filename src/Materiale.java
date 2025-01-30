public class Materiale {

    private String codiceInterno;
    private String titolo;
    private String genere;
    private boolean disponibile;
    private String id;

    public Materiale(String codiceInterno, String titolo, String genere, boolean disponibile, String id) {
        this.codiceInterno = codiceInterno;
        this.titolo = titolo;
        this.genere = genere;
        this.disponibile = true;
        this.id = id;
    }

    public String getCodiceInterno() {
        return codiceInterno;
    }

    public void setCodiceInterno(String codiceInterno) {
        this.codiceInterno = codiceInterno;
    }

    public String getTitolo() {
        return titolo;
    }

    public void setTitolo(String titolo) {
        this.titolo = titolo;
    }

    public String getGenere() {
        return genere;
    }

    public void setGenere(String genere) {
        this.genere = genere;
    }

    public boolean isDisponibile() {
        return disponibile;
    }

    public void setDisponibile(boolean disponibile) {
        this.disponibile = disponibile;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    

    
}

