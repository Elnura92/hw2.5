package com.company;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Collections;
import java.util.Comparator;

public class Main {
    static Scanner obj = new Scanner(System.in);

    public static void main(String[] args) {

        ArrayList<String> cities = new ArrayList<>();  // список А
        ArrayList<String> streets = new ArrayList<>(); //список В
        ArrayList<String> list = new ArrayList<>();  // список С

        while (cities.size() < 5) {
            System.out.println("Введите название города:");
            cities.add(obj.nextLine());
        }

        printList(cities);

        while (streets.size() < 5) {
            System.out.println("Введите название улицы");
            streets.add(obj.nextLine());
        }

        printList(streets);

        Collections.reverse(streets);
        Iterator<String> iteratorCity = cities.iterator();
        Iterator<String> iteratorStreet = streets.iterator();

        while (iteratorCity.hasNext() && iteratorStreet.hasNext()) {
            String city = iteratorCity.next();
            String street = iteratorStreet.next();
            list.add(city);
            list.add(street);
        }

        System.out.println(list);

        list.sort(Comparator.comparing(String::length));
        System.out.println(list);
    }

    public static <E> void printList(ArrayList<E> list){
        Iterator<E> iterator = list.iterator();
        while (iterator.hasNext()){
            Object element = iterator.next();
            System.out.println(element);
        }
        System.out.println("-----------");
    }

    public  static void scannerIn(ArrayList<String> list){
        while (list.size() < 5) {
            System.out.println("Введите название города:");
            list.add(obj.nextLine());
        }

    }
}
