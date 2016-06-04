package com.company;

import java.util.ArrayList;
import java.util.ListIterator;
import java.util.Random;

public class ArrayListFindTime {

    interface CollectionsTime {
        void findTime();

    }

    public static void main(String[] args) {

        ArrayList<Integer> arrayList = new ArrayList<>();
        Random random = new Random();
        Integer r = random.nextInt(1000);
        long sum = 0;
        double average = 0;
        long mass[] = new long[10000000];
        for (int i = 0; i < 1000000; i++) {
            long start = System.currentTimeMillis();
            arrayList.add(i);
            long end = System.currentTimeMillis();
            mass[i] = end - start;
        }
        for (int i = 0; i < 10000000; i++){
            sum  =  sum + mass[i];
        }
        average = (double) sum/mass.length;
        System.out.println(sum );
        System.out.println(average);




        long endGetTime;
        long averageTimeGet = 0;
        for (int i = 0; i < 10000; i++) {
            long startTime1 = System.currentTimeMillis();
            arrayList.get(r);
            endGetTime = System.currentTimeMillis();
            averageTimeGet = endGetTime - startTime1;
    }
        System.out.println(averageTimeGet);


        long endRemoveTime;
        long removeTime = 0;
        for (int i = 0; i < 10000; i++) {
            long startRemoveTime = System.currentTimeMillis();
            arrayList.remove(r);
            endRemoveTime = System.currentTimeMillis();
            removeTime = endRemoveTime - startRemoveTime;
        }
        System.out.println(removeTime);


        long endContainsTime;
        long containsTime = 0;
        for (int i = 0; i < 10000; i++) {
            long startContainsTime = System.currentTimeMillis();
            arrayList.contains(r);
            endContainsTime = System.currentTimeMillis();
            containsTime = endContainsTime - startContainsTime;
        }
        System.out.println(containsTime);

        long endPopulateTime;
        long populateTime = 0;
        for (int i = 0; i < 10000; i++) {
            long startPopulateTime = System.currentTimeMillis();
            arrayList.add(new Integer(100));
            endPopulateTime = System.currentTimeMillis();
            populateTime = endPopulateTime - startPopulateTime;
        }
        System.out.println(populateTime);


        ListIterator<Integer> listIterator;
        long endIteratorAdd;
        long iteratorAddTime = 0;
        for (int i = 0; i < 10000; i++) {
            long startIteratorAddTime = System.currentTimeMillis();
            arrayList.add(r);
            listIterator = arrayList.listIterator();
            while (listIterator.hasNext()) {
                Integer integer = (Integer) listIterator.next();
            }
            endIteratorAdd = System.currentTimeMillis();
            iteratorAddTime = endIteratorAdd - startIteratorAddTime;}
        System.out.println(iteratorAddTime);

        long endIteratorRemove;
        long iteratorRemoveTime=0;
        for (int i = 0; i < 10000; i++) {
            long startIteratorRemoveTime = System.currentTimeMillis();
            arrayList.remove(r);
            listIterator = arrayList.listIterator();
            while (listIterator.hasNext()) {
                Integer integer = (Integer) listIterator.next();
            }
            endIteratorRemove = System.currentTimeMillis();
            iteratorRemoveTime=endIteratorRemove - startIteratorRemoveTime;}
        System.out.println(iteratorRemoveTime);
    }


}





