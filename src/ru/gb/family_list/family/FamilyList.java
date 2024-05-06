package ru.gb.family_list.family;

import ru.gb.family_list.human.Human;
import ru.gb.family_list.human.comparator.HumanComparatorByAge;
import ru.gb.family_list.human.comparator.HumanComparatorByName;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class FamilyList<E extends FamilyListItem> implements Serializable, Iterable<E> {

    private final List<E> list;

    public FamilyList() {
        this.list = new ArrayList<>();
    }

    public void addHuman(E human) {
        list.add(human);
    }

    public void addHumans(E... humans) {
        for (E human : humans) {
            addHuman(human);
        }
    }

    public void showFullList() {
        for (E human : list) {
            System.out.println(human);
        }
    }

    public void showAllChildByHuman(E human) {
        if (this.list.contains(human)) {
            for (E listed_human : list) {
                if (listed_human.getFather() != null && human.getGender() == Human.Gender.MALE && listed_human.getFather().equals(human)) {
                    System.out.println(listed_human);
                }
                if (listed_human.getMother() != null && human.getGender() == Human.Gender.FEMALE && listed_human.getMother().equals(human)) {
                    System.out.println(listed_human);
                }
            }
        }
    }

    public void sortByAge() {
        list.sort(new HumanComparatorByAge<>());
    }

    public void sortByName () {
        list.sort(new HumanComparatorByName<>());
    }

    @Override
    public Iterator<E> iterator() {
        return new FamilyIterator<>(list);
    }
}
