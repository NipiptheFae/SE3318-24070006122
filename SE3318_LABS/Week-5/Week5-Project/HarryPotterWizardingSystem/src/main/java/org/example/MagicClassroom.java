package org.example;

import com.sun.nio.sctp.IllegalReceiveException;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class MagicClassroom {

    private List<Student> students;

    /**
     * Instantiates the MagicClassroom
     */
    public MagicClassroom() {
        students = new ArrayList<>();
    }

    /**
     * Adds a student to the classroom, requires student not to be null.
     * @param student the student to add to the list.
     * @return boolean if the student is added successfully.
     */
    public boolean addStudent(Student student) {
        if (student == null) {
            return false;
        }
        students.add(student);
        return true;
    }

    /**
     * Finds a student with their name.
     * @param name the name of the student.
     * @return student, student with the given name or null if no student is found.
     */
    public Student findStudent(String name) {
        for (Student student : students) {
            if (student.name.equals(name)) {
                return student;
            }
        }
        return null;
    }

    /**
     * Finds the first student that knows that specific spell.
     * @param spell to search for.
     * @return student, the first student who knows the spell or null if no student knows it.
     */
    public Student findStudentBySpell(String spell) {
        for (Student student : students) {
            if (student.containsSpell(spell)) {
                return student;
            }
        }
        return null;
    }

    /**
     * Returns all students who belong to that specific house.
     * @param house to filter students.
     * @return houseStudents, list of students in that specified house.
     */
    public List<Student> getStudentsByHouse(String house) {
        List<Student> houseStudents = new ArrayList<>();
        for (Student student : students) {
            if (student.house.equals(house)) {
                houseStudents.add(student);
            }
        }
        return houseStudents;
    }

    /**
     * Retrieves all students, sorted by their house.
     * @return a list of students sorted by house.
     */
    public List<Student> getStudentsSortedByHouse() {
        return students.stream()
                .sorted((s1, s2) -> s1.house.compareTo(s2.house))
                .collect(Collectors.toList());
    }
}
