package org.example;

import java.util.ArrayList;


public class Database {

    private ArrayList<Entry> entrys;

    public Database() {
        entrys = new ArrayList<>();

    }
    public void addEntry(String name, String lastName, int phoneNumber, int age) throws Exception {
        try {

            entrys.add(new Entry(name, lastName, phoneNumber, age));
        }  catch (RuntimeException e){throw new Exception();}
    }

    public ArrayList<Entry> searchEntry(String name,String lastName) {
        ArrayList<Entry> found = new ArrayList<>();
        for (Entry entry : entrys) {
            if ((entry.getName().equals(name)) && (entry.getLastName()).equals(lastName)) {
                found.add(entry);

            }
        }

        return found;
    }
    public void deleteEntry(String name,String lastName){
        ArrayList<Entry> founded = searchEntry(name, lastName);
        for (Entry entry : founded){
            entrys.remove(entry);
        }
    }



    public ArrayList<Entry> searchAllEntry() {
        return entrys;
    }
}


