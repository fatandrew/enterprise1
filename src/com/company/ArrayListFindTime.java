package com.company;

import java.util.ArrayList;
import java.util.ListIterator;
import java.util.Random;

public class ArrayListFindTime {

    public static long addTime(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>(10000);
        Random random = new Random();
        Integer r = random.nextInt(10000);

        long startTime = System.currentTimeMillis();
        long end;
        long time10000;
        long averageTimeAdd = 0;
        for (int i = 0; i < 10000; i++) {
            arrayList.add(r);
            end = System.currentTimeMillis();
            time10000 = end - startTime;
            long time10001 = end - startTime;
            long time10002 = end - startTime;
            long time10003 = end - startTime;
            long time10004 = end - startTime;
            long time10005 = end - startTime;
            averageTimeAdd = (time10000 + time10001 + time10002 + time10003 + time10004 + time10005) / 6;

        }
        return averageTimeAdd;
    }
    public static long getTime(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>(10000);
        Random random = new Random();
        Integer r = random.nextInt(10000);
        long startTime1 = System.currentTimeMillis();
        long endGetTime;
        long averageTimeGet = 0;
        for (int i = 0; i < 10000; i++) {
            arrayList.get(100);
            endGetTime = System.currentTimeMillis();
            averageTimeGet = endGetTime - startTime1;
        }
    return averageTimeGet;
    }
    public static long removeTime(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>(10000);
        Random random = new Random();
        Integer r = random.nextInt(10000);
        long startRemoveTime = System.currentTimeMillis();
        long endRemoveTime;
        long removeTime = 0;
        for (int i = 0; i < 10000; i++) {
            arrayList.remove(r);
            endRemoveTime = System.currentTimeMillis();
            removeTime = endRemoveTime - startRemoveTime;
        }
return removeTime;
    }

    public static long containsTime(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>(10000);
        Random random = new Random();
        Integer r = random.nextInt(10000);
        long startContainsTime = System.currentTimeMillis();
        long endContainsTime;
        long containsTime = 0;
        for (int i = 0; i < 10000; i++) {
            arrayList.contains(r);
            endContainsTime = System.currentTimeMillis();
            containsTime = endContainsTime - startContainsTime;
        }
return containsTime;
    }

    public static long populate(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>(10000);
        Random random = new Random();
        Integer r = random.nextInt(10000);
        long startPopulateTime = System.currentTimeMillis();
        long endPopulateTime;
        long populateTime = 0;
        for (int i = 0; i < 10000; i++) {
            arrayList.add(new Integer(r));
            endPopulateTime = System.currentTimeMillis();
            populateTime = endPopulateTime - startPopulateTime;
        }
return populateTime;
    }
    public static long iteratorAdd(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>(10000);
        Random random = new Random();
        Integer r = random.nextInt(10000);
        long startIteratorAddTime = System.currentTimeMillis();
        ListIterator<Integer> listIterator;
        long endIteratorAdd;
        long iteratorAddTime = 0;
        for (int i = 0; i < 10000; i++) {
            arrayList.add(r);
            listIterator = arrayList.listIterator();
            while (listIterator.hasNext()) {
                Integer integer = (Integer) listIterator.next();
            }
            endIteratorAdd = System.currentTimeMillis();
            iteratorAddTime = endIteratorAdd - startIteratorAddTime;
        }
return iteratorAddTime;
    }

    public static long iteratorRemove(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>(10000);
        Random random = new Random();
        Integer r = random.nextInt(10000);
        ListIterator<Integer> listIterator;
        long startIteratorRemoveTime = System.currentTimeMillis();
        long endIteratorRemove;
        long iteratorRemoveTime=0;
        for (int i = 0; i < 10000; i++) {
            arrayList.remove(r);
            listIterator = arrayList.listIterator();
            while (listIterator.hasNext()) {
                Integer integer = (Integer) listIterator.next();
            }
            endIteratorRemove = System.currentTimeMillis();
             iteratorRemoveTime=endIteratorRemove - startIteratorRemoveTime;
        }
return iteratorRemoveTime;

    }


}
