import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {
        ArrayList<Biblioteca> biblioteche = new ArrayList<>();
        biblioteche.add(new Biblioteca(1, "Via Roma", 1, 12345, "Roma"));
        biblioteche.add(new Biblioteca(2, "Via Milano", 2, 54321, "Milano"));
        biblioteche.add(new Biblioteca(3, "Via Napoli", 3, 67890, "Napoli"));
        biblioteche.add(new Biblioteca(4, "Via Firenze", 4, 98765, "Firenze"));
        biblioteche.add(new Biblioteca(5, "Via Torino", 5, 13579, "Torino"));
        biblioteche.add(new Biblioteca(6, "Via Bologna", 6, 24680, "Bologna"));
        biblioteche.add(new Biblioteca(7, "Via Palermo", 7, 97531, "Palermo"));
        biblioteche.add(new Biblioteca(8, "Via Genova", 8, 86420, "Genova"));
        biblioteche.add(new Biblioteca(9, "Via Venezia", 9, 75319, "Venezia"));
        biblioteche.add(new Biblioteca(10, "Via Verona", 10, 64208, "Verona"));
        Biblioteca b1 = biblioteche.get(0);

        b1.aggiungiMateriale(new Libro( "Il signore degli anelli", "Fantasy", true, 1, "J.R.R. Tolkien", "Mondadori", "978-88-04-42490-3", 1000));
        b1.aggiungiMateriale(new Libro( "Harry potter", "Fantasy", false, 2, "J.K. Rowling", "Salani", "978-88-04-42490-4", 500));
        b1.aggiungiMateriale(new Rivista( "Focus", "Scientifico", true, 3, "Mondadori", 2021, 1));
        b1.aggiungiMateriale(new Rivista( "National Geographic", "Scientifico", true, 4, "National Geographic Society", 2021, 2));
        
        System.out.println(b1.getMateriali());

        b1.effettuaPrestito(1);

        System.out.println(b1.getMateriali());

        b1.restituisciPrestito(1);

        System.out.println(b1.getMateriali());

        int idBiblioteca=b1.trovaCollocazione("L1");

        System.out.println("Il libro si trova nella biblioteca "+biblioteche.get(idBiblioteca));


    }
}
