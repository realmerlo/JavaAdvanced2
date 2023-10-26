package Arraylist1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("Luca", 27);
        Student student2 = new Student("Andrea", 25);
        Student student3 = new Student("Pietro", 21);
        Student student4 = new Student("Antonio", 32);

        List<Student> students = new ArrayList<>();
        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student4);

        System.out.println(students);

        Student student5 = new Student("Mario", 37);
        Student student6 = new Student("Ghandi", 48);
        Student student7 = new Student("Mirko", 18);
        Student student8 = new Student("Jamal", 73);


        students.add(student5);
        students.add(student6);
        students.add(student7);
        students.add(student8);

        System.out.println("Updated List" + students);

    }
}
//Creare una classe Student che accenti nel costruttore il parametro name (String e age Int)
//In questa classe avere i metodi pubblici per ottenere le informazioni.
//Creare un ArrayList con n elementi e stamparlo in console.
//Aggiungere 4 elementi alla collezione e stampare la collezione aggiornata in console