package com.company;

import java.util.HashSet;
import java.util.Random;

/**
 * Created by User on 30.05.2016.
 */
public class HashSetFindTime {
    public static void main(String[] args) {

        HashSet<Integer> integers = new HashSet<>();
        Random random = new Random();

        long endAddTime = 0;
        long startAddTime = 0;
        for (int i = 0; i < 10000; i++) {
            startAddTime = System.currentTimeMillis();

            Integer a = random.nextInt(1000);
            integers.add(a);

            endAddTime = System.currentTimeMillis();

        }
        System.out.println(endAddTime - startAddTime + " ms");
        System.out.println(integers);

        long endRemoveTime = 0;
        long startRemoveTime = 0;
        for (int i = 0; i < 10000; i++) {
            startRemoveTime = System.currentTimeMillis();

            Integer re = random.nextInt(111);
            integers.add(re);
            Integer r = random.nextInt(111);

            integers.remove(r);
            endRemoveTime = System.currentTimeMillis();

        }
        System.out.println(endRemoveTime - startRemoveTime + " ms");
        System.out.println(integers);

        long endContainsTime = 0;
        long startContainsTime = 0;
        for (int i = 0; i < 10000; i++) {

            startContainsTime = System.currentTimeMillis();
            Integer r = random.nextInt(10000);
            integers.contains(r);


            endContainsTime = System.currentTimeMillis();
        }
        System.out.println(endContainsTime - startContainsTime + " ms");
    }}