package Arraylist2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Arraylist2 {
    public static void main(String[] args) {
        Student student1 = new Student("Luca", 27);
        Student student2 = new Student("Andrea", 25);
        Student student3 = new Student("Pietro", 21);
        Student student4 = new Student("Antonio", 32);
        Student student5 = new Student("Mario", 37);
        Student student6 = new Student("Ghandi", 48);
        Student student7 = new Student("Mirko", 18);
        Student student8 = new Student("Jamal", 73);
        Student student9 = new Student("Kikko", 58);
        Student student10 = new Student("BigLuca", 33);
        Student student11 = new Student("KingLuca", 99);
        Student student12 = new Student("LucaTheBoss", 1);

        List<Student> students = new ArrayList<>(Arrays.asList(student1, student2, student3,student4, student5, student6, student7,student8,student9,student10,student11,student12));

        System.out.println(students);

        students.sort(Comparator.comparing(Student::getAge));
        System.out.println(students);
    }
}
//Creare una classe Student che accenti nel costruttore il parametro name (String e age Int)
//In questa classe avere i metodi pubblici per ottenere le informazioni.
//Creare un ArrayList con 12 elementi e stamparlo in console.
//mettere in ordine la collezione e stampare il risultato