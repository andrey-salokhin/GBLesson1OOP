package ru.gb.family_list.view;

import ru.gb.family_list.model.human.Human;
import ru.gb.family_list.presenter.Presenter;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class ConsoleUi implements View{

   private Scanner scanner;
   private Presenter presenter;
   private boolean status;

    public ConsoleUi() {
            scanner = new Scanner(System.in);
            presenter = new Presenter(this);
            status = true;
    }

    @Override
    public void start() {
        while (status) {
            System.out.println("1. Add student");
            System.out.println("2. Get full family list");
            System.out.println("3. Sort by name");
            System.out.println("4. Sort by age");
            System.out.println("5. Exit");
            String line = scanner.nextLine();
            switch (line) {
                case "1":
                    addHuman();
                    break;
                case "2":
                    getFullList();
                    break;
                case "3":
                    sortByName();
                    break;
                case "4":
                    sortByAge();
                    break;
                case "5":
                    finish();
                    break;
                default:
                    System.out.println("Incorrect value!");
            }
        }
    }

    private void sortByAge() {
        presenter.sortByAge();
    }

    private void sortByName() {
        presenter.sortByName();
    }

    private void getFullList() {
        presenter.getFullList();
    }

    private void addHuman() {
        System.out.println("Print name");
        String name = scanner.nextLine();
        System.out.println("Print surname");
        String surname = scanner.nextLine();
        System.out.println("Print day of birth");
        String daydob = scanner.nextLine();
        System.out.println("Print month of birth");
        String monthdob = scanner.nextLine();
        System.out.println("Print year of birth");
        String yeardob = scanner.nextLine();
        GregorianCalendar dob = new GregorianCalendar(Integer.parseInt(yeardob), Integer.parseInt(monthdob) - 1, Integer.parseInt(daydob));
        System.out.println("Print human gender 1 - MALE; 2-FEMALE; You can left this field empty");
        Human.Gender gender = convertGender(scanner.nextLine());
        System.out.println("Print index of mother (You can leave this field empty)");
        String momIndex = scanner.nextLine();
        System.out.println("Print index of father (You can leave this field empty)");
        String dadIndex = scanner.nextLine();
        presenter.addHuman(name, surname, dob, gender, !momIndex.isEmpty() ? Integer.parseInt(momIndex) : null, !dadIndex.isEmpty() ? Integer.parseInt(dadIndex) : null);
    }

    private void finish(){
        status = false;
        System.out.println("Goodbye!");
    }

    private Human.Gender convertGender(String string) {
        return switch (string) {
            case "1" -> Human.Gender.MALE;
            case "2" -> Human.Gender.FEMALE;
            default -> null;
        };
    }

    @Override
    public void printAnswer(String text) {
        System.out.println(text);
    }
}
