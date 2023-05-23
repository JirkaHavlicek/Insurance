package org.example;

import java.util.ArrayList;
import java.util.Scanner;

public class Diary {

    private final Database database;

    private final Scanner sc = new Scanner(System.in, "Windows-1250");

    public Diary() {
        database = new Database();
    }

    public void findAllEntry() {
        ArrayList<Entry> entrys = database.searchAllEntry();
        if (entrys.size() == 0) {
            System.out.println("V evidenci nejsou žádní pojištění.");
        } else {
            System.out.println("Seznam pojištěných:");
            for (Entry entry : entrys) {
                System.out.println(entry);
            }
        }
    }



    public void addEntry() {
        System.out.println("Zadejte jméno pojistného");
        String name = sc.nextLine();
        System.out.println("Zadejte příjmení");
        String lastName = sc.nextLine();
        System.out.println("Zadejte telefoní číslo");
        int phoneNumber = 0;
        try {
            phoneNumber = Integer.parseInt(sc.nextLine());
        }
        catch (RuntimeException e){}
        System.out.println("Zadejte věk");
        int age = 0;
        try {
            age = Integer.parseInt(sc.nextLine());
        }
        catch (RuntimeException e){}
        try {
            database.addEntry(name, lastName, phoneNumber, age);

        }catch(Exception e){
            System.out.println("zadali jste špatné číslo");
        }
        System.out.println("Pojištěný " + name + " " + lastName + " byl úspěšně přidán.");
    }



    public void findEntry() {
        System.out.println("Zadej jméno pojištěného: ");
        String name = sc.nextLine();
        System.out.println("Zadej příjmení pojištěného: ");
        String lastName = sc.nextLine();
        ArrayList<Entry> entrys = database.searchEntry(name, lastName);
        if (entrys.size() > 0) {
            System.out.println("Nalezen tento záznam");
            for (Entry entry : entrys){
                System.out.println(entry);

            }
        }
        else {
            System.out.println("Pojištěný s jménem " + name + " " + lastName + " nebyl nalezen.");
        }
    }
    public void deleteEntry() {
        System.out.println("Zadej jméno pojištěného: ");
        String name = sc.nextLine();
        System.out.println("Zadej příjmení pojištěného: ");
        String lastName = sc.nextLine();
        database.deleteEntry(name, lastName);
        System.out.println("Pojištěný " + name + " " + lastName + " byl vymazán.");

    }
    public void writeMainMenu() {
        System.out.println();
        System.out.println("------------------------\n  Evidence pojištěných \n------------------------");
        System.out.println();
    }
}