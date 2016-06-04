package com.company;

import javax.swing.text.View;
import java.awt.*;
import java.util.Random;
import java.util.SortedSet;
import java.util.TreeSet;

/**
 * Created by User on 30.05.2016.
 */
public class TreeSetFindTime {
    public static void main(String[] args) {
        TreeSet<Integer> treeSet = new TreeSet<Integer>();
        Random random = new Random(10000);

        for (int i = 0; i < 10000; i++) {
treeSet.add(4);
treeSet.add(45);
treeSet.add(46);
treeSet.add(47);
treeSet.add(48);
treeSet.remove(45);
           treeSet.contains(99);

        }
        System.out.println(treeSet);
    }}