package fr.iut.editeur.document;

public class Document {

    private String texte;

    public Document() {
        this.texte = "";
    }
	
    public String getTexte() {
        return texte;
    }

    public void setTexte(String texte) {
        this.texte = texte;
    }

    public void ajouter(String texte) {
        this.texte += texte;
    }

    public void remplacer(int start, int end, String remplacement) {
        String leftPart = texte.substring(0, start);
        String rightPart = texte.substring(end);
        texte = leftPart + remplacement + rightPart;
    }

    public void majuscules(int start, int end) {
        String leftPart = texte.substring(start, end);
        remplacer(start, end, leftPart.toUpperCase());
    }

    public void effacer(int start, int end) {
       remplacer(start, end, "");
    }

    public void clear() {
        remplacer(0, texte.length(), "");
    }

    @Override
    public String toString() {
        return this.texte;
    }
}
