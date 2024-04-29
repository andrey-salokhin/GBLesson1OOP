package ru.gb.family_list.family;

import ru.gb.family_list.human.Human;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class FamilyList implements Serializable {

    private final List<Human> list;

    public FamilyList() {
        this.list = new ArrayList<>();
    }

    public void addHuman(Human human) {
        list.add(human);
    }

    public void addHumans(Human... humans) {
        for (Human human : humans) {
            addHuman(human);
        }
    }

    public void showFullList() {
        for (Human human : list) {
            System.out.println(human);
        }
    }

    public void showAllChidsByHuman(Human human) {
        if (this.list.contains(human)) {
            for (Human listed_human : list) {
                if (listed_human.getFather() != null && human.getGender() == Human.Gender.MALE && listed_human.getFather().equals(human)) {
                    System.out.println(listed_human);
                }
                if (listed_human.getMother() != null && human.getGender() == Human.Gender.FEMALE && listed_human.getMother().equals(human)) {
                    System.out.println(listed_human);
                }
            }
        }
    }
}
