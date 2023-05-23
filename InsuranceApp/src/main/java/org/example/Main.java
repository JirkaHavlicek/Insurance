package org.example;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in, "Windows-1250");
        Diary diary = new Diary();
        String next;
        do {
            diary.writeMainMenu();
            System.out.println();
            System.out.println("Vyberte si akci:");
            System.out.println("1 - Přidat nového pojistného");
            System.out.println("2 - Vypsat všechny pojistné");
            System.out.println("3 - Vyhledat pojistného");
            System.out.println("4 - Vymaž pojistného");
            System.out.println("5 - Konec");
            System.out.println();
            int choice = Integer.parseInt(sc.nextLine());
            switch (choice) {
                case 1:
                    diary.addEntry();
                    break;
                case 2:
                    diary.findAllEntry();
                    break;
                case 3:
                    diary.findEntry();
                    break;
                case 4:
                    diary.deleteEntry();
                    break;
                case 5:
                    break;
                default:
                    System.out.println("Pokračujte stisknutím libovolné klávesi...");
                    break;
            }
            System.out.println("Pokračujte libovolnou klávesou...");
            next =sc.nextLine();
        }while(next.equals(""));

    }
}

