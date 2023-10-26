package Arraylist3;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Arraylist3 {
    public static void main(String[] args) {

        Fruit fruit1 = new Fruit("Coconut");
        Fruit fruit2 = new Fruit("Banana");
        Fruit fruit3 = new Fruit("Raspberry");



        List<Fruit> fruits = new LinkedList<>(Arrays.asList(fruit1, fruit2, fruit3));

        System.out.println(fruits);

        Fruit fruit4 = new Fruit("Watermelon");
        Fruit fruit5 = new Fruit("Apple");

        fruits.addFirst(fruit4);
        fruits.addLast(fruit5);

        System.out.println("Updated List = " + fruits);

    }
}
//Creare una classe Fruit che accenti nel costruttore il parametro name (String)
//In questa classe avere i metodi pubblici per ottenere le informazioni.
//Creare un LinkedList con elementi e stamparlo in console.
//Aggiungere un elemento al primo posto della lista e uno all'ultimo
//Stampare la collezione aggiornata
