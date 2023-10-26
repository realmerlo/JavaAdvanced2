package Hashmap2;

import Hashmap1.Student;

import java.util.*;

public class Hashmap2 {
    public static void main(String[] args){

            Student student1 = new Student("Luca", 27);
            Student student2 = new Student("Andrea", 25);
            Student student3 = new Student("Pietro", 21);

            Map<String, Student> mappa = new HashMap<String, Student>();

            mappa.put("King", student1);
            mappa.put("TeamLead", student2);
            mappa.put("Boss", student3);

        List<Student> value = new ArrayList<>(mappa.values());
        Collections.sort(value);
    }
}
//Creare un hashmap prendere tutti i valori, ordinarli e stamparli
