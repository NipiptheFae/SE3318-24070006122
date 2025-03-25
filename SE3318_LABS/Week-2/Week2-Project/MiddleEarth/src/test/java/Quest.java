import java.util.List;

public class Quest {

    private String name;
    private int difficultyLevel;
    private Mentor mentor;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDifficultyLevel() {
        return difficultyLevel;
    }

    public void setDifficultyLevel(int difficultyLevel) {
        this.difficultyLevel = difficultyLevel;
    }

    public Mentor getMentor() {
        return mentor;
    }

    public void setMentor(Mentor mentor) {
        this.mentor = mentor;
    }

    public List<Adventurer> getAdventurers() {
        return adventurers;
    }

    public void setAdventurers(List<Adventurer> adventurers) {
        this.adventurers = adventurers;
    }

    List<Adventurer> adventurers;

    public Quest(String name, int difficultyLevel, List<Adventurer> adventurers) {
        this.name = name;
        this.difficultyLevel = difficultyLevel;
        this.adventurers = adventurers;
    }


}