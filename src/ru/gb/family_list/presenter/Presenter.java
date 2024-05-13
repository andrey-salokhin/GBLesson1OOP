package ru.gb.family_list.presenter;

import ru.gb.family_list.model.human.Human;
import ru.gb.family_list.model.service.Service;
import ru.gb.family_list.view.View;

import java.util.GregorianCalendar;

public class Presenter {
    private View view;
    private Service service;

    public Presenter(View view) {
        this.view = view;
        service = new Service();
    }

    public void addHuman(String name, String surname, GregorianCalendar dob, Human.Gender gender, Integer mother, Integer father) {
        service.addHuman(name, surname, dob, gender, mother, father);
        getFullList();
    }

    public void getFullList(){
        view.printAnswer(service.getFullList());
    }

    public void sortByAge() {
        service.sortByAge();
        getFullList();
    }

    public void sortByName() {
        service.sortByName();
        getFullList();
    }
}
