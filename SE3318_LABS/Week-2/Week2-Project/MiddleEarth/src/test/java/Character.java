import java.util.ArrayList;
import java.util.List;

public class Character {
    private String name;
    private Race race;
    private ArrayList<Quest> quests;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Race getRace() {
        return race;
    }

    public void setRace(Race race) {
        this.race = race;
    }

    public ArrayList<Quest> getQuests() {
        return quests;
    }

    public void setQuests(ArrayList<Quest> quests) {
        this.quests = quests;
    }

    public Character(String name, Race race) {
        this.name = name;
        this.race = race;
        quests = new ArrayList<Quest>();
    }
}

interface Joinable{
    public static void joinQuest(Quest quest){}
}

class Mentor extends Character implements Joinable {

    String title;

    public Mentor(String name, Race race, String title) {
        super(name, race);
        this.title = title;
        setQuests(new ArrayList<Quest>());


    }

    public void joinQuest(Quest quest){

        quest.setMentor(this);


        System.out.println(getName() + " has joined the " + quest.getName() + " as Mentor!");
    }


}

class Adventurer extends Character implements Joinable {


    public Adventurer(String name, Race race, List<Quest> quests) {
        super(name, race);
        quests = new ArrayList<Quest>();
    }

    public void joinQuest(Quest quest){
        quest.adventurers.add(this);

        System.out.println(getName() + " has joined the " + quest.getName() + "as Adventurer!");
    }
}
