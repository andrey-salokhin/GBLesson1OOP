package ru.gb.family_list.human.comparator;

import java.util.Comparator;
import ru.gb.family_list.family.FamilyListItem;

public class HumanComparatorByName<E extends FamilyListItem> implements Comparator<E> {
    @Override
    public int compare(E o1, E o2) {
        return o1.getName().compareTo(o2.getName());
    }
}
