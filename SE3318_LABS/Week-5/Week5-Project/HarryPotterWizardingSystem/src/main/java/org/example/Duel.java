package org.example;

import org.example.Student;

import java.util.Random;

public class Duel {

    /**
     * Starts a duel between two Hogwarts students.
     *
     * @param s1   The first Hogwarts student.
     * @param s2   The second Hogwarts student.
     * @param spell The spell to be used in the duel.
     */
    public static void start(Student s1, Student s2, String spell) {
        if (s1 == null || s2 == null || spell == null || spell.trim().isEmpty()) {
            throw new IllegalArgumentException("Students and spell cannot be null or empty.");
        }


        boolean knowsSpellS1 = s1.containsSpell(spell);
        boolean knowsSpellS2 = s2.containsSpell(spell);

        if (!knowsSpellS1 && !knowsSpellS2) {
            System.out.println("It's a draw! Neither student knows the spell.");
        } else if (knowsSpellS1 && !knowsSpellS2) {
            System.out.println(s1.name + " wins! " + s2.name + " doesn't know the spell.");
        } else if (!knowsSpellS1 && knowsSpellS2) {
            System.out.println(s2.name + " wins! " + s1.name + " doesn't know the spell.");
        } else {
            Random random = new Random();
            int strengthS1 = random.nextInt(100);
            int strengthS2 = random.nextInt(100);

            System.out.println("Both students know the spell.");

            if (strengthS1 > strengthS2) {
                System.out.println(s1.name + " wins with greater magic strength!");
            } else if (strengthS1 < strengthS2) {
                System.out.println(s2.name + " wins with greater magic strength!");
            } else {
                System.out.println("It's a draw! Both students have equal magic strength.");
            }
        }
    }
}
