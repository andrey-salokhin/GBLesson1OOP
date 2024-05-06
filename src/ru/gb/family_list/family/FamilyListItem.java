package ru.gb.family_list.family;

import ru.gb.family_list.human.Human;

public interface FamilyListItem {
    public String getName();
    public int getAge();
    public <E extends FamilyListItem> E getFather();
    public <E extends FamilyListItem> E getMother();
    public Human.Gender getGender();
}
