package Hashmap1;

import java.util.AbstractMap;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Hashmap1 {
    public static void main(String[] args){
        Student student1 = new Student("Luca", 27);
        Student student2 = new Student("Andrea", 25);
        Student student3 = new Student("Pietro", 21);

        Map<String, Student> mappa = new HashMap<String, Student>();

        mappa.put("King", student1);
        mappa.put("TeamLead", student2);
        mappa.put("Boss", student3);

        Set<Map.Entry<String, Student>> entries = mappa.entrySet();
        System.out.println("mappa = " + mappa);

        Map<String, Student> mappa2 = new HashMap<String, Student>(Map.of("King", student1, "TeamLead", student2, "Boss", student3));
        Set<Map.Entry<String, Student>> entries2 = mappa.entrySet();
        System.out.println("mappa2 = " + mappa2);

        Map<String, Student> mappa3 = new HashMap<String, Student>(Map.ofEntries(
                new AbstractMap.SimpleEntry<String,Student>("King", student1),
                new AbstractMap.SimpleEntry<String,Student>("TeamLead", student2),
                new AbstractMap.SimpleEntry<String,Student>("Boss", student3)
        ));

        Set<Map.Entry<String, Student>> entries3 = mappa.entrySet();
        System.out.println("mappa3 = " + mappa3);


    }
}
//Creare 3 hashmap con 3 differenti metodi di inizializzazione e stampare il contenuto
