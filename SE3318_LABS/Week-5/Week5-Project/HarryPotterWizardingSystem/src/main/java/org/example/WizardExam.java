package org.example;

import java.util.List;

public class WizardExam {

    // List to store the required spells for this exam
    private List<String> requiredSpells;

    /**
     * Constructor to initialize the WizardExam with required spells.
     *
     * @param requiredSpells List of spells required for this exam.
     */
    public WizardExam(List<String> requiredSpells) {
        if (requiredSpells == null || requiredSpells.isEmpty()) {
            throw new IllegalArgumentException("The list of required spells cannot be null or empty.");
        }
        this.requiredSpells = requiredSpells;
    }

    /**
     * Checks if the student knows all the required spells for the exam.
     *
     * @param student The student who is attempting the exam.
     * @return true if the student knows all required spells, false otherwise.
     */
    public boolean pass(Student student) {
        if (student == null) {
            throw new IllegalArgumentException("Student cannot be null.");
        }

        // Check if the student knows all the required spells
        for (String spell : requiredSpells) {
            if (!student.containsSpell(spell)) {
                return false; // The student failed if they don't know this spell
            }
        }
        return true; // The student passes if they know all the required spells
    }

    /**
     * Evaluates the student's performance based on whether they passed the exam.
     *
     * @param student The student who is being evaluated.
     */
    public void evaluate(Student student) {
        if (student == null) {
            throw new IllegalArgumentException("Student cannot be null.");
        }

        // Evaluate if the student passes or fails
        if (pass(student)) {
            System.out.println(student.name + " has passed the exam!");
        } else {
            System.out.println(student.name + " has failed the exam.");
        }
    }
}
