package ru.gb.family_list.family;

import ru.gb.family_list.human.Human;

import java.util.Iterator;
import java.util.List;

public class FamilyIterator implements Iterator<Human> {

    private int index;
    private List<Human> familyList;

    FamilyIterator(List<Human> familyList) {
        this.familyList = familyList;
    }

    @Override
    public boolean hasNext() {
        return index < familyList.size();
    }

    @Override
    public Human next() {
        return familyList.get(index++);
    }
}
