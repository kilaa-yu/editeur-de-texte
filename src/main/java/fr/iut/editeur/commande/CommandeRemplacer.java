package fr.iut.editeur.commande;

import fr.iut.editeur.document.Document;

public class CommandeRemplacer extends CommandeDocument {

    public CommandeRemplacer(Document document, String[] parameters) {
        super(document, parameters);
    }

    public void executer() {
        if (parameters.length < 3) {
            System.err.println("Format attendu : remplacer;début;fin;texte(optionnel)");
            return;
        }
        String remplacement = "";
        if (parameters.length == 4)
            remplacement = parameters[3];
        this.document.remplacer(Integer.parseInt(parameters[1]), Integer.parseInt(parameters[2]), remplacement);

        super.executer();
    }

}
