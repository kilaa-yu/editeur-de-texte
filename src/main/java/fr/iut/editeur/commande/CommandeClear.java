package fr.iut.editeur.commande;

import fr.iut.editeur.document.Document;

/**
 * Class CommandeClear : Clear tout le texte
 */
public class CommandeClear extends CommandeDocument {

    public CommandeClear(Document document, String[] parameters) { super(document, parameters); }

    public void executer() {
        this.document.clear();
        super.executer();
    }

}