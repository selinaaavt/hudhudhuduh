import java.util.Scanner;
public class TheGame {
    private int looks;
    private int happiness;
    private int health;
    private int smarts;
    private String gender;
    private String name;
    private Scanner scan;
    private int ageOfMe;
    private boolean isGraduated;
    private boolean isInASportsTeam;
    private boolean askedBefore;
    private int bankBalance;
    private int relationshipWitMom;
    private int relationshipWitDad;
    private String RESET;
    private String RED;
    private String GREEN;
    private String YELLOW;
    private String PURPLE;
    private String BLUE;
    private String answer;
    private boolean isDead;
    private String name1;
    private int ageOfSigOther;
    private boolean isMomAlive;
    private boolean isDadAlive;
    private boolean taken;
    private int relationshipRomantic;
    private boolean happened;
    private int craziness;
    private boolean ifOwnAHouse;
    public TheGame(int looks, int happiness, int health, int smarts, String gender, String name) {
        this.looks = looks;
        this.happiness = happiness;
        this.health = health;
        this.smarts = smarts;
        this.gender = gender;
        this.name = name;
        ageOfMe = 0;
        isGraduated = false;
        isInASportsTeam = false;
        askedBefore = false;
        bankBalance = 0;
        scan = new Scanner(System.in);
        relationshipWitDad = (int) (Math.random()*100 );
        relationshipWitMom = (int) (Math.random()*100 );
        taken = false;
        relationshipRomantic = 0;
        happened= false;
        craziness = 0;
        name1 = "";
        ageOfSigOther = 0;
        isMomAlive = true;
        isDadAlive = true;
        isDead = false;
        answer = "";
        RESET = "\u001B[0m";
        RED = "\u001B[31m";
        GREEN = "\u001B[32m";
        YELLOW = "\u001B[33m";
        PURPLE = "\u001B[35m";
        BLUE = "\u001B[34m";
        ifOwnAHouse = false;
    }
    public TheGame() {
        looks = (int) (Math.random()*100 );
        happiness = (int) (Math.random()*100 );
        health = (int) (Math.random()*100 );
        smarts = (int) (Math.random()*100 );
        gender = "female";
        name = "Selina Wang";
        ageOfMe = 0;
        isGraduated = false;
        isInASportsTeam = false;
        askedBefore = false;
        bankBalance = 0;
        scan = new Scanner(System.in);
        relationshipWitDad = (int) (Math.random()*100 );
        relationshipWitMom = (int) (Math.random()*100 );
        taken = false;
        relationshipRomantic = 0;
        happened= false;
        craziness = 0;
        name1 = "";
        ageOfSigOther = 0;
        isMomAlive = true;
        isDadAlive = true;
        isDead = false;
        answer = "";
        RESET = "\u001B[0m";
        RED = "\u001B[31m";
        GREEN = "\u001B[32m";
        YELLOW = "\u001B[33m";
        PURPLE = "\u001B[35m";
        BLUE = "\u001B[34m";
        ifOwnAHouse = false;
    }
    public void start() {
        System.out.print("Welcome to ");
        System.out.println(RED + "\uD835\uDCA2\uD835\uDC3C\uD835\uDCAF\uD835\uDC3F\uD835\uDCB4\uD835\uDC39\uD835\uDC38" + RESET);
        System.out.print("Begin? ");
        answer = scan.nextLine();
        if (answer.equals("yes")) {
            System.out.println();
            startingstats();
            while (!isDead) {
                System.out.print("Age? If not, you have other options! ");
                String age = scan.nextLine();
                System.out.println();
                while (!age.equals("yes")) {
                    System.out.println();
                    System.out.println(RED + "Enter 1 - relationships" + RESET);
                    System.out.println(YELLOW + "Enter 2 - assets" + RESET);
                    System.out.println(BLUE  + "Enter 3 - activities" + RESET);
                    System.out.print("What would you like to check? ");
                    int eeee = scan.nextInt();
                    scan.nextLine();
                    if (eeee == 1) {
                        relationships();
                        scan.nextLine();
                    } else if (eeee == 2) {
                        if(ifOwnAHouse) {
                            assets(ifOwnAHouse);
                        }
                        assets();
                        scan.nextLine();
                    } else if (eeee == 3){
                        activities();
                        scan.nextLine();
                    }
                    System.out.print("Age? If not, you have other options! ");
                    age =  scan.nextLine();
                }
                ageOfMe += 4;
                whenAge();
                printOutStats();
            }
        } else {
            System.out.println("Okay see ya");
        }
    }
    public void startingstats() {
            System.out.println("I was born a " + gender + " in Vatican city. I was a planned pregnancy.");
            System.out.println();
            System.out.println("My name is " + name + ".");
            System.out.println();
            System.out.println("My birthday is Feburary 28th. I am a Pisces.");
            System.out.println();
            System.out.println( RED + "[Health: " + health + "%] ");
            if (health <= 10) {
                System.out.println("█▒▒▒▒▒▒▒▒▒ ☠\uFE0F");
            } else if (health <= 20) {
                System.out.println("██▒▒▒▒▒▒▒▒ \uD83E\uDD2E");
            } else if (health <= 30) {
                System.out.println("███▒▒▒▒▒▒▒ \uD83E\uDD12");
            } else if (health <= 40) {
                System.out.println("████▒▒▒▒▒▒ \uD83D\uDE37");
            } else if (health <= 50) {
                System.out.println("█████▒▒▒▒▒ \uD83E\uDD27");
            } else if (health <= 60) {
                System.out.println("██████▒▒▒▒ \uD83D\uDE23");
            } else if (health <= 70) {
                System.out.println("███████▒▒▒");
            } else if (health <= 80){
                System.out.println("████████▒▒");
            } else if (health <= 93 ) {
                System.out.println("█████████▒ \uD83C\uDFCB\uFE0F");
            } else {
                System.out.println("██████████ \uD83D\uDCAA");
            }
            System.out.println( PURPLE + "[Looks: " + looks + "%] ");
        if (looks <= 10) {
            System.out.println("█▒▒▒▒▒▒▒▒▒");
        } else if (looks <= 20) {
            System.out.println("██▒▒▒▒▒▒▒▒");
        } else if (looks <= 30) {
            System.out.println("███▒▒▒▒▒▒▒");
        } else if (looks <= 40) {
            System.out.println("████▒▒▒▒▒▒");
        } else if (looks <= 50) {
            System.out.println("█████▒▒▒▒▒");
        } else if (looks <= 60) {
            System.out.println("██████▒▒▒▒ ❤\uFE0F\u200D\uD83D\uDD25");
        } else if (looks <= 70) {
            System.out.println("███████▒▒▒ ❤\uFE0F\u200D\uD83D\uDD25");
        } else if (looks <= 80){
            System.out.println("████████▒▒ ❤\uFE0F\u200D\uD83D\uDD25");
        } else if (looks <= 93 ) {
            System.out.println("█████████▒ \uD83D\uDC8B");
        } else {
            System.out.println("██████████ \uD83D\uDC8B");
        }
            System.out.println(YELLOW + "[Happiness: " + happiness + "%] ");
        if (happiness <= 10) {
            System.out.println("█▒▒▒▒▒▒▒▒▒ \uD83D\uDE30");
        } else if (happiness <= 20) {
            System.out.println("██▒▒▒▒▒▒▒▒ \uD83D\uDE22");
        } else if (happiness <= 30) {
            System.out.println("███▒▒▒▒▒▒▒ \uD83E\uDD72");
        } else if (happiness <= 40) {
            System.out.println("████▒▒▒▒▒▒ \uD83D\uDE14");
        } else if (happiness <= 50) {
            System.out.println("█████▒▒▒▒▒ \uD83D\uDE12");
        } else if (happiness <= 60) {
            System.out.println("██████▒▒▒▒ \uD83E\uDD71");
        } else if (happiness <= 70) {
            System.out.println("███████▒▒▒ \uD83D\uDE42");
        } else if (happiness <= 80){
            System.out.println("████████▒▒ \uD83D\uDE19");
        } else if (happiness <= 93 ) {
            System.out.println("█████████▒ \uD83D\uDE19");
        } else {
            System.out.println("██████████ \uD83D\uDE19");
        }
            System.out.println(GREEN + "[Smarts: " + smarts + "%] ");
        if (smarts <= 10) {
            System.out.println("█▒▒▒▒▒▒▒▒▒ \uD83E\uDD14");
        } else if (smarts <= 20) {
            System.out.println("██▒▒▒▒▒▒▒▒ \uD83E\uDD14");
        } else if (smarts <= 30) {
            System.out.println("███▒▒▒▒▒▒▒ \uD83E\uDD14");
        } else if (smarts <= 40) {
            System.out.println("████▒▒▒▒▒▒ \uD83E\uDD14");
        } else if (smarts <= 50) {
            System.out.println("█████▒▒▒▒▒ \uD83E\uDDE0");
        } else if (smarts <= 60) {
            System.out.println("██████▒▒▒▒ \uD83E\uDDE0");
        } else if (smarts <= 70) {
            System.out.println("███████▒▒▒ \uD83E\uDDE0");
        } else if (smarts <= 80){
            System.out.println("████████▒▒ \uD83E\uDD13");
        } else if (smarts <= 93 ) {
            System.out.println("█████████▒ \uD83E\uDD13");
        } else {
            System.out.println("██████████ \uD83E\uDD13");
        }
            System.out.println();
            System.out.println(RESET + "[Age: " + ageOfMe + "]");
            System.out.println("[Bank Balance: $" + bankBalance + "] ");
            System.out.println();
    }
    private void whenAge() {
        if (ageOfMe > 18) {
            isGraduated = true;
        }
        if (looks <= 40 && !happened) {
            int randomness = (int) (Math.random() * 50);
            if (randomness > 42) {
                System.out.println(BLUE + "Today in class, Becky called you ugly when you tried to play with her. happiness - 20");
                System.out.println();
                happiness -=20;
            } else if (randomness > 39) {
                System.out.print("You were asked out by Becky today in science class. She thought you were cute. ");
                System.out.println( RED + "[Looks: 87%] ");
                System.out.println("█████████▒");
                System.out.print("Say yes? " + RESET);
                String bro = scan.nextLine();
                if (bro.equals("yes")) {
                    System.out.println("Ha! She was joking. You went home and cried. Happiness - 20");
                    happiness -= 20;
                    System.out.println();
                }
            }
            happened = true;
        }
        if (smarts < 35) {
            int randomness = (int) (Math.random() * 50);
            if (randomness > 40 && !isGraduated) {
                System.out.println("The kid assigned to tutor you got upset with your stupidness. You feel sad. - 15 happiness");
                System.out.println();
                happiness -= 15;
            } else if (randomness > 32 && ageOfMe < 9 && ageOfMe > 3) {
                System.out.println("Your mother got into a fight with your dad about who you inherited your smarts from. You weren't quite sure what that meant.");
                System.out.println();
            }
        }
        int randomness = (int) (Math.random() * 50);
        if (randomness > 15 && health > 60 && !askedBefore) {
            System.out.print("You found out about the different teams in your school! Would you like to join one? ");
            String ss = scan.nextLine();
            if (ss.equals("yes")) {
                System.out.println("You're in! +15 happiness");
                happiness += 15;
            } else {
                System.out.println("Okay...");
            }
            askedBefore = true;
        }
        if (smarts > 70 && !isGraduated) {
            int randomGenerator = (int) (Math.random() * 50);
            if (randomGenerator > 40) {
                System.out.println(GREEN + "\uD83D\uDE0A You got 100 on your test today! Your mother is really proud of you! relationship with mom + 10!");
                relationshipWitMom+= 10;
                System.out.println();
            } else if (randomGenerator > 33) {
                System.out.println("Your neighbor Steven wants you to tutor him for math? Will you accept?");
                answer = scan.nextLine();
                System.out.println("Steven now considers you to be his good friend. Happiness + 10");
                happiness+=10;
            }
        }
        if (happiness > 100) {
            happiness = 100;
        }
        if (happiness < 0) {
            happiness = 0;
        }
        if (smarts > 100) {
            smarts = 100;
        }
        if (smarts < 0) {
            smarts = 0;
        }
        if (health > 100) {
            health = 100;
        }
        if (health < 0) {
            health = 0;
        }
        if (looks > 100) {
            looks = 100;
        }
        if (looks < 0) {
            looks = 0;
        }
        if (relationshipRomantic > 100) {
            relationshipRomantic = 100;
        }
        if (relationshipRomantic < 0) {
            relationshipRomantic = 0;
        }
        if (relationshipWitDad > 100) {
            relationshipWitDad = 100;
        }
        if (relationshipWitDad < 0) {
            relationshipWitDad = 0;
        }
        if (relationshipWitMom > 100) {
            relationshipWitMom = 100;
        }
        if (relationshipWitMom < 0) {
            relationshipWitMom = 0;
        }
        if (relationshipWitMom < 5) {
            System.out.println(BLUE + "Your mother disowned you and you felt incredibly sad. - 40 happiness" + RESET);
        }
        if (relationshipWitDad < 5) {
            System.out.println(BLUE + "Your father left you to get milk. - 50 happiness" + RESET);
        }
        if (happiness < 15 && happiness > 5) {
            System.out.println();
            System.out.println(BLUE + "Starting to feel depressed... (probably should go see a doctor) " + RESET );
        }
        if (happiness < 4 ) {
            for (int i = 0; i < 3 ; i++) {
                System.out.println(BLUE + "Today felt extremely long and sad... You were out of it... You start seeing things and hearing thoughts telling you to something...");
                System.out.println("Listen?" + RESET);
                answer = scan.nextLine();
            }
            isDead= true;
        }
        if (craziness > 68 && taken) {
            System.out.println(name1 + " saw you dancing with another girl." + name1 + " fought with you. She might get crazier! - 20 health");
            health -= 20;
        }
        if(taken) {
            int random2 = (int) (Math.random() * 50);
            System.out.println(name1 + " complimented you today.. + 10 happiness");
            happiness +=10;
        }
        if (relationshipRomantic < 20 && taken) {
            System.out.println(name1 + " suggests that you guys should break up. You felt extremely sad as you saw on instagram " + name1 + " got a new partner within 2 days of your break up. - 30 happiness");
            happiness -= 30;
            taken = false;
            relationshipRomantic = 0;
        }
        if (relationshipRomantic > 94 && taken) {
            System.out.println(name1 + " suggests that you two get married");
            System.out.println("you guys got married at the ripe age of " + ageOfMe + " and" + getAgeOfSigOther());
        }
        if (ageOfMe > 18 && getAgeOfSigOther() < 18 && taken) {
            System.out.println("Go to jail!");
            System.out.println("You died in prison");
            isDead = true;
        }
        if (ageOfMe > 20) {
            int howLikelydeath = (int) (Math.random() * 50);
            if (howLikelydeath > 35) {
                System.out.println(RED + "You inhaled a burger and choked on it" + RESET);
                isDead = true;
            }
        }
        if (ageOfMe > 30) {
            int howLikelydeath = (int) (Math.random() * 50);
            if (howLikelydeath > 20) {
                System.out.println(RED + "You accidentally slipped and fell when taking a shower, giving you serious brain concussion, leading to your death" + RESET);
                isDead = true;
            }
        }
        if (ageOfMe == 20) {
            System.out.println(YELLOW + "Go get a job: ");
            System.out.println("1) Mcdonalds cashier - $19,373");
            System.out.println("2) Plumber - $39,666");
            System.out.println("3) Salesperson - $47,081");
            System.out.println("4) Teacher at Harvard University - $184,893");
            System.out.println("5) Dentist - $223,986" + RESET);
            answer = scan.nextLine();
            if (answer.equals("1")) {
                System.out.println("Congrats you got your job");
                bankBalance += 19373;
                happiness -= 5;
            } else if (answer.equals("2")) {
                System.out.println("Congrats you got your job");
                bankBalance += 39666;
                happiness -= 10;
            } else if (answer.equals("3")) {
                System.out.println("Congrats you got your job");
                bankBalance += 47081;
                happiness -= 15;
            } else if (answer.equals("4")) {
                System.out.println("Congrats you got your job");
                bankBalance += 184893;
                happiness -= 20;
            } else if  (answer.equals("5")) {
                System.out.println("Congrats you got your job");
                bankBalance += 233986;
                happiness -= 25;
            } else if (answer.indexOf("x") > -1){
                System.out.println("Congrats you got a job as a software engineer!!!!!");
                happiness+=20;
                bankBalance+= 100000;
            }
        }
        if (ageOfMe > 18 && bankBalance > 30000) {
            int howLikelyTobeScreamedAt = (int) (Math.random() * 50);
            System.out.println();
            if(howLikelyTobeScreamedAt > 27 ) {
                System.out.println("You're boss screamed at you. - 15 happiness");
                happiness -= 15;
            }
        }
        if (ageOfMe > 18 && bankBalance > 120000) {
            int fired = (int) (Math.random() * 50);
            if(fired > 32) {
                System.out.println("Youre fired, you were caught sleeping when you are suppose to be doing your job. - 30 happiness");
                happiness -= 30;
            }
        }
        if (bankBalance < 0 && ageOfMe > 20) {
            System.out.println();
            System.out.println("Became homeless... and was murdered");
            isDead = true;
        }
    }
    private void printOutStats() {
        System.out.println( RED + "[Health: " + health + "%] ");
        if (health <= 10) {
            System.out.println("█▒▒▒▒▒▒▒▒▒");
        } else if (health <= 20) {
            System.out.println("██▒▒▒▒▒▒▒▒");
        } else if (health <= 30) {
            System.out.println("███▒▒▒▒▒▒▒");
        } else if (health <= 40) {
            System.out.println("████▒▒▒▒▒▒");
        } else if (health <= 50) {
            System.out.println("█████▒▒▒▒▒");
        } else if (health <= 60) {
            System.out.println("██████▒▒▒▒");
        } else if (health <= 70) {
            System.out.println("███████▒▒▒");
        } else if (health <= 80){
            System.out.println("████████▒▒");
        } else if (health <= 93 ) {
            System.out.println("█████████▒");
        } else {
            System.out.println("██████████");
        }
        System.out.println( PURPLE + "[Looks: " + looks + "%] ");
        if (looks <= 10) {
            System.out.println("█▒▒▒▒▒▒▒▒▒");
        } else if (looks <= 20) {
            System.out.println("██▒▒▒▒▒▒▒▒");
        } else if (looks <= 30) {
            System.out.println("███▒▒▒▒▒▒▒");
        } else if (looks <= 40) {
            System.out.println("████▒▒▒▒▒▒");
        } else if (looks <= 50) {
            System.out.println("█████▒▒▒▒▒");
        } else if (looks <= 60) {
            System.out.println("██████▒▒▒▒");
        } else if (looks <= 70) {
            System.out.println("███████▒▒▒");
        } else if (looks <= 80){
            System.out.println("████████▒▒");
        } else if (looks <= 93 ) {
            System.out.println("█████████▒");
        } else {
            System.out.println("██████████");
        }
        System.out.println(YELLOW + "[Happiness: " + happiness + "%] ");
        if (happiness <= 10) {
            System.out.println("█▒▒▒▒▒▒▒▒▒");
        } else if (happiness <= 20) {
            System.out.println("██▒▒▒▒▒▒▒▒");
        } else if (happiness <= 30) {
            System.out.println("███▒▒▒▒▒▒▒");
        } else if (happiness <= 40) {
            System.out.println("████▒▒▒▒▒▒");
        } else if (happiness <= 50) {
            System.out.println("█████▒▒▒▒▒");
        } else if (happiness <= 60) {
            System.out.println("██████▒▒▒▒");
        } else if (happiness <= 70) {
            System.out.println("███████▒▒▒");
        } else if (happiness <= 80){
            System.out.println("████████▒▒");
        } else if (happiness <= 93 ) {
            System.out.println("█████████▒");
        } else {
            System.out.println("██████████");
        }
        System.out.println(GREEN + "[Smarts: " + smarts + "%] ");
        if (smarts <= 10) {
            System.out.println("█▒▒▒▒▒▒▒▒▒");
        } else if (smarts <= 20) {
            System.out.println("██▒▒▒▒▒▒▒▒");
        } else if (smarts <= 30) {
            System.out.println("███▒▒▒▒▒▒▒");
        } else if (smarts <= 40) {
            System.out.println("████▒▒▒▒▒▒");
        } else if (smarts <= 50) {
            System.out.println("█████▒▒▒▒▒");
        } else if (smarts <= 60) {
            System.out.println("██████▒▒▒▒");
        } else if (smarts <= 70) {
            System.out.println("███████▒▒▒");
        } else if (smarts <= 80){
            System.out.println("████████▒▒");
        } else if (smarts <= 93 ) {
            System.out.println("█████████▒");
        } else {
            System.out.println("██████████");
        }
        System.out.println();
        System.out.println(RESET + "[Age: " + ageOfMe + "]");
        System.out.println("[Bank Balance: $" + bankBalance + "] ");
        System.out.println();
    }
    private void relationships() {
            System.out.println();
            System.out.println( RED + "[relationship with Mom: " + relationshipWitMom + "%]");
            if (relationshipWitMom <= 10) {
                System.out.println("█▒▒▒▒▒▒▒▒▒");
            } else if (relationshipWitMom <= 20) {
                System.out.println("██▒▒▒▒▒▒▒▒");
            } else if (relationshipWitMom <= 30) {
                System.out.println("███▒▒▒▒▒▒▒");
            } else if (relationshipWitMom <= 40) {
                System.out.println("████▒▒▒▒▒▒");
            } else if (relationshipWitMom <= 50) {
                System.out.println("█████▒▒▒▒▒");
            } else if (relationshipWitMom <= 60) {
                System.out.println("██████▒▒▒▒");
            } else if (relationshipWitMom <= 70) {
                System.out.println("███████▒▒▒");
            } else if (relationshipWitMom <= 80){
                System.out.println("████████▒▒");
            } else if (relationshipWitMom <= 93 ) {
                System.out.println("█████████▒");
            } else {
                System.out.println("██████████");
            }
            System.out.println(BLUE + "[relationship with Dad: " + relationshipWitDad + "%]");
            if (relationshipWitDad <= 10) {
                System.out.println("█▒▒▒▒▒▒▒▒▒");
            } else if (relationshipWitDad <= 20) {
                System.out.println("██▒▒▒▒▒▒▒▒");
            } else if (relationshipWitDad <= 30) {
                System.out.println("███▒▒▒▒▒▒▒");
            } else if (relationshipWitDad <= 40) {
                System.out.println("████▒▒▒▒▒▒");
            } else if (relationshipWitDad <= 50) {
                System.out.println("█████▒▒▒▒▒");
            } else if (relationshipWitDad <= 60) {
                System.out.println("██████▒▒▒▒");
            } else if (relationshipWitDad <= 70) {
                System.out.println("███████▒▒▒");
            } else if (relationshipWitDad <= 80){
                System.out.println("████████▒▒");
            } else if (relationshipWitDad <= 93 ) {
                System.out.println("█████████▒");
            } else {
                System.out.println("██████████");
            }
            System.out.println(RESET);
            if (taken) {
                System.out.println(PURPLE + "[relationship with " + name1 + ": " + relationshipRomantic + "%]");
                if (relationshipRomantic <= 10) {
                    System.out.println("█▒▒▒▒▒▒▒▒▒");
                } else if (relationshipRomantic <= 20) {
                    System.out.println("██▒▒▒▒▒▒▒▒");
                } else if (relationshipRomantic <= 30) {
                    System.out.println("███▒▒▒▒▒▒▒");
                } else if (relationshipRomantic <= 40) {
                    System.out.println("████▒▒▒▒▒▒");
                } else if (relationshipRomantic <= 50) {
                    System.out.println("█████▒▒▒▒▒");
                } else if (relationshipRomantic <= 60) {
                    System.out.println("██████▒▒▒▒");
                } else if (relationshipRomantic <= 70) {
                    System.out.println("███████▒▒▒");
                } else if (relationshipRomantic <= 80){
                    System.out.println("████████▒▒");
                } else if (relationshipRomantic <= 93 ) {
                    System.out.println("█████████▒");
                } else {
                    System.out.println("██████████" + RESET);
                }
                System.out.println(RESET);
            }
            System.out.print("Choose who to interact with: ");
            answer = scan.nextLine();
            if (answer.equals("dad")) {
                System.out.println(GREEN + "1) Ask for money");
                System.out.println(PURPLE + "2) Compliment");
                System.out.println(YELLOW + "3) Have a conversation");
                System.out.println(RED + "4) INSULT");
                int xxx = scan.nextInt();
                System.out.println();
                if (xxx == 1) {
                    if ( relationshipWitDad > 52) {
                        int bro = (int) (Math.random() * 100);
                        bankBalance += bro;
                        System.out.println(GREEN + "Cha Ching! Your dad gave you " + bro + " dollars.");
                    } else {
                        System.out.println("Your dad said no. He thinks you are very greedy. - 5 relationship");
                        System.out.println(BLUE + "[relationship with Dad: " + relationshipWitDad + "%]");
                        if (relationshipWitDad <= 10) {
                            System.out.println("█▒▒▒▒▒▒▒▒▒");
                        } else if (relationshipWitDad <= 20) {
                            System.out.println("██▒▒▒▒▒▒▒▒");
                        } else if (relationshipWitDad <= 30) {
                            System.out.println("███▒▒▒▒▒▒▒");
                        } else if (relationshipWitDad <= 40) {
                            System.out.println("████▒▒▒▒▒▒");
                        } else if (relationshipWitDad <= 50) {
                            System.out.println("█████▒▒▒▒▒");
                        } else if (relationshipWitDad <= 60) {
                            System.out.println("██████▒▒▒▒");
                        } else if (relationshipWitDad <= 70) {
                            System.out.println("███████▒▒▒");
                        } else if (relationshipWitDad <= 80){
                            System.out.println("████████▒▒");
                        } else if (relationshipWitDad <= 93 ) {
                            System.out.println("█████████▒");
                        } else {
                            System.out.println("██████████");
                        }
                        System.out.println(RESET);
                    }
                } else if (xxx == 2) {
                    int bro = (int) (Math.random() * 15);
                    System.out.println("Your dad said you are a nice kid. + " + bro);
                    relationshipWitDad += bro;
                    System.out.println(BLUE + "[relationship with Dad: " + relationshipWitDad + "%]");
                    if (relationshipWitDad <= 10) {
                        System.out.println("█▒▒▒▒▒▒▒▒▒");
                    } else if (relationshipWitDad <= 20) {
                        System.out.println("██▒▒▒▒▒▒▒▒");
                    } else if (relationshipWitDad <= 30) {
                        System.out.println("███▒▒▒▒▒▒▒");
                    } else if (relationshipWitDad <= 40) {
                        System.out.println("████▒▒▒▒▒▒");
                    } else if (relationshipWitDad <= 50) {
                        System.out.println("█████▒▒▒▒▒");
                    } else if (relationshipWitDad <= 60) {
                        System.out.println("██████▒▒▒▒");
                    } else if (relationshipWitDad <= 70) {
                        System.out.println("███████▒▒▒");
                    } else if (relationshipWitDad <= 80){
                        System.out.println("████████▒▒");
                    } else if (relationshipWitDad <= 93 ) {
                        System.out.println("█████████▒");
                    } else {
                        System.out.println("██████████");
                    }
                    System.out.println(RESET);
                } else if (xxx == 3) {
                    if (relationshipWitDad > 45) {
                        int bro = (int) (Math.random() * 12);
                            System.out.println("Your dad enjoyed talking to you. + " + bro + " relationship points");
                            relationshipWitDad += bro;
                            System.out.println(BLUE + "[relationship with Dad: " + relationshipWitDad + "%]");
                            if (relationshipWitDad <= 10) {
                                System.out.println("█▒▒▒▒▒▒▒▒▒");
                            } else if (relationshipWitDad <= 20) {
                                System.out.println("██▒▒▒▒▒▒▒▒");
                            } else if (relationshipWitDad <= 30) {
                                System.out.println("███▒▒▒▒▒▒▒");
                            } else if (relationshipWitDad <= 40) {
                                System.out.println("████▒▒▒▒▒▒");
                            } else if (relationshipWitDad <= 50) {
                                System.out.println("█████▒▒▒▒▒");
                            } else if (relationshipWitDad <= 60) {
                                System.out.println("██████▒▒▒▒");
                            } else if (relationshipWitDad <= 70) {
                                System.out.println("███████▒▒▒");
                            } else if (relationshipWitDad <= 80){
                                System.out.println("████████▒▒");
                            } else if (relationshipWitDad <= 93 ) {
                                System.out.println("█████████▒");
                            } else {
                                System.out.println("██████████");
                            }
                        System.out.println(RESET);
                    } else {
                        int bro = (int) (Math.random() * 20);
                        if (bro > 16) {
                            System.out.println("Your dad enjoyed talking to you. + " + bro + " relationship points");
                            relationshipWitDad += bro;
                            System.out.println(BLUE + "[relationship with Dad: " + relationshipWitDad + "%]");
                            if (relationshipWitDad <= 10) {
                                System.out.println("█▒▒▒▒▒▒▒▒▒");
                            } else if (relationshipWitDad <= 20) {
                                System.out.println("██▒▒▒▒▒▒▒▒");
                            } else if (relationshipWitDad <= 30) {
                                System.out.println("███▒▒▒▒▒▒▒");
                            } else if (relationshipWitDad <= 40) {
                                System.out.println("████▒▒▒▒▒▒");
                            } else if (relationshipWitDad <= 50) {
                                System.out.println("█████▒▒▒▒▒");
                            } else if (relationshipWitDad <= 60) {
                                System.out.println("██████▒▒▒▒");
                            } else if (relationshipWitDad <= 70) {
                                System.out.println("███████▒▒▒");
                            } else if (relationshipWitDad <= 80){
                                System.out.println("████████▒▒");
                            } else if (relationshipWitDad <= 93 ) {
                                System.out.println("█████████▒");
                            } else {
                                System.out.println("██████████" + RESET);
                            }
                            System.out.println(RESET);
                        } else {
                            System.out.println(RESET + "You're dad didnt seem to care. He was scrolling on tiktok instead");
                        }
                    }
                } else if (xxx == 4) {
                    if (relationshipWitDad < 72) {
                        System.out.println(BLUE + "Your dad is disappointed in you. - 13 points");
                        relationshipWitDad -= 13;
                        System.out.println(BLUE + "[relationship with Dad: " + relationshipWitDad + "%]");
                        if (relationshipWitDad <= 10) {
                            System.out.println("█▒▒▒▒▒▒▒▒▒");
                        } else if (relationshipWitDad <= 20) {
                            System.out.println("██▒▒▒▒▒▒▒▒");
                        } else if (relationshipWitDad <= 30) {
                            System.out.println("███▒▒▒▒▒▒▒");
                        } else if (relationshipWitDad <= 40) {
                            System.out.println("████▒▒▒▒▒▒");
                        } else if (relationshipWitDad <= 50) {
                            System.out.println("█████▒▒▒▒▒");
                        } else if (relationshipWitDad <= 60) {
                            System.out.println("██████▒▒▒▒");
                        } else if (relationshipWitDad <= 70) {
                            System.out.println("███████▒▒▒");
                        } else if (relationshipWitDad <= 80){
                            System.out.println("████████▒▒");
                        } else if (relationshipWitDad <= 93 ) {
                            System.out.println("█████████▒");
                        } else {
                            System.out.println("██████████" + RESET);
                        }
                        System.out.println(RESET);
                    } else {
                        System.out.println(BLUE + "Your dad is disappointed in you. - 7 points");
                        relationshipWitDad -= 7;
                        System.out.println(BLUE + "[relationship with Dad: " + relationshipWitDad + "%]");
                        if (relationshipWitDad <= 10) {
                            System.out.println("█▒▒▒▒▒▒▒▒▒");
                        } else if (relationshipWitDad <= 20) {
                            System.out.println("██▒▒▒▒▒▒▒▒");
                        } else if (relationshipWitDad <= 30) {
                            System.out.println("███▒▒▒▒▒▒▒");
                        } else if (relationshipWitDad <= 40) {
                            System.out.println("████▒▒▒▒▒▒");
                        } else if (relationshipWitDad <= 50) {
                            System.out.println("█████▒▒▒▒▒");
                        } else if (relationshipWitDad <= 60) {
                            System.out.println("██████▒▒▒▒");
                        } else if (relationshipWitDad <= 70) {
                            System.out.println("███████▒▒▒");
                        } else if (relationshipWitDad <= 80){
                            System.out.println("████████▒▒");
                        } else if (relationshipWitDad <= 93 ) {
                            System.out.println("█████████▒");
                        } else {
                            System.out.println("██████████" + RESET);
                        }
                        System.out.println(RESET);
                    }
                }
            } else if (answer.equals("mom")) {
                System.out.println(GREEN + "1) Ask for money");
                System.out.println(PURPLE + "2) Compliment");
                System.out.println(YELLOW + "3) Have a conversation");
                System.out.println(RED + "4) INSULT");
                int xxx = scan.nextInt();
                System.out.println();
                if (xxx == 1) {
                    if ( relationshipWitMom > 52) {
                        int bro = (int) (Math.random() * 100);
                        bankBalance += bro;
                        System.out.println(GREEN + "Cha Ching! Your mom gave you " + bro + " dollars.");
                    } else {
                        System.out.println("Your dad said no. He thinks you are very greedy. - 5 relationship");
                        System.out.println(BLUE + "[relationship with Mom: " + relationshipWitMom + "%]");
                        if (relationshipWitMom <= 10) {
                            System.out.println("█▒▒▒▒▒▒▒▒▒");
                        } else if (relationshipWitMom <= 20) {
                            System.out.println("██▒▒▒▒▒▒▒▒");
                        } else if (relationshipWitMom <= 30) {
                            System.out.println("███▒▒▒▒▒▒▒");
                        } else if (relationshipWitMom <= 40) {
                            System.out.println("████▒▒▒▒▒▒");
                        } else if (relationshipWitMom <= 50) {
                            System.out.println("█████▒▒▒▒▒");
                        } else if (relationshipWitMom <= 60) {
                            System.out.println("██████▒▒▒▒");
                        } else if (relationshipWitMom <= 70) {
                            System.out.println("███████▒▒▒");
                        } else if (relationshipWitMom <= 80){
                            System.out.println("████████▒▒");
                        } else if (relationshipWitMom <= 93 ) {
                            System.out.println("█████████▒");
                        } else {
                            System.out.println("██████████");
                        }
                        System.out.println(RESET);
                    }
                } else if (xxx == 2) {
                    int bro = (int) (Math.random() * 15);
                    System.out.println("Your mom said you are a nice kid. + " + bro);
                    relationshipWitMom += bro;
                    System.out.println(BLUE + "[relationship with Mom: " + relationshipWitMom + "%]");
                    if (relationshipWitMom <= 10) {
                        System.out.println("█▒▒▒▒▒▒▒▒▒");
                    } else if (relationshipWitMom <= 20) {
                        System.out.println("██▒▒▒▒▒▒▒▒");
                    } else if (relationshipWitMom <= 30) {
                        System.out.println("███▒▒▒▒▒▒▒");
                    } else if (relationshipWitMom <= 40) {
                        System.out.println("████▒▒▒▒▒▒");
                    } else if (relationshipWitMom <= 50) {
                        System.out.println("█████▒▒▒▒▒");
                    } else if (relationshipWitMom <= 60) {
                        System.out.println("██████▒▒▒▒");
                    } else if (relationshipWitMom <= 70) {
                        System.out.println("███████▒▒▒");
                    } else if (relationshipWitMom <= 80){
                        System.out.println("████████▒▒");
                    } else if (relationshipWitMom <= 93 ) {
                        System.out.println("█████████▒");
                    } else {
                        System.out.println("██████████");
                    }
                    System.out.println(RESET);
                } else if (xxx == 3) {
                    if (relationshipWitMom > 45) {
                        int bro = (int) (Math.random() * 12);
                        System.out.println("Your mom enjoyed talking to you. + " + bro + " relationship points");
                        relationshipWitMom += bro;
                        System.out.println(BLUE + "[relationship with Mom: " + relationshipWitDad + "%]");
                        if (relationshipWitMom <= 10) {
                            System.out.println("█▒▒▒▒▒▒▒▒▒");
                        } else if (relationshipWitMom <= 20) {
                            System.out.println("██▒▒▒▒▒▒▒▒");
                        } else if (relationshipWitMom <= 30) {
                            System.out.println("███▒▒▒▒▒▒▒");
                        } else if (relationshipWitMom <= 40) {
                            System.out.println("████▒▒▒▒▒▒");
                        } else if (relationshipWitMom <= 50) {
                            System.out.println("█████▒▒▒▒▒");
                        } else if (relationshipWitMom <= 60) {
                            System.out.println("██████▒▒▒▒");
                        } else if (relationshipWitMom <= 70) {
                            System.out.println("███████▒▒▒");
                        } else if (relationshipWitMom <= 80){
                            System.out.println("████████▒▒");
                        } else if (relationshipWitMom <= 93 ) {
                            System.out.println("█████████▒");
                        } else {
                            System.out.println("██████████");
                        }
                        System.out.println(RESET);
                    } else {
                        int bro = (int) (Math.random() * 20);
                        if (bro > 16) {
                            System.out.println("Your mom thought you are a funny and bright individual. + " + bro + " relationship points");
                            relationshipWitMom += bro;
                            System.out.println(BLUE + "[relationship with Mom: " + relationshipWitDad + "%]");
                            if (relationshipWitMom <= 10) {
                                System.out.println("█▒▒▒▒▒▒▒▒▒");
                            } else if (relationshipWitMom <= 20) {
                                System.out.println("██▒▒▒▒▒▒▒▒");
                            } else if (relationshipWitMom <= 30) {
                                System.out.println("███▒▒▒▒▒▒▒");
                            } else if (relationshipWitMom <= 40) {
                                System.out.println("████▒▒▒▒▒▒");
                            } else if (relationshipWitMom <= 50) {
                                System.out.println("█████▒▒▒▒▒");
                            } else if (relationshipWitMom <= 60) {
                                System.out.println("██████▒▒▒▒");
                            } else if (relationshipWitMom <= 70) {
                                System.out.println("███████▒▒▒");
                            } else if (relationshipWitMom <= 80){
                                System.out.println("████████▒▒");
                            } else if (relationshipWitMom <= 93 ) {
                                System.out.println("█████████▒");
                            } else {
                                System.out.println("██████████" + RESET);
                            }
                            System.out.println(RESET);
                        } else {
                            System.out.println("You're mom wasn't paying attention. Instead you notice her staring to a distance");
                        }
                    }
                } else if (xxx == 4) {
                    if (relationshipWitMom < 72) {
                        System.out.println(BLUE + "Your mom is disappointed in you... She felt extremely upset in your behavior, leading to her parenting skills. - 13 points");
                        relationshipWitMom -= 13;
                        System.out.println(BLUE + "[relationship with Mom: " + relationshipWitMom + "%]");
                        if (relationshipWitMom <= 10) {
                            System.out.println("█▒▒▒▒▒▒▒▒▒");
                        } else if (relationshipWitMom <= 20) {
                            System.out.println("██▒▒▒▒▒▒▒▒");
                        } else if (relationshipWitMom <= 30) {
                            System.out.println("███▒▒▒▒▒▒▒");
                        } else if (relationshipWitMom <= 40) {
                            System.out.println("████▒▒▒▒▒▒");
                        } else if (relationshipWitMom <= 50) {
                            System.out.println("█████▒▒▒▒▒");
                        } else if (relationshipWitMom <= 60) {
                            System.out.println("██████▒▒▒▒");
                        } else if (relationshipWitMom <= 70) {
                            System.out.println("███████▒▒▒");
                        } else if (relationshipWitMom <= 80){
                            System.out.println("████████▒▒");
                        } else if (relationshipWitMom <= 93 ) {
                            System.out.println("█████████▒");
                        } else {
                            System.out.println("██████████" + RESET);
                        }
                    } else {
                        System.out.println(BLUE + "Your mom is disappointed in you. - 7 points");
                        relationshipWitMom -= 7;
                        System.out.println(BLUE + "[relationship with Mom: " + relationshipWitMom + "%]");
                        if (relationshipWitMom <= 10) {
                            System.out.println("█▒▒▒▒▒▒▒▒▒");
                        } else if (relationshipWitMom <= 20) {
                            System.out.println("██▒▒▒▒▒▒▒▒");
                        } else if (relationshipWitMom <= 30) {
                            System.out.println("███▒▒▒▒▒▒▒");
                        } else if (relationshipWitMom <= 40) {
                            System.out.println("████▒▒▒▒▒▒");
                        } else if (relationshipWitMom <= 50) {
                            System.out.println("█████▒▒▒▒▒");
                        } else if (relationshipWitMom <= 60) {
                            System.out.println("██████▒▒▒▒");
                        } else if (relationshipWitMom <= 70) {
                            System.out.println("███████▒▒▒");
                        } else if (relationshipWitMom <= 80){
                            System.out.println("████████▒▒");
                        } else if (relationshipWitMom <= 93 ) {
                            System.out.println("█████████▒");
                        } else {
                            System.out.println("██████████" + RESET);
                        }
                    }
                }
            } else if (answer.equals("so")) {
                System.out.println("1) Insult");
                System.out.println("2) Show affection");
                System.out.println("3) Break-up");
                int xxx = scan.nextInt();
                System.out.println();
                if (xxx == 1) {
                    System.out.println("uh oh" + name1 + "seems to be mad at you... - 10 relationship");
                    relationshipRomantic -=10;
                } else if (xxx == 2) {
                    System.out.println("Wow... You are sure a romantic! + 10 relationship");
                    relationshipRomantic+=10;
                } else if (xxx == 3) {
                    System.out.println("Broke up. Youre up and" + name1 + " broke.");
                    taken = false;
                    relationshipRomantic = 0;
                }
            }
    }
    private void assets(boolean OwnAHouse) {
        if (OwnAHouse) {
            System.out.println("You currently own a house! Wow!");
        }
    }
    private void assets() {
        if (ageOfMe < 18) {
            System.out.println();
            System.out.println(RED + "Sorry you ARE UNDERAGE." + RESET);
        } else {
            System.out.println(BLUE + "Enter 1 - Real Estate");
            int x = scan.nextInt();
            if (x == 1) {
                System.out.println("1) Portable Mobile Home (1 br/ 1 ba) - $19,373");
                System.out.println("2) Manufactored Home (2 br/ 1 ba) - $39,666");
                System.out.println("3) Economical Condo (1 br/ 2 ba) - $47,081");
                System.out.println("4) Enchanting Chalet (3 br/ 2 ba) - $184,893");
                System.out.println("5) Charming terrortorial home (3 br/ 3 ba) - $201,012");
                System.out.println("6) Rustic Craftman home (3 br/ 4 ba ) - $223,986");
                System.out.println();
                System.out.println(RESET + "Which one would you like to purchase? If not, type no.");
                answer = scan.nextLine();
                if (answer.equals("1")) {
                    if (19373 < bankBalance) {
                        bankBalance -= 19373;
                        System.out.println(GREEN + "You have successfully bought Portable Mobile Home!" + RESET);
                        ifOwnAHouse = true;
                    } else {
                        System.out.println(RED + "YOU DO NOT HAVE ENOUGH MONEY!!!!" + RESET);
                    }
                } else if (answer.equals("2")) {
                    if (39666 < bankBalance) {
                        bankBalance -= 39666;
                        System.out.println(GREEN + "You have successfully bought Manufactored Home!");
                        ifOwnAHouse = true;
                    } else {
                        System.out.println(RED + "YOU DO NOT HAVE ENOUGH MONEY!!!!" + RESET);
                    }
                } else if (answer.equals("3")){
                    if (47081 < bankBalance) {
                        bankBalance -= 47081;
                        System.out.println(GREEN + "You have successfully bought Economical Condo!");
                        ifOwnAHouse = true;
                    } else {
                        System.out.println(RED + "YOU DO NOT HAVE ENOUGH MONEY!!!!" + RESET);
                    }
                } else if (answer.equals("4")) {
                    if (184893 < bankBalance) {
                        bankBalance -= 184893;
                        System.out.println(GREEN + "You have successfully bought Enchanting Chalet!");
                        ifOwnAHouse = true;
                    } else {
                        System.out.println(RED + "YOU DO NOT HAVE ENOUGH MONEY!!!!" + RESET);
                    }
                } else if (answer.equals("5")) {
                    if (201012 < bankBalance) {
                        bankBalance -= 201012;
                        System.out.println(GREEN + "You have successfully bought Charming terrortorial home!");
                        ifOwnAHouse = true;
                    } else {
                        System.out.println(RED + "YOU DO NOT HAVE ENOUGH MONEY!!!!" + RESET);
                    }
                } else if (answer.equals("6")) {
                    if (233986 < bankBalance) {
                        bankBalance -= 233986;
                        System.out.println(GREEN + "You have successfully bought Rustic Craftman home!");
                        ifOwnAHouse = true;
                    } else {
                        System.out.println(RED + "YOU DO NOT HAVE ENOUGH MONEY!!!!" + RESET);
                    }
                }
            } else {
                System.out.println("Just choose one bruh");
            }
        }

    }
    private void activities() {
        System.out.println();
        System.out.println(RED + "1) Love (Dating app)");
        System.out.println(GREEN  + "2) Mind and body");
        System.out.println(PURPLE + "3) Crime");
        System.out.println(BLUE + "4) Doctor" + RESET);
        System.out.print("Choose an option: ");
        int broski = scan.nextInt();
        System.out.println();
        if (broski == 1) {
                System.out.print("What's your age limit: ");
                int broooo = scan.nextInt();
                scan.nextLine();
                int nameDeterminer = (int) (Math.random() * 50);
                if (nameDeterminer > 48) {
                    name1 = "Joschka Baptist \uD83D\uDC68";
                } else if (nameDeterminer > 45) {
                    name1 = "Math Macson \uD83D\uDC68\uD83C\uDFFB";
                } else if (nameDeterminer > 42) {
                    name1 = "Lir Fachtna \uD83D\uDC68";
                } else if (nameDeterminer > 39) {
                    name1 = "Conor Blodeuedd \uD83D\uDC68\uD83C\uDFFB";
                } else if (nameDeterminer > 37) {
                    name1 = "Aurora Bellona";
                } else if (nameDeterminer > 34) {
                    name1 = "Giunone Nona \uD83D\uDC69";
                } else if (nameDeterminer > 32) {
                    name1 = "Elissa Thisbe \uD83D\uDC69\uD83C\uDFFC";
                } else if (nameDeterminer > 29) {
                    name1 = "Youko Anastasija \uD83D\uDC69\uD83C\uDFFB";
                } else if (nameDeterminer > 26) {
                    name1 = "Maia Elissa \uD83D\uDC69";
                } else if (nameDeterminer > 23) {
                    name1 = "Brian Diodato \uD83D\uDC68\uD83C\uDFFC";
                } else if (nameDeterminer > 20) {
                    name1 = "Lorenzo Mosè \uD83D\uDC68\uD83C\uDFFD";
                } else if (nameDeterminer > 16) {
                    name1 = "Damhán Simone \uD83D\uDC68\uD83C\uDFFC";
                } else if (nameDeterminer > 13) {
                    name1 = "Hilary Ananth \uD83D\uDC69";
                } else if (nameDeterminer > 11) {
                    name1 = "Puja Senka \uD83D\uDC69\uD83C\uDFFD";
                } else if (nameDeterminer > 9) {
                    name1 = "Tamanna Taylor \uD83D\uDC69\uD83C\uDFFC";
                } else if (nameDeterminer > 7) {
                    name1 = "Wendy Harriett \uD83D\uDC69\uD83C\uDFFE";
                } else if (nameDeterminer > 4) {
                    name1 = "Doris Milanka \uD83D\uDC69\uD83C\uDFFB";
                } else if (nameDeterminer > 2) {
                    name1 = "Raida Samara \uD83D\uDC69\uD83C\uDFFD";
                } else {
                    name1 = "London Layne \uD83D\uDC68\uD83C\uDFFB";
                }

                craziness = (int) (Math.random() * 100);
                int looks1 = (int) (Math.random() * 100);
                int money = (int) (Math.random() * 100);
                int smarts1 = (int) (Math.random() * 100);
                ageOfSigOther = (int) (Math.random() * broooo);
                System.out.println();
                System.out.println(RED + "❤\uFE0F The dating app has matched you to " + name1 + "❤\uFE0F");
                System.out.println("Age = " + ageOfSigOther);
                System.out.println(RED + "[Craziness: " + craziness + "%] ");
                if (craziness <= 10) {
                    System.out.println("█▒▒▒▒▒▒▒▒▒");
                } else if (craziness <= 20) {
                    System.out.println("██▒▒▒▒▒▒▒▒");
                } else if (craziness <= 30) {
                    System.out.println("███▒▒▒▒▒▒▒");
                } else if (craziness <= 40) {
                    System.out.println("████▒▒▒▒▒▒");
                } else if (craziness <= 50) {
                    System.out.println("█████▒▒▒▒▒");
                } else if (craziness <= 60) {
                    System.out.println("██████▒▒▒▒");
                } else if (craziness <= 70) {
                    System.out.println("███████▒▒▒");
                } else if (craziness <= 80) {
                    System.out.println("████████▒▒");
                } else if (craziness <= 93) {
                    System.out.println("█████████▒");
                } else {
                    System.out.println("██████████");
                }
                System.out.println(PURPLE + "[Looks: " + looks1 + "%] ");
                if (looks1 <= 10) {
                    System.out.println("█▒▒▒▒▒▒▒▒▒");
                } else if (looks1 <= 20) {
                    System.out.println("██▒▒▒▒▒▒▒▒");
                } else if (looks1 <= 30) {
                    System.out.println("███▒▒▒▒▒▒▒");
                } else if (looks1 <= 40) {
                    System.out.println("████▒▒▒▒▒▒");
                } else if (looks1 <= 50) {
                    System.out.println("█████▒▒▒▒▒");
                } else if (looks1 <= 60) {
                    System.out.println("██████▒▒▒▒");
                } else if (looks1 <= 70) {
                    System.out.println("███████▒▒▒");
                } else if (looks1 <= 80) {
                    System.out.println("████████▒▒");
                } else if (looks1 <= 93) {
                    System.out.println("█████████▒");
                } else {
                    System.out.println("██████████");
                }
                System.out.println(YELLOW + "[Money: " + money + "%] ");
                if (money <= 10) {
                    System.out.println("█▒▒▒▒▒▒▒▒▒");
                } else if (money <= 20) {
                    System.out.println("██▒▒▒▒▒▒▒▒");
                } else if (money <= 30) {
                    System.out.println("███▒▒▒▒▒▒▒");
                } else if (money <= 40) {
                    System.out.println("████▒▒▒▒▒▒");
                } else if (money <= 50) {
                    System.out.println("█████▒▒▒▒▒");
                } else if (money <= 60) {
                    System.out.println("██████▒▒▒▒");
                } else if (money <= 70) {
                    System.out.println("███████▒▒▒");
                } else if (money <= 80) {
                    System.out.println("████████▒▒");
                } else if (money <= 93) {
                    System.out.println("█████████▒");
                } else {
                    System.out.println("██████████");
                }
                System.out.println(GREEN + "[Smarts: " + smarts1 + "%] ");
                if (smarts1 <= 10) {
                    System.out.println("█▒▒▒▒▒▒▒▒▒");
                } else if (smarts1 <= 20) {
                    System.out.println("██▒▒▒▒▒▒▒▒");
                } else if (smarts1 <= 30) {
                    System.out.println("███▒▒▒▒▒▒▒");
                } else if (smarts1 <= 40) {
                    System.out.println("████▒▒▒▒▒▒");
                } else if (smarts1 <= 50) {
                    System.out.println("█████▒▒▒▒▒");
                } else if (smarts1 <= 60) {
                    System.out.println("██████▒▒▒▒");
                } else if (smarts1 <= 70) {
                    System.out.println("███████▒▒▒");
                } else if (smarts1 <= 80) {
                    System.out.println("████████▒▒");
                } else if (smarts1 <= 93) {
                    System.out.println("█████████▒");
                } else {
                    System.out.println("██████████");
                }

                System.out.print(RED + "Would you like to date " + name1 + "? " + RESET);
                String yooo = scan.nextLine();
                if (yooo.equals("yes")) {
                    int outcome = 0;
                    if (looks < 40) {
                        outcome = (int) (Math.random() * 50);
                        if (outcome > 39) {
                            taken = true;
                            relationshipRomantic = (int) (Math.random() * 100);
                            System.out.println("Going steady: You are now dating " + name1);
                        } else {
                            outcome = (int) (Math.random() * 5);
                            if (outcome == 1) {
                                System.out.println(name1 + " asked you out on a date to Texas RoadHouse.");
                            } else if (outcome == 2) {
                                System.out.println(name1 + " asked you out on a date to Panda Express.");
                            } else if (outcome == 3) {
                                System.out.println(name1 + " asked you out on a date to Mcdonalds.");
                            } else if (outcome == 4) {
                                System.out.println(name1 + " asked you out on a date to Sushi for lyfe.");
                            } else if (outcome == 5) {
                                System.out.println(name1 + " asked you out on a date to Red Lobster.");
                            }
                            System.out.print("Would you like to agree to the date? ");
                            answer = scan.nextLine();
                            if (answer.equals("yes")) {
                                System.out.print(name1 + " seems to be running late. Do you wish to wait? ");
                                answer = scan.nextLine();
                                if (answer.equals("yes")) {
                                    happiness -= 15;
                                    System.out.println("Turns out" + name1 + " stood you up... Happiness - 15");
                                } else {
                                    System.out.println("You went home.");
                                }
                            } else {
                                System.out.println("Aww... " + name1 + " seemed to be interested in you...");
                            }
                        }
                    } else if (looks < 70) {
                        outcome = (int) (Math.random() * 20);
                        if (outcome > 13) {
                            relationshipRomantic = (int) (Math.random() * 100);
                            taken = true;
                            System.out.println("Going steady: You are now dating " + name1);
                        } else {
                            System.out.println("They ghosted you. - 5 happiness ");
                            happiness -= 5;
                        }
                    } else {
                        outcome = (int) (Math.random() * 2);
                        if (outcome == 1) {
                            System.out.println("Going steady: You are now dating " + name1);
                        } else {
                            System.out.println("Apparently they were a scammer. - 5 happiness");
                            happiness -= 5;
                        }
                    }
                } else {
                    System.out.println("Good luck next time!");
                }

        } else if (broski == 2) {
            System.out.println("You worked out! And feel extra fresh. Happiness + 8, Looks + 8");
            happiness+= 8;
            looks += 8;
        } else if (broski == 3) {
            System.out.println("1) Pickpocket");
            System.out.println("2) Murder");
            System.out.println();
            System.out.print("What kind of crime would you like to commit? ");
            int what = scan.nextInt();
            scan.nextLine();
                if (what == 1) {
                    int randomm = (int) (Math.random() * 1000);
                    int random = (int) (Math.random() * 1000);
                    int x = (int) (Math.random() * 101);
                    System.out.print("What is the answer to this problem: " + randomm + " + " + random + " multiplyed by " + x + "? ");
                    int s = scan.nextInt();
                    if (s == randomm + (random*x)) {
                        int moneyEarned = (int) (Math.random() * 1000);
                        System.out.println(YELLOW + "MISSION SUCCESSFUL: You earned $" + moneyEarned + " \uD83D\uDE0E" + RESET);
                        System.out.println();
                        bankBalance += moneyEarned;
                    }
                } else if (what == 2) {
                    getRelationship();
                    System.out.print("Who do you want to commit a crime against? ");
                    answer = scan.nextLine();
                    if (answer.equals("mom") && isMomAlive) {
                        int random = (int) (Math.random() * 100);
                        if (random > 75) {
                            int moneyFrom = (int) (Math.random() * 200000);
                            System.out.println("rip. All of your mom's money goes to you... + $" + moneyFrom);
                            bankBalance+= moneyFrom;
                        } else {
                            System.out.println("You swung at her but she dodged. :(");
                            System.out.println("Mom is suspicious of you... - 20 relationship");
                            relationshipWitMom-= 20;
                        }
                    } else if (!isMomAlive) {
                        System.out.println("Yo mama already dead!!!");
                    }
                    if (answer.equals("dad") && isDadAlive) {
                        int random = (int) (Math.random() * 100);
                        if (random > 75) {
                            int moneyFrom = (int) (Math.random() * 200000);
                            System.out.println("rip. All of your dad's money goes to you... + $" + moneyFrom);
                            isDadAlive = false;
                            bankBalance+= moneyFrom;
                        } else {
                            System.out.println("You tried breaking his ribs with your karate skills... but failed miserably :(");
                            System.out.println("Dad is suspicious of you... - 20 relationship");
                            relationshipWitDad-= 20;
                        }
                    } else if (!isDadAlive) {
                        System.out.println("Yo dad already dead!!!");
                    }
                    if (answer.equals("so") && taken) {
                        int random = (int) (Math.random() * 100);
                        if (random > 75) {
                            int jail = (int) (Math.random() * 10);
                            System.out.println("You flushed her remains down the toilet. ");
                            if (jail > 3) {
                                System.out.print("The police had found you due to your carelessness with getting rid of your DNA from the body");
                                System.out.println("You get beat up in jail - the end.");
                                isDead = true;
                            } else {
                                System.out.println("SUCCESS");
                            }
                        } else {
                            System.out.println(name1 + " is suspicious of you, catching you in the act - 30 relationship");
                            relationshipRomantic-= 20;
                        }
                    }
                }
        } else if (broski == 4) {
            int bob = (int) (Math.random() * 20);
            if (bob > 13) {
                System.out.print("The doctor prescribes you a lizard tall and a pig's eye, would you intake it?");
                answer = scan.nextLine();
                if (answer.equals("yes")) {
                     bob = (int) (Math.random() * 20);
                     if (bob > 5) {
                         System.out.println("Seems like the doctor wasn't a professional one... Your health seriously deterioates - 30 health");
                         health -= 30;
                     } else {
                         System.out.println("You wake up extremely calm and as if you have reached enlightenment. + 30 health, happiness = 80");
                         health += 30;
                         setHappiness(80);
                     }
                }
            } else {
                bob = (int) (Math.random() * 20);
                System.out.println("Your health increases by " + bob);
                health += bob;
            }
        } else {
            System.out.println("Bruh just choose");
        }
    }
    private void getRelationship() {
        System.out.println(BLUE + "[relationship with Dad: " + relationshipWitDad + "%]");
        if (relationshipWitDad <= 10) {
            System.out.println("█▒▒▒▒▒▒▒▒▒");
        } else if (relationshipWitDad <= 20) {
            System.out.println("██▒▒▒▒▒▒▒▒");
        } else if (relationshipWitDad <= 30) {
            System.out.println("███▒▒▒▒▒▒▒");
        } else if (relationshipWitDad <= 40) {
            System.out.println("████▒▒▒▒▒▒");
        } else if (relationshipWitDad <= 50) {
            System.out.println("█████▒▒▒▒▒");
        } else if (relationshipWitDad <= 60) {
            System.out.println("██████▒▒▒▒");
        } else if (relationshipWitDad <= 70) {
            System.out.println("███████▒▒▒");
        } else if (relationshipWitDad <= 80){
            System.out.println("████████▒▒");
        } else if (relationshipWitDad <= 93 ) {
            System.out.println("█████████▒");
        } else {
            System.out.println("██████████" + RESET);
        }
        System.out.println(RED + "[relationship with Mom: " + relationshipWitMom + "%]");
        if (relationshipWitMom <= 10) {
            System.out.println("█▒▒▒▒▒▒▒▒▒");
        } else if (relationshipWitMom <= 20) {
            System.out.println("██▒▒▒▒▒▒▒▒");
        } else if (relationshipWitMom <= 30) {
            System.out.println("███▒▒▒▒▒▒▒");
        } else if (relationshipWitMom <= 40) {
            System.out.println("████▒▒▒▒▒▒");
        } else if (relationshipWitMom <= 50) {
            System.out.println("█████▒▒▒▒▒");
        } else if (relationshipWitMom <= 60) {
            System.out.println("██████▒▒▒▒");
        } else if (relationshipWitMom <= 70) {
            System.out.println("███████▒▒▒");
        } else if (relationshipWitMom <= 80){
            System.out.println("████████▒▒");
        } else if (relationshipWitMom <= 93 ) {
            System.out.println("█████████▒");
        } else {
            System.out.println("██████████" + RESET);
        }
        System.out.println(RESET);
        if (taken == true) {
            System.out.println(PURPLE + "[relationship with " + name1 + ": " + relationshipRomantic + "%]");
            if (relationshipRomantic <= 10) {
                System.out.println("█▒▒▒▒▒▒▒▒▒");
            } else if (relationshipRomantic <= 20) {
                System.out.println("██▒▒▒▒▒▒▒▒");
            } else if (relationshipRomantic <= 30) {
                System.out.println("███▒▒▒▒▒▒▒");
            } else if (relationshipRomantic <= 40) {
                System.out.println("████▒▒▒▒▒▒");
            } else if (relationshipRomantic <= 50) {
                System.out.println("█████▒▒▒▒▒");
            } else if (relationshipRomantic <= 60) {
                System.out.println("██████▒▒▒▒");
            } else if (relationshipRomantic <= 70) {
                System.out.println("███████▒▒▒");
            } else if (relationshipRomantic <= 80){
                System.out.println("████████▒▒");
            } else if (relationshipRomantic <= 93 ) {
                System.out.println("█████████▒");
            } else {
                System.out.println("██████████" + RESET);
            }
            System.out.println(RESET);
        }
    }
    private void setHappiness(int happiness1) {
        happiness = happiness1;
    }
    private int getAgeOfSigOther() {
        return ageOfSigOther;
    }
}
