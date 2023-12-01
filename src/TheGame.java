import java.util.Scanner;
public class TheGame {
    private int looks;
    private int happiness;
    private int health;
    private int smarts;
    private String gender;
    private String name;
    private Scanner scan;
    public TheGame(int looks, int happiness, int health, int smarts, String gender, String name) {
        this.looks = looks;
        this.happiness = happiness;
        this.health = health;
        this.smarts = smarts;
        this.gender = gender;
        this.name = name;
        scan = new Scanner(System.in);
    }
    public void start() {
        startingstats();
    }
    public void startingstats() {
        System.out.println("Today " + name + " was born in a hospital as a " + gender + " with ");
        System.out.println("Health: " + health + "%");
        System.out.println("Looks: " + looks + "%");
        System.out.println("Happiness: " + happiness + "%");
        System.out.println("Smarts: " + smarts + "%");
    }

    public void ongoing() {
        if (looks <= 20) {
            System.out.println("Todays Becky called you ugly in class when you tried to play with her;");
        }
        System.out.print("Would u like to age? ");
    }
}
