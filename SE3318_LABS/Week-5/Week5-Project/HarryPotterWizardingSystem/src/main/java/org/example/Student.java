package org.example;

import java.util.ArrayList;

public class Student {

    //attributes
    String name;
    String house;
    int year;
    ArrayList<String> spellsLearned;


    /**
     * add the string to an arraylist of strings,
     * requires spell to be not NULL or already in the arraylist.
     * @param spell string to add into the arraylist.
     * @return boolean to see if it's successful.
     * **/
    public boolean learnSpell(String spell){

        boolean containsSpell = containsSpell(spell); //ASK THIS PART

        if (containsSpell || spell == null){
            return false;
        }
        else { spellsLearned.add(spell); return true;}





    }

    public boolean containsSpell (String spell){
        return spellsLearned.contains(spell);
    }

}
