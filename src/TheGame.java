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
    private String RESET = "\u001B[0m";
    private String RED = "\u001B[31m";
    private String GREEN = "\u001B[32m";
    private String YELLOW = "\u001B[33m";
    private String PURPLE = "\u001B[35m";
    private String BLUE = "\u001B[34m";
    private String answer = "";
    private boolean isDead = false;
    private String name1 = "";
    private String age1 = "";

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
        System.out.print("Welcome to ");
        System.out.println(RED + "\uD835\uDCA2\uD835\uDC3C\uD835\uDCAF\uD835\uDC3F\uD835\uDCB4\uD835\uDC39\uD835\uDC38" + RESET);
        System.out.print("Begin? ");
        answer = scan.nextLine();
        if (answer.equals("yes")) {
            System.out.println();
            startingstats();
            while (!isDead) {
                ongoing();
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
            System.out.println(RESET + "[Age: " + age + "]");
            System.out.println("[Bank Balance: $" + bankBalance + "] ");
            System.out.println();
    }

    public void ongoing() {
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
                assets();
                scan.nextLine();
            } else if (eeee == 3){
                activities();
            }
            System.out.print("Age? If not, you have other options! ");
            age =  scan.nextLine();
        }
        age += 1;
        whenAge();
        printOutStats();
    }

    private void whenAge() {
        if (looks <= 40) {
            int randomness = (int) (Math.random() * 50);
            if (randomness > 42) {
                System.out.println(BLUE + "Today in class, Becky called you ugly when you tried to play with her. happiness - 8");
                System.out.println();
                happiness -=8;
            } else if (randomness > 39) {
                System.out.print("You were asked out by Becky today in science class. She thought you were cute.");
                String bro = scan.nextLine();
                System.out.println();
                System.out.println("Ha! She was joking. You went home and cried. Happiness - 15");
                happiness -= 15;
                System.out.println();
            }
        }

        if (smarts < 35) {
            int randomness = (int) (Math.random() * 50);
            if (randomness > 40 && !isGraduated) {
                System.out.println("The kid assigned to tutor you got upset with your stupidness. You feel sad. - 10 happiness");
                happiness -= 10;
            } else if (randomness > 32 && age < 9 && age > 3) {
                System.out.println("Your mother got into a fight with your dad about who you inherited your smarts from. You weren't quite sure what that meant.");
            }
        }

        int randomness = (int) (Math.random() * 50);
        if (randomness > 32 && health > 75 && !askedBefore) {
            System.out.print("You found out about the different teams in your school! Would you like to join one? ");
            String ss = scan.nextLine();
            if (ss.equals("yes")) {
                System.out.println("You're in! +10 happiness");
                happiness += 10;
            } else {
                System.out.println("Okay...");
                askedBefore = true;
            }
        }

        if (smarts > 75 && !isGraduated) {
            int swsw = (int) (Math.random() * 50);
            if (swsw > 43) {
                System.out.println(GREEN + "\uD83D\uDE0A You got 100 on your test today! Your mother is really proud of you! relationship with mom + 10!");
                System.out.println();
            } else if (swsw > 35) {
                System.out.println("Your neighbor Steven wants you to tutor him for math? Will you accept?");
                answer = scan.nextLine();

            }
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
        System.out.println(RESET + "[Age: " + age + "]");
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
            }
    }

    private void assets() {
        if (age < 18) {
            System.out.println();
            System.out.println(RED + "Sorry you ARE UNDERAGE." + RESET);
        } else {
            System.out.println(BLUE + "Enter 1 - Real Estate");
            System.out.println("Enter 2 - Cars");
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
                    } else {
                        System.out.println(RED + "YOU DO NOT HAVE ENOUGH MONEY!!!!" + RESET);
                    }
                } else if (answer.equals("2")) {
                    if (39666 < bankBalance) {
                        bankBalance -= 39666;
                        System.out.println(GREEN + "You have successfully bought Manufactored Home!");
                    } else {
                        System.out.println(RED + "YOU DO NOT HAVE ENOUGH MONEY!!!!" + RESET);
                    }
                } else if (answer.equals("3")){
                    if (47081 < bankBalance) {
                        bankBalance -= 47081;
                        System.out.println(GREEN + "You have successfully bought Economical Condo!");
                    } else {
                        System.out.println(RED + "YOU DO NOT HAVE ENOUGH MONEY!!!!" + RESET);
                    }
                } else if (answer.equals("4")) {
                    if (184893 < bankBalance) {
                        bankBalance -= 184893;
                        System.out.println(GREEN + "You have successfully bought Enchanting Chalet!");
                    } else {
                        System.out.println(RED + "YOU DO NOT HAVE ENOUGH MONEY!!!!" + RESET);
                    }
                } else if (answer.equals("5")) {
                    if (201012 < bankBalance) {
                        bankBalance -= 201012;
                        System.out.println(GREEN + "You have successfully bought Charming terrortorial home!");
                    } else {
                        System.out.println(RED + "YOU DO NOT HAVE ENOUGH MONEY!!!!" + RESET);
                    }
                } else if (answer.equals("6")) {
                    if (233986 < bankBalance) {
                        bankBalance -= 233986;
                        System.out.println(GREEN + "You have successfully bought Rustic Craftman home!");
                    } else {
                        System.out.println(RED + "YOU DO NOT HAVE ENOUGH MONEY!!!!" + RESET);
                    }
                }
            }
        }

    }


    private void activities() {
        System.out.println();
        System.out.println(RED + "1) Love");
        System.out.println(GREEN  + "2) Mind and body");
        System.out.println(PURPLE + "3) Crime");
        System.out.println(BLUE + "4) Doctor");
        System.out.println(YELLOW + "5) Pets" + RESET);
        System.out.print("Choose an option: ");
        int broski = scan.nextInt();
        System.out.println();
        if (broski == 1) {
            System.out.println(RED + "1) Dating app!");
            System.out.println(BLUE + "2) Love " + RESET);
            System.out.print("Choose an option: ");
            broski = scan.nextInt();
            System.out.print("Age limit? ");
            int broooo = scan.nextInt();
            scan.nextLine();
            if (broski == 1) {
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

                int craziness = (int) (Math.random() * 100);
                int looks1 = (int) (Math.random() * 100);
                int money = (int) (Math.random() * 100);
                int smarts1 = (int) (Math.random() * 100);
                int age = (int) (Math.random() * broooo);
                System.out.println();
                System.out.println(RED + "❤\uFE0F The dating app has matched you to " + name1 + "❤\uFE0F");
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
                    int bob = 0;
                    if (looks < 40) {
                        bob = (int) (Math.random() * 50);
                        if (bob > 39) {
                            System.out.println("Going steady: You are now dating " + name1);
                        } else {
                            bob = (int) (Math.random() * 5);
                            if (bob == 1) {
                                System.out.println(name1 + " asked you out on a date to Texas RoadHouse.");
                            } else if (bob == 2) {
                                System.out.println(name1 + " asked you out on a date to Panda Express.");
                            } else if (bob == 3) {
                                System.out.println(name1 + " asked you out on a date to Mcdonalds.");
                            } else if (bob == 4) {
                                System.out.println(name1 + " asked you out on a date to Sushi for lyfe.");
                            } else if (bob == 5) {
                                System.out.println(name1 + " asked you out on a date to Red Lobster.");
                            }
                            System.out.print("Would you like to agree to the date? ");
                            answer = scan.nextLine();
                            if (answer.equals("yes")) {
                                System.out.print(name1 + " seems to be running late. Do you wish to wait?");
                                answer = scan.nextLine();
                                if (answer.equals("yes")) {
                                    happiness -= 10;
                                    System.out.println("Turns out" + name1 + " stood you up... Happiness - 10");
                                } else {
                                    System.out.println("You went home.");
                                }
                            } else {
                                System.out.println("Aww... " + name1 + " seemed to be interested in you...");
                            }
                        }
                    } else if (looks < 70) {
                        bob = (int) (Math.random() * 20);
                        if (bob > 13) {
                            System.out.println("Going steady: You are now dating " + name1);
                        } else {
                            System.out.println("They ghosted you. - 5 happiness ");
                            happiness -= 5;
                        }
                    } else {
                        bob = (int) (Math.random() * 2);
                        if (bob == 1) {
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
                int stuff = (int) (Math.random() * 100);
                int nameDeterminer = (int) (Math.random() * 50);

                if (nameDeterminer > 48) {
                    name1 = "Phillip Schneider \uD83D\uDC68";
                } else if (nameDeterminer > 45) {
                    name1 = "Kamil Philipes \uD83D\uDC68\uD83C\uDFFB";
                } else if (nameDeterminer > 42) {
                    name1 = "Marco Harriet \uD83D\uDC68";
                } else if (nameDeterminer > 39) {
                    name1 = "Kyle Smithers \uD83D\uDC68\uD83C\uDFFB";
                } else if (nameDeterminer > 37) {
                    name1 = "Kiera Buniz \uD83D\uDC69\uD83C\uDFFC";
                } else if (nameDeterminer > 34) {
                    name1 = "Goona Dearth \uD83D\uDC69";
                } else if (nameDeterminer > 32) {
                    name1 = "Eliza Dhisbe \uD83D\uDC69\uD83C\uDFFC";
                } else if (nameDeterminer > 29) {
                    name1 = "Lucia Equator \uD83D\uDC69\uD83C\uDFFB";
                } else if (nameDeterminer > 26) {
                    name1 = "Mia Brosherman \uD83D\uDC69";
                } else if (nameDeterminer > 23) {
                    name1 = "Brian Diodato \uD83D\uDC68\uD83C\uDFFC";
                } else if (nameDeterminer > 20) {
                    name1 = "Robert Pattinson \uD83D\uDC68\uD83C\uDFFD";
                } else if (nameDeterminer > 16) {
                    name1 = "Mosè Simone \uD83D\uDC68\uD83C\uDFFC";
                } else if (nameDeterminer > 13) {
                    name1 = "Jannet Shannon \uD83D\uDC69";
                } else if (nameDeterminer > 11) {
                    name1 = "Sinja Blachena \uD83D\uDC69\uD83C\uDFFD";
                } else if (nameDeterminer > 9) {
                    name1 = "Tamanna Taylor \uD83D\uDC69\uD83C\uDFFC";
                } else if (nameDeterminer > 7) {
                    name1 = "Bridgette Kaauffer \uD83D\uDC69\uD83C\uDFFE";
                } else if (nameDeterminer > 4) {
                    name1 = "Doris Milanka \uD83D\uDC69\uD83C\uDFFB";
                } else if (nameDeterminer > 2) {
                    name1 = "Ambiya Kamilia \uD83D\uDC69\uD83C\uDFFD";
                } else {
                    name1 = "Santiago Wise \uD83D\uDC68\uD83C\uDFFB";
                }
                System.out.println(name1);
                System.out.println();
                int looks1 = (int) (Math.random() * 100);
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
                System.out.println(RESET);
            }

        } else if (broski == 2) {
            System.out.println("You worked out! And feel extra fresh. Happiness + 3, Looks + 3");
            happiness+= 3;
            looks += 3;
        } else if (broski == 3) {
            System.out.print("Who would u like to commit a crime against? ");
            answer = scan.next();
            getRelationship();
            if (answer.equals("mom")) {

            }
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
