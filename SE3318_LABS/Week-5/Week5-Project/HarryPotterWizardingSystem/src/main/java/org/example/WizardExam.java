package org.example;

import java.util.List;

public class WizardExam {

    public List<String> requiredSpells;

    /**
     * Initializing the WizardExam with required spells.
     * @param requiredSpells, List of spells needed for this exam.
     * @throws IllegalArgumentException if the list is empty.
     */
    public WizardExam(List<String> requiredSpells) {
        if (requiredSpells == null || requiredSpells.isEmpty()) {
            throw new IllegalArgumentException("The list of required spells cannot be null or empty.");
        }
        this.requiredSpells = requiredSpells;
    }

    /**
     * Checks if the student knows all the required spells for the exam.
     * @param student The student who is on the exam.
     * @return boolean to see if the student knows all required spells.
     * @throws IllegalArgumentException if the student is null.
     */
    public boolean pass(Student student) {
        if (student == null) {
            throw new IllegalArgumentException("Student cannot be null.");
        }

        for (String spell : requiredSpells) {
            if (!student.containsSpell(spell)) {
                return false;
            }
        }
        return true;
    }

    /**
     * Evaluates the student's performance, using the pass() method.
     * @param student The student who is on the exam.
     * @throws IllegalArgumentException if the student is null.
     */
    public void evaluate(Student student) {
        if (student == null) {
            throw new IllegalArgumentException("Student cannot be null.");
        }

        if (pass(student)) {
            System.out.println(student.name + " has passed the exam!");
        } else {
            System.out.println(student.name + " has failed the exam.");
        }


    }
}
