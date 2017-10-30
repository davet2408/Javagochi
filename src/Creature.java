/**
 * Created by k1763508 on 30/10/17.
 */
public class Creature {
    int energy, fullness, happiness;
    String name;

    public Creature(String name) {
        energy = 15;
        fullness = 15;
        happiness = 15;

        this.name = name;
    }

    public void eat() {
        if (fullness >= 12) {
            System.out.println("Woops, " + this.getName() + " is already full.");
        }
        else {
            fullness += 8;
            happiness -= 6;
            energy -= 4;
            if (fullness > 15) { fullness = 15; }

            System.out.println("Yum, " + this.getName() + " enjoyed that");
        }
    }

    public void sleep() {
        if (energy >= 12) {
            System.out.println("Woops, " + this.getName() + " is not that sleepy.");
        }
        else {
            fullness -= 5;
            happiness -= 5;
            energy += 8;
            if (energy > 15) { energy = 15; }

            System.out.println("Yawn that was a good nap!");
        }
    }

    public void play() {
            fullness -= 4;
            happiness += 8;
            energy -= 6;

            System.out.println("that was fun lets do it again!");

            if (happiness > 15) { }
    }

    public String checkStatus() {
        String status = "";

        if (happiness <= 6 ) {
            status += "OH, " + this.getName() + " is feeling sad!\n";
        }

        if (energy <= 6) {
            status += "Hmm, " + this.getName() + " is really tired!\n";
        }

        if (fullness <= 6) {
            status += "Woops, " + this.getName() + " is super hungry!\n";
        }

        return status;
    }

    public String getName() {
        return name;
    }
}
