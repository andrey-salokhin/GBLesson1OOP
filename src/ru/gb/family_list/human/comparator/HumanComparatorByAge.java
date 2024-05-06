package ru.gb.family_list.human.comparator;

import ru.gb.family_list.family.FamilyListItem;
import java.util.Comparator;

public class HumanComparatorByAge<E extends FamilyListItem> implements Comparator<E> {
    @Override
    public int compare(E o1, E o2) {
        return o1.getAge() - o2.getAge();
    }
}
