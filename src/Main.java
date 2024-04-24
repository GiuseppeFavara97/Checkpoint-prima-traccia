/*- Crea una classe `StringArray` con un attributo array di stringhe.
        - Implementa un metodo per trovare e stampare la stringa più lunga presente nell'array.
        - Implementa un metodo per contare e stampare il numero di stringhe che iniziano con una determinata lettera.
        - Utilizza la classe e la funzione nel main

        **Traccia Bonus**
        **Classe Progetto e Dipartimento:**
        - Crea una classe `Progetto` con attributi titolo, descrizione e lista dei membri (istanze di `Docente`).
        - Crea una classe `Dipartimento` che rappresenta un dipartimento universitario, con attributi nome, lista dei docenti appartenenti e lista dei progetti in corso.
        - Implementa un metodo per aggiungere un nuovo progetto al dipartimento e un metodo per trovare i docenti che partecipano a un determinato progetto.
        - Utilizza la classe e la funzione nel main
*/
public class Main {
    public static void main(String[] args) {
        String[]arrayDiStringhe = {"casa", "albero", "cane", "giardino", "mela", "banane"};

        StringArrey strings = new StringArrey(arrayDiStringhe);

        strings.checklenght();

        strings.countAndPrintStringsThatStartWith('c');
    }
}
