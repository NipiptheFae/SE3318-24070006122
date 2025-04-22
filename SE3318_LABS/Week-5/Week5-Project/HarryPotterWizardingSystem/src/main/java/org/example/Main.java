package org.example;

import org.example.Student;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Create 3 students
        Student student1 = new Student("Harry Potter", "Gryffindor", 2000);
        Student student2 = new Student("Hermione Granger", "Gryffindor", 2000);
        Student student3 = new Student("Draco Malfoy", "Slytherin", 2000);


        MagicClassroom magicClassroom = new MagicClassroom();


        magicClassroom.addStudent(student1);
        magicClassroom.addStudent(student2);
        magicClassroom.addStudent(student3);


        student1.learnSpell("Expelliarmus");
        student2.learnSpell("Expelliarmus");
        student2.learnSpell("Alohomora");
        student3.learnSpell("Crucio");

        System.out.println(student1.name + " learned Expelliarmus.");
        System.out.println(student2.name + " learned Expelliarmus and Alohomora.");
        System.out.println(student3.name + " learned Crucio.");

        AncientSpellbook ancientSpellbook = new AncientSpellbook();

        List<String> prefixedSpells = ancientSpellbook.getSpellsByPrefix("a");



        Student foundStudent = magicClassroom.findStudent("Hermione Granger");
        if (foundStudent != null) {
            System.out.println(foundStudent.name + " was found in the classroom.");
        } else {
            System.out.println("Student not found.");
        }

        Student spellCaster = magicClassroom.findStudentBySpell("Alohomora");
        if (spellCaster != null) {
            System.out.println(spellCaster.name + " knows Alohomora.");
        } else {
            System.out.println("No student knows Alohomora.");
        }

        System.out.println("\n--- Duel 1 ---");
        Duel.start(student1, student2, "Expelliarmus");
        System.out.println("\n--- Duel 2 ---");
        Duel.start(student1, student3, "Expelliarmus");


        System.out.println("\n--- Wizarding Exam ---");
        List<String> requiredSpells = new ArrayList<>();
        requiredSpells.add("Expelliarmus");
        requiredSpells.add("Alohomora");
        WizardExam wizardExam = new WizardExam(requiredSpells);
        wizardExam.evaluate(student1);

    }
}
