package com.company;

import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Random;

/**
 * Created by User on 30.05.2016.
 */
public class LinkedListFindTime {
    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<>();


        long startTime = System.currentTimeMillis();
        Random random = new Random();
        Integer r = random.nextInt(10000);
        long endAddTime = 0;
        for (int i = 0; i < 10000; i++) {
            linkedList.add(r);
            endAddTime = System.currentTimeMillis();

        }
        System.out.println(endAddTime - startTime + " ms");

        long startGetTime = System.currentTimeMillis();
        long endGetTime = 0;
        for (int i = 0; i < 10000; i++) {
            linkedList.get(r);
            endGetTime = System.currentTimeMillis();
        }
        System.out.println(endGetTime - startGetTime + " ms");

        long startRemoveTime = System.currentTimeMillis();
        long endRemoveTime = 0;
        for (int i = 0; i < 10000; i++) {
            linkedList.remove(r);
            endRemoveTime = System.currentTimeMillis();
        }
        System.out.println(endRemoveTime - startRemoveTime + " ms");

        long startPopulateTime = System.currentTimeMillis();
        long endPopulateTime = 0;
        for (int i = 0; i < 10000; i++) {
            linkedList.add(new Integer(r));
            endPopulateTime = System.currentTimeMillis();
        }
        System.out.println(endPopulateTime - startPopulateTime + " ms");

        long startIteratorAddTime = System.currentTimeMillis();
        ListIterator<Integer> listIterator;
        long endIteratorAdd = 0;
        for (int i = 0; i < 10000; i++) {
            linkedList.add(r);
            listIterator = linkedList.listIterator();
            while (listIterator.hasNext()) {
                Integer integer = (Integer) listIterator.next();
            }
            endIteratorAdd = System.currentTimeMillis();
        }
        System.out.println(endIteratorAdd-startIteratorAddTime + " ms");

        long startIteratorRemoveTime = System.currentTimeMillis();
        long endIteratorRemove = 0;
        for (int i = 0; i < 10000; i++) {
            linkedList.remove(r);
            listIterator = linkedList.listIterator();
            while (listIterator.hasNext()) {
                Integer integer = (Integer) listIterator.next();
            }
            endIteratorRemove = System.currentTimeMillis();
        }
        System.out.println(endIteratorRemove-startIteratorRemoveTime + " ms");
    }


}
