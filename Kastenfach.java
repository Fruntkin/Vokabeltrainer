/**
 * Die Klasse Kastenfach stellt Objekte bereit, die Vokabelkarten in einer Queue
 * aufnehmen können.
 * 
 * @author Henning Ainödhofer
 * @version 16.07.2015
 */
public class Kastenfach
{
    /**
     * Queueobjekt, welches Objekte vom typ Vokabel speichern kann.
     */
    private List <Vokabel> vokabeln;

    /**
     * Konstruktor der Klasse Kastenfach. Hier wird eine neue Queue erstellt.
     */
    public Kastenfach()
    {
        vokabeln = new List <Vokabel>();
    }

    /**
     * gibt die erste Vokabel des Kastenfachs zurück.
     */
    public Vokabel gibErsteVokabel()
    {
        vokabeln.toFirst();
        return vokabeln.getContent();
    }

    /**
     * löscht die übergebene Vokabel aus dem Kastenfach. Ist die Vokabel direkt die erste Vokabel, 
     * wird diese direkt gelöscht. In allen anderen Fällen wird die Queue durchlaufen bis das 
     * ehemals erste Element wieder vorne ist. Wird die gesuchte Vokabel gefunden, wird diese 
     * einfach gelöscht.
     */
    public void loescheVokabel(Vokabel vokabel)
    {
        // zu implementieren
        vokabeln.toFirst();
        while (vokabeln.hasAccess())
        {
            if (vokabeln.getContent().equals(vokabel))
            {
                break;
            }
            vokabeln.next();
        }
        vokabeln.remove();
    }

    /**
     * gibt zurück ob das Kastenfach leer ist.
     */
    public boolean istLeer()
    {
        // zu implementieren
        return vokabeln.isEmpty();
    }

    /**
     * hängt die übergebene Vokabel an die List an.
     */
    public void haengeVokabelAn(Vokabel vokabel)
    {
        // zu implementieren
        vokabeln.append(vokabel);
    }
}
