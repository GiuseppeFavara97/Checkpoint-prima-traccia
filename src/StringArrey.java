public class StringArrey {
    String[] stringhe;

    //costruttore
    public StringArrey(String[] stringhe){
        this.stringhe = stringhe;
    }

    // metodo per trovare e stampare la stringa più lunga presente nell'array
    public void checklenght() {
        String addLenght = "";
        for (String i : stringhe) {

            if (i.length() > addLenght.length()) {
                addLenght = i;
            }
        }
        System.out.println("La stringa piu' lunga e': " + addLenght);
    }

    // Metodo per contare e stampare il numero di stringhe che iniziano con una determinata lettera
    public void countAndPrintStringsThatStartWith(char lettera){
        int contatore = 0;
        for (String s : stringhe){
            if(s.charAt(0) == Character.toLowerCase(lettera) || s.charAt(0) == Character.toUpperCase(lettera)){

                contatore++;

            }
        }
        System.out.println("Il numero di stringhe che iniziano con il carattere '" + lettera +"' e' " + contatore);
    }
}


