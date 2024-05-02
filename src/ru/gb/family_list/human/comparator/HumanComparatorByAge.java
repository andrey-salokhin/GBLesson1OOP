package ru.gb.family_list.human.comparator;

import ru.gb.family_list.human.Human;

import java.util.Comparator;

public class HumanComparatorByAge implements Comparator<Human> {
    @Override
    public int compare(Human o1, Human o2) {
        int test = o1.getAge();
        int test2 = o2.getAge();
        return o1.getAge() - o2.getAge();
    }
}
