package org.example;

import java.util.ArrayList;

public class Student {

    //attributes
    public String name;
    public String house;
    public int year;
    public ArrayList<String> spellsLearned;

    public Student(String name, String house, int year) {
        this.name = name;
        this.house = house;
        this.year = year;
        this.spellsLearned = new ArrayList<>();
    }


    /**
     * add the string to an arraylist of strings,
     * requires spell to be not NULL or already in the arraylist.
     * @param spell string to add into the arraylist.
     * @return boolean to see if it's successful.
     *
     * **/
    public boolean learnSpell(String spell){

        boolean containsSpell = containsSpell(spell);

        if (containsSpell || spell == null){
            throw new IllegalArgumentException("The spell cannot be empty or already learned.");
        }
        else { spellsLearned.add(spell); return true;}





    }

    public boolean containsSpell (String spell){
        return spellsLearned.contains(spell);
    }

}
