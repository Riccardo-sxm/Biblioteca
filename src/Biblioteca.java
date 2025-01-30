import java.util.ArrayList;

public class Biblioteca {
    private int id;
    private String via;
    private int civico;
    private int cap;
    private String città;
    private static ArrayList<Materiale> materiali = new ArrayList<>();

    public Biblioteca(int id, String via, int civico, int cap, String città) {
        this.id = id;
        this.via = via;
        this.civico = civico;
        this.cap = cap;
        this.città = città;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getVia() {
        return via;
    }

    public void setVia(String via) {
        this.via = via;
    }

    public int getCivico() {
        return civico;
    }

    public void setCivico(int civico) {
        this.civico = civico;
    }

    public int getCap() {
        return cap;
    }

    public void setCap(int cap) {
        this.cap = cap;
    }

    public String getCittà() {
        return città;
    }

    public void setCittà(String città) {
        this.città = città;
    }

    public static void aggiungiMateriale(Materiale mat){
        materiali.add(mat);
    }

    public static boolean verificaDisponibilità(String codice){
        for (Materiale mat : materiali){
            if (mat.getCodiceInterno().equals(codice)){
                return mat.isDisponibile();
            }
        }
        return false;
    }

    public static void effettuaPrestito(String codice){
        for (Materiale mat : materiali){
            if (mat.getCodiceInterno().equals(codice)){
                if (mat.isDisponibile()){
                    mat.setDisponibile(false);
                }
            }
        }
    }

    public static void restituisciPrestito(String codice){
        for (Materiale mat : materiali){
            if (mat.getCodiceInterno().equals(codice)){
                if (!mat.isDisponibile()){
                    mat.setDisponibile(true);
                }
            }
        }
    }

    public static Integer trovaCollocazione(String codice){ 
        for (Materiale mat : materiali){
            if (mat.getCodiceInterno().equals(codice)){
                return mat.getId();
            }
        }
        return null;
    }

    public static ArrayList<Materiale> getMateriali() {
        return materiali;
    }

    @Override
    public String toString() {
        return "Biblioteca [\n"+
            "  id=" + id + ",\n"+
            "  via=" + via + ",\n"+
            "  civico=" + civico + ",\n"+
            "  cap=" + cap + ",\n"+
            "  città=" + città + "\n"+
            "]";
    }

    
}
