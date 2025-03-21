import java.util.Collections;

public class Angestellter implements Comparable<Angestellter>
{
    private static int id_cnt = 0;

    private final int id;
    private String nachname;
    private String vorname;
    private int geburtsJahr;
    private int einstellungsJahr;

    public Angestellter() {
        this.id = ++Angestellter.id_cnt;
    }

    public Angestellter(String nachname, 
                        String vorname, 
                        int geburtsJahr,
                        int einstellungsJahr) {
        this();
        this.nachname = nachname;
        this.vorname = vorname;
        this.geburtsJahr = geburtsJahr;
        this.einstellungsJahr = einstellungsJahr;
    }
    
    public int getGeburtsJahr() {
        return this.geburtsJahr;
    }
    
    public int getEinstJahr() {
        return this.einstellungsJahr;
    }
    
    @Override
    public String toString() {
        return String.format("| %6d | %-15s | %-15s | %6d | %6d |",
            id,nachname, vorname, geburtsJahr, einstellungsJahr);
    }
    
    @Override
    public int compareTo(Angestellter other) {
        //return Integer.compare(this.einstellungsJahr, other.einstellungsJahr);
        //return Integer.compare(this.geburtsJahr, other.geburtsJahr);
        return Integer.compare(this.id, other.id);
    }
    
}

