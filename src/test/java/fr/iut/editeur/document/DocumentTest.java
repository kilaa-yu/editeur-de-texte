package fr.iut.editeur.document;

import fr.iut.editeur.document.Document;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class DocumentTest {

    @Test
    public void testAjouter() {
        Document document = new Document();
        document.ajouter("Hello");
        assertEquals("Hello", document.getTexte());

        document.ajouter(" World");
        assertEquals("Hello World", document.getTexte());
    }

    @Test
    public void testRemplacer() {
        Document document = new Document();
        document.setTexte("Hello World");
        document.remplacer(6, 11, "Java");
        assertEquals("Hello Java", document.getTexte());
    }

    @Test
    public void testMajuscules() {
        Document document = new Document();
        document.setTexte("hello world");
        document.majuscules(0, 5);
        assertEquals("HELLO world", document.getTexte());
    }

    @Test
    public void testEffacer() {
        Document document = new Document();
        document.setTexte("Hello World");
        document.effacer(6, 11);
        assertEquals("Hello ", document.getTexte());
    }

    @Test
    public void testClear() {
        Document document = new Document();
        document.setTexte("Hello World");
        document.clear();
        assertEquals("", document.getTexte());
    }

    @Test
    public void testToString() {
        Document document = new Document();
        document.setTexte("Hello");
        assertEquals("Hello", document.toString());
    }
}
