public class Rivista extends Materiale {

    private String editore;
    private int anno;
    private int nrVolume;
    private static int nRivista = 1;

    public Rivista(String titolo, String genere, boolean disponibile, int id, String editore,
            int anno, int nrVolume) {
        super("R"+nRivista, titolo, genere, disponibile, id);
        this.editore = editore;
        this.anno = anno;
        this.nrVolume = nrVolume;
        nRivista++;
    }

    public String getEditore() {
        return editore;
    }

    public void setEditore(String editore) {
        this.editore = editore;
    }

    public int getAnno() {
        return anno;
    }

    public void setAnno(int anno) {
        this.anno = anno;
    }

    public int getNrVolume() {
        return nrVolume;
    }

    public void setNrVolume(int nrVolume) {
        this.nrVolume = nrVolume;
    }

    @Override
    public String toString() {
        return "Rivista [\n"+
            "  codiceInterno=" + getCodiceInterno() + ",\n"+
            "  titolo=" + getTitolo() + ",\n"+
            "  genere=" + getGenere() + ",\n"+
            "  editore=" + editore + ",\n"+
            "  anno=" + anno + ",\n"+
            "  nrVolume=" + nrVolume + "\n"+
            "]";
    }
    

    


}
