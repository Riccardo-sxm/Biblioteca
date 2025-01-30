import java.util.ArrayList;
import java.util.Scanner;

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
        
        /*System.out.println(b1.getMateriali());

        System.out.println(b1.getMateriali());

        System.out.println(b1.getMateriali());

        int idBiblioteca=b1.trovaCollocazione("L1");

        System.out.println("Il libro si trova nella biblioteca "+biblioteche.get(idBiblioteca));*/

        
        int sceltaUtente, nPagine, idBiblioteca, anno, nVolume;
        String titolo, isbn, genere, autore, editore;
        Scanner sc = new Scanner(System.in);
        boolean continua = true, disponibile = true;



        while (continua) {

        System.out.println("\nScegli un'opzione:");
        System.out.println("1-Aggiungi materiale:");
        System.out.println("2-Verifica disponibilità:");
        System.out.println("3-Effettua prestito:");
        System.out.println("4-Restitutisci prestito:");
        System.out.println("5-Trova collocazione:");
        System.out.println("6-Esci\n");
        sceltaUtente = sc.nextInt();

        switch (sceltaUtente) {
            case 1:
                int libro;
                System.out.println("Scegli NR 1 per aggiungere un libro o NR 2 per aggiungere una rivista:");
                libro = sc.nextInt();
                if (libro == 1) {
                    System.out.println("Inserisci il titolo:");
                    sc.nextLine();
                    titolo = sc.nextLine();
                    System.out.println("Inserisci il genere:");
                    genere = sc.nextLine();
                    System.out.println("Inserisci l'autore:");
                    autore = sc.nextLine();
                    System.out.println("Inserisci l'isbn:");
                    isbn = sc.nextLine();
                    System.out.println("Inserisci l'editore:");
                    editore = sc.nextLine();
                    System.out.println("Inserisci il numero delle pagine:");
                    nPagine = sc.nextInt();
                    System.out.println("Inserisci l'ID della biblioteca:");
                    idBiblioteca = sc.nextInt();
                    b1.aggiungiMateriale(new Libro(titolo, genere, disponibile, idBiblioteca, autore, editore, isbn, nPagine));
                    System.out.println(b1.getMateriali());
                } else {
                    System.out.println("Inserisci il titolo:");
                    sc.nextLine();
                    titolo = sc.nextLine();
                    System.out.println("Inserisci il genere:");
                    genere = sc.nextLine();
                    System.out.println("Inserisci l'autore:");
                    autore = sc.nextLine();
                    System.out.println("Inserisci l'editore:");
                    editore = sc.nextLine();
                    System.out.println("Inserisci l'anno:");
                    anno = sc.nextInt();
                    System.out.println("Inserisci il numero del volume:");
                    nVolume = sc.nextInt();
                    System.out.println("Inserisci l'ID della biblioteca:");
                    idBiblioteca = sc.nextInt();
                    b1.aggiungiMateriale(new Rivista(titolo, genere, disponibile, idBiblioteca, editore, anno, nVolume));
                    System.out.println(b1.getMateriali());
                }
                break;
            case 2:
                String codiceUtente;
                System.out.println("Verifica la disponibilità:");
                sc.nextLine();
                codiceUtente = sc.nextLine();
                boolean disponibilità = b1.verificaDisponibilità(codiceUtente);
                if (disponibilità == true) {
                    System.out.println("Libro disponibile.");
                } else {
                    System.out.println("Libro non disponibile.");
                }
                break;
            case 3:
                String prestitoUtente;
                System.out.println("Inserisci codice per il prestito");
                sc.nextLine();
                prestitoUtente = sc.nextLine();
                if (b1.verificaDisponibilità(prestitoUtente)) {
                    System.out.println("Prestito libro effettuato.");
                    b1.effettuaPrestito(prestitoUtente);
                } else {
                    System.out.println("Non puoi effettuare nessun prestito.");
                }
                break;
            case 4:
                String restituzioneP;
                System.out.println("Effettua la restituzione del prestito.");
                sc.nextLine();
                restituzioneP = sc.nextLine();
                if (!b1.verificaDisponibilità(restituzioneP)) {
                    System.out.println("Restituzione effettuata.");
                    b1.restituisciPrestito(restituzioneP);
                } else {
                    System.out.println("Impossibile effettuare la restituzione.");
                }
                break;
            case 5:
                String collocazione;
                System.out.println("Inserisci collocazione.");
                sc.nextLine();
                collocazione = sc.nextLine();
                if (b1.trovaCollocazione(collocazione)!= null) {
                    System.out.println("Il/la libro/rivista è nella biblioteca " + b1.trovaCollocazione(collocazione));
                } else {
                    System.out.println("Impossibile trovare collocazione.");
                }
                break;
            case 6:
                continua = false;
                break;
            default:
                System.out.println("Opzione non valida.");
        }

        }
        


    }
}
