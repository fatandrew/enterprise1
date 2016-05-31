package com.company;

import java.util.Random;

/**
 * Created by User on 30.05.2016.
 */
public class TableOfTime {
    ArrayListFindTime arrayListFindTime = new ArrayListFindTime();

    Object[] headers = {"", "add", "get", "remove", "contains", "populate", "iterator.add", "iterator.remove"};
    Object[][] data = {"arrayList", arrayListFindTime.addTime()  };
}
