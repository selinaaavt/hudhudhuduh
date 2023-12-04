import java.util.Scanner;
public class TheGame {
    private int looks;
    private int happiness;
    private int health;
    private int smarts;
    private String gender;
    private String name;
    private Scanner scan;
    private int age;
    private boolean isGraduated;
    private boolean isInASportsTeam;
    private boolean askedBefore;
    private int bankBalance;
    private int relationshipWitMom;
    private int relationshipWitDad;

    public TheGame(int looks, int happiness, int health, int smarts, String gender, String name) {
        this.looks = looks;
        this.happiness = happiness;
        this.health = health;
        this.smarts = smarts;
        this.gender = gender;
        this.name = name;
        age = 0;
        isGraduated = false;
        isInASportsTeam = false;
        askedBefore = false;
        bankBalance = 0;
        scan = new Scanner(System.in);
        relationshipWitDad = (int) (Math.random()*100 );
        relationshipWitMom = (int) (Math.random()*100 );
    }

    public void start() {
        startingstats();
        ongoing();
    }

    public void startingstats() {
        System.out.println("I was born a " + gender + " in Vatican city. I was a planned pregnancy.");
        System.out.println();
        System.out.println("My name is " + name + ".");
        System.out.println();
        System.out.println("My birthday is Feburary 28th. I am a Pisces.");
        System.out.println();
        System.out.println("[Health: " + health + "%]");
        System.out.println("[Looks: " + looks + "%]");
        System.out.println("[Happiness: " + happiness + "%]");
        System.out.println("[Smarts: " + smarts + "%]");
        System.out.println("[Age: " + age + "]");
        System.out.println("[Bank Balance: $" + bankBalance + "]");
        System.out.println();
    }

    public void ongoing() {
        System.out.print("Would u like to age? ");
        String age = scan.nextLine();
        while (!age.equals("yes")) {
            System.out.println();
            System.out.println("What would you like to check?");
            System.out.println("Enter 1 - relationships");
            System.out.println("Enter 2 - assets");
            System.out.println("Enter 3 - activities");
            int eeee = scan.nextInt();
            scan.nextLine();
            if (eeee == 1) {
                relationships();
            } else if (eeee == 2) {
                assets();
            }
            System.out.println();
            System.out.print("Would u like to age? ");
            age = scan.nextLine();
        }
        age += 1;
        whenAge();
        printOutStats();
    }

    private void whenAge() {
        if (looks <= 40) {
            int randomness = (int) (Math.random() * 50);
            if (randomness > 42) {
                System.out.println("Todays Becky called you ugly in class when you tried to play with her");
                happiness -=8;
                printOutStats();
            } else if (randomness > 39) {
                System.out.print("You were asked out by Becky today in science class. She thought you were cute.");
                String bro = scan.nextLine();
                System.out.println("Ha! She was joking. You went home and cried.");
                happiness -= 15;
                printOutStats();
            }
        }

        if (smarts < 30) {
            int randomness = (int) (Math.random() * 50);
            if (randomness > 42 && !isGraduated) {
                System.out.println("The kid assigned to tutor you got upset with your stupidness. You feel sad.");
                happiness -= 10;
            } else if (randomness > 42 && age < 9 && age > 3) {
                System.out.println("Your mother got into a fight with your dad about who you inherited your smarts from. You weren't quite sure what that meant.");
            }
        }

        int randomness = (int) (Math.random() * 50);
        if (randomness > 32 && health > 75 && !askedBefore) {
            System.out.print("You found out about the different teams in your school! Would you like to join one? ");
            String ss = scan.nextLine();
            if (ss.equals("yes")) {
                System.out.println("You're in!");
                happiness += 10;
            } else {
                System.out.println("Okay...");
                askedBefore = true;
            }
        }

        if (smarts > 75 && !isGraduated) {
            System.out.println("You got 100 on your test today! Your mother is really proud of you! relationship with mom + 10!");
        }

    }

    private void printOutStats() {
        System.out.println();
        System.out.println("Health: " + health + "%");
        System.out.println("Looks: " + looks + "%");
        System.out.println("Happiness: " + happiness + "%");
        System.out.println("Smarts: " + smarts + "%");
        System.out.println("\ud83d\ude38");
    }

    private void relationships() {
        if (age < 8) {
            System.out.println();
            System.out.println("[relationship with Mom: " + relationshipWitMom + "%]");
            System.out.println("[relationship with Dad: " + relationshipWitDad + "%]");
            System.out.println();
        }
    }

    private void assets() {

    }
}
