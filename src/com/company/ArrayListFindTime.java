package com.company;

import java.util.ArrayList;
import java.util.ListIterator;
import java.util.Random;

public class ArrayListFindTime {

    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>(10000);
        Random random = new Random();
        long startTime = System.currentTimeMillis();
        long end = 0;
        long time10000 = 0;
        long averageTime = 0;
        for (int i = 0; i < 10000; i++) {
            Integer r = random.nextInt(10000);
            arrayList.add(r);
            end = System.currentTimeMillis();
            time10000 = end - startTime;
            long time10001 = end - startTime;
            long time10002 = end - startTime;
            long time10003 = end - startTime;
            long time10004 = end - startTime;
            long time10005 = end - startTime;
            averageTime = (time10000 + time10001 + time10002 + time10003 + time10004 + time10005) / 6;

        }
        System.out.println(averageTime + " ms");

        long endGetTime = 0;
        for (int i = 0; i < 10000; i++) {
            arrayList.get(100);
            endGetTime = System.currentTimeMillis();
        }
        System.out.println(endGetTime - startTime + " ms");


        long startRemoveTime = System.currentTimeMillis();
        long endRemoveTime = 0;
        for (int i = 0; i < 10000; i++) {
            Integer r = random.nextInt(10000);
            arrayList.remove(r);
            endRemoveTime = System.currentTimeMillis();
        }
        System.out.println(endRemoveTime - startRemoveTime + " ms");


        long startContainsTime = System.currentTimeMillis();
        long endContainsTime = 0;
        for (int i = 0; i < 10000; i++) {
            Integer r = random.nextInt(10000);
            arrayList.contains(r);
            endContainsTime = System.currentTimeMillis();

        }
        System.out.println(endContainsTime - startContainsTime + " ms");


        long startPopulateTime = System.currentTimeMillis();
        long endPopulateTime = 0;
        for (int i = 0; i < 10000; i++) {
            Integer r = random.nextInt(10000);
            arrayList.add(new Integer(r));
            endPopulateTime = System.currentTimeMillis();

        }
        System.out.println(endPopulateTime - startPopulateTime + " ms");


        long startIteratorAddTime = System.currentTimeMillis();
        ListIterator<Integer> listIterator;
        long endIteratorAdd = 0;
        for (int i = 0; i < 10000; i++) {
            Integer r = random.nextInt(10000);
            arrayList.add(r);
            listIterator = arrayList.listIterator();
            while (listIterator.hasNext()) {
                Integer integer = (Integer) listIterator.next();
            }
            endIteratorAdd = System.currentTimeMillis();
        }
        System.out.println(endIteratorAdd-startIteratorAddTime + " ms");
    }


}
