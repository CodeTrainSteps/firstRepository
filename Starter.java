import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Starter

// Change for GitHub Test
{
    private static ArrayList<Angestellter> angestellte = createAngestList(false);

    private static ArrayList<Angestellter> createAngestList(boolean big) {
        ArrayList<Angestellter> retList = new ArrayList<>();
        retList.add(new Angestellter("Müller", "Hans", 1975, 2000));
        retList.add(new Angestellter("Schmidt", "Anna", 1980, 2005));
        retList.add(new Angestellter("Schneider", "Peter", 1985, 2010));
        retList.add(new Angestellter("Fischer", "Maria", 1990, 2000));
        retList.add(new Angestellter("Weber", "Klaus", 1978, 2003));
        if (big) {
            retList.add(new Angestellter("Meyer", "Sabine", 1982, 2007));
            retList.add(new Angestellter("Wagner", "Stefan", 1979, 2001));
            retList.add(new Angestellter("Becker", "Laura", 1988, 2012));
            retList.add(new Angestellter("Hofmann", "Thomas", 1991, 2016));
            retList.add(new Angestellter("Koch", "Julia", 1977, 2002));
            retList.add(new Angestellter("Bauer", "Michael", 1983, 2008));
            retList.add(new Angestellter("Richter", "Nina", 1986, 2011));
            retList.add(new Angestellter("Klein", "Uwe", 1989, 2013));
            retList.add(new Angestellter("Wolf", "Birgit", 1976, 2004));
            retList.add(new Angestellter("Schröder", "Lukas", 1981, 2006));
            retList.add(new Angestellter("Neumann", "Sophie", 1987, 2009));
            retList.add(new Angestellter("Schwarz", "Jürgen", 1992, 2017));
            retList.add(new Angestellter("Zimmermann", "Lisa", 1974, 1999));
            retList.add(new Angestellter("Krüger", "Frank", 1984, 2010));
            retList.add(new Angestellter("Lange", "Nicole", 1993, 2018));
        }
        return retList;
    }
    
    public static void printAngestTableSimple() {
        System.out.println("-----=====           Angestelltenverzeichnis          =====-----");
        for(Angestellter ang: angestellte) {
            System.out.println(ang);
        }
    }
    
    public static void printAngestTable() {
        System.out.println("-----=====           Angestelltenverzeichnis          =====-----");
        angestellte.forEach(System.out::println);    
    }
    
    public static void addRemoveExample() {
        printAngestTable();
        angestellte.addFirst(new Angestellter("Angestellter", "Anton", 1985, 1997));
        angestellte.addLast(new Angestellter("Mitarbeiter", "Monika", 1984, 1996));
        angestellte.add(2, new Angestellter("Zapf", "Sascha", 1970, 1994));
        printAngestTable();
        System.out.println("Wird entfernt:" + angestellte.remove(2).toString());
        printAngestTable();

    }
    
    public static void getExample() {
        printAngestTable();
        System.out.println("\n\n");
        System.out.println("Erster : " + angestellte.getFirst());
        System.out.println("Index 3: " + angestellte.get(3));
        System.out.println("Letzter: " + angestellte.getLast());
    }
    
    public static void setExample() {
        printAngestTable();
        angestellte.set(2, new Angestellter("Walkes", "Otto", 1948, 1990));
        printAngestTable();
        
    }
    
    public static void sortExample() {
        printAngestTable();
        Collections.sort(angestellte);
        printAngestTable();
    }
    
    public static void sortExampleComp() {
        printAngestTable();
        
        Comparator<Angestellter> gebJahr = new Comparator<Angestellter>() {
            @Override
            public int compare(Angestellter a1, Angestellter a2) {
                return Integer.compare(a1.getGeburtsJahr(), a2.getGeburtsJahr());
            }
        };
        
        Comparator<Angestellter> einstJahr = new Comparator<Angestellter>() {
            @Override
            public int compare(Angestellter a1, Angestellter a2) {
                return Integer.compare(a1.getEinstJahr(), a2.getEinstJahr());
            }
        };
                
        Collections.sort(angestellte, gebJahr);
        printAngestTable();
        Collections.sort(angestellte, einstJahr);
        printAngestTable();
        
    }
    
    public static void containsExample() {
        Angestellter a = new Angestellter("Mustermann", "Max", 1980, 1998);
        System.out.println(angestellte.contains(a));
        angestellte.add(a);
        System.out.println(angestellte.contains(a));
        System.out.println(angestellte.indexOf(a));
        printAngestTable();
    }
    
    public static void main(String[] args) {
        System.out.println(angestellte.hashCode());    
        System.out.println(angestellte.isEmpty());    
        System.out.println(angestellte.size());    
        
    }    

    public static void test() {
        TestKlasse tk1 = new TestKlasse();
        tk1.ausgabe();    
        
        TestKlasse tk2 = new TestKlasse() {
            @Override
            public void ausgabe() {
                System.out.println("Geänderte Ausgabe");
            }
        };
        
        tk2.ausgabe();
    }
    
}
