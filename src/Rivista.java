public class Rivista extends Materiale {

    private String editore;
    private int anno;
    private int nrVolume;

    public Rivista(String codiceInterno, String titolo, String genere, boolean disponibile, String id, String editore,
            int anno, int nrVolume) {
        super(codiceInterno, titolo, genere, disponibile, id);
        this.editore = editore;
        this.anno = anno;
        this.nrVolume = nrVolume;
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

    public void generaCodice() {
        
    }
    

    


}
