package ru.gb.family_list.model.service;

import ru.gb.family_list.model.family.FamilyList;
import ru.gb.family_list.model.human.Human;

import java.util.GregorianCalendar;

public class Service {
    FamilyList<Human> fl;

    public Service() {
        this.fl = new FamilyList<>();
    }

    public void addHuman(String name, String surname, GregorianCalendar dob, Human.Gender gender, Integer mother, Integer father) {
        Human hm = new Human(name, surname, dob, gender, fl.getHumanByIndex(mother), fl.getHumanByIndex(father));
        fl.addHuman(hm);
    }

    public String getFullList() {
        return fl.getFullList();
    }

    public void sortByAge() {
        fl.sortByAge();
    }

    public void sortByName() {
        fl.sortByName();
    }
}
