package ru.gb.family_list;

import ru.gb.family_list.family.FamilyList;
import ru.gb.family_list.human.Human;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Main {
    public static void main(String[] args) {

        Human mgf = new Human("GrandFather", "gf", new GregorianCalendar(1925, Calendar.MARCH, 12), Human.Gender.MALE);
        mgf.setDod(new GregorianCalendar(2004, Calendar.DECEMBER, 1));
        Human mgm = new Human("GrandMother", "gm", new GregorianCalendar(1935, Calendar.JULY, 11), Human.Gender.FEMALE);
        Human fgf = new Human("GrandFather2", "gf2", new GregorianCalendar(1948, Calendar.JUNE, 24), Human.Gender.MALE);
        Human fgm = new Human("GrandMother2", "gm2", new GregorianCalendar(1946, Calendar.OCTOBER, 8), Human.Gender.FEMALE);
        Human m = new Human("Mother", "Human1Surname", new GregorianCalendar(1984, Calendar.FEBRUARY, 14), Human.Gender.FEMALE, mgm, mgf);
        Human f = new Human("Father", "Human1Surname", new GregorianCalendar(1990, Calendar.FEBRUARY, 23), Human.Gender.MALE, fgm, fgf);
        Human me = new Human("Me", "Human1Surname", new GregorianCalendar(2014, Calendar.JANUARY, 8), Human.Gender.MALE, m, f);
        Human br = new Human("Br", "Human1Surname", new GregorianCalendar(2016, Calendar.NOVEMBER, 21), Human.Gender.MALE, m, f);
        Human sis = new Human("Sis", "Human1Surname", new GregorianCalendar(2020, Calendar.APRIL, 3), Human.Gender.FEMALE, m, f);

        FamilyList fl = new FamilyList();

        fl.addHumans(mgf, mgm, fgf, fgm, m, f, me, br, sis);
        fl.showFullList();

        System.out.println("\n");

        fl.showAllChidsByHuman(m);
    }
}
