package org.example;

import java.util.ArrayList;
import java.util.List;

public class AncientSpellbook {

    private List<String> spells;

    /**
     * Initialization of the spellbook
     * Adds built-in strings into the class's list attribute.
     */
    public AncientSpellbook() {
        spells = new ArrayList<>();
        spells.add("Alohomora");
        spells.add("Expelliarmus");
        spells.add("Lumos");
        spells.add("Wingardium Leviosa");
        spells.add("Expecto Patronum");
        spells.add("Petrificus Totalus");
        spells.add("Accio");
        spells.add("Stupefy");
        spells.add("Crucio");
        spells.add("Avada Kedavra");
    }

    /**
     *
     * @param index to search, requires index to be in the list.
     * @return spells[index]
     * @throws IndexOutOfBoundsException if index is not in the list.
     */
    public String getSpell(int index) {
        if (index >= 0 && index < spells.size()) {
            return spells.get(index);
        } else {
            throw new IndexOutOfBoundsException("Invalid index");
        }
    }

    /**
     *
     * @param prefix to search the list, requires prefix not to be null or empty,
     * @return result, the list of spells starts with the prefix
     * @throws IllegalArgumentException if prefix does not meet the requirements.
     */
    public List<String> getSpellsByPrefix(String prefix) {
        // Preconditions: prefix should not be null or empty
        if (prefix == null || prefix.isEmpty()) {
            throw new IllegalArgumentException("Prefix cannot be null or empty");
        }

        List<String> result = new ArrayList<>();
        for (String spell : spells) {
            if (spell.startsWith(prefix)) {
                result.add(spell);
            }
        }
        return result;
    }
}
