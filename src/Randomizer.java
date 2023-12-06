
public class Randomizer {
    private String name ;
    private String gender;
    private int limit;
    private int happiness;
    private int looks;
    private int smarts;
    private int health;

    public Randomizer() {
        name = "";
        gender = "";
        limit = 100;
        happiness =0;
        looks = 0;
        smarts = 0;
        health = 0;
    }

    public Randomizer(String name, String gender) {
        this.name = name;
        this.gender = gender;
        limit = 100;
        happiness =0;
        looks = 0;
        smarts = 0;
        health = 0;
    }
    public void nameGenerator() {
        int genderDeterminer = (int) (Math.random() *2) + 1;
        if (genderDeterminer == 1) {
            gender = "female";
            int nameDeterminer = (int) (Math.random()*50 );
            if (nameDeterminer > 45) {
                name = "Juliana Harrington";
            } else if (nameDeterminer > 40) {
                name = "Sarah Patterson";
            } else if (nameDeterminer > 38) {
                name = "Shubhechchha Katadori";
            } else if (nameDeterminer > 35) {
                name = "Paige Carter";
            } else if (nameDeterminer > 30) {
                name = "Leanna Estrada";
            } else if (nameDeterminer > 25) {
                name = "Mary Huerta";
            } else if (nameDeterminer > 20) {
                name = "Giuliana Ventura";
            } else if (nameDeterminer > 15) {
                name = "Brooks Reed";
            } else if (nameDeterminer > 10) {
                name = "Clarissa Escobar";
            } else if (nameDeterminer > 5) {
                name = "Charlotte Bates";
            } else {
                name = "Estelle Boyle";
            }
        }
        if (genderDeterminer == 2) {
            gender = "male";
            int nameDeterminer = (int) (Math.random()*50 );
            if (nameDeterminer > 45) {
                name = "Danny Graves";
            } else if (nameDeterminer > 40) {
                name = "Egypt Newman";
            } else if (nameDeterminer > 38) {
                name = "Kendrick McConnell";
            } else if (nameDeterminer > 35) {
                name = "Xiomara Dougherty";
            } else if (nameDeterminer > 30) {
                name = "Gabriel Norton";
            } else if (nameDeterminer > 25) {
                name = "Ledger Patrick";
            } else if (nameDeterminer > 20) {
                name = "Fox McCall";
            } else if (nameDeterminer > 15) {
                name = "Cedric Olsen";
            } else if (nameDeterminer > 10) {
                name = "Mitchell Benton";
            } else if (nameDeterminer > 5) {
                name = "Dior Ford";
            } else {
                name = "Clay Freeman";
            }
        }

        happiness = happinessGenerator(limit);
        looks = looksGenerator(limit);
        health = healthGenerator(limit);
        smarts =smartsGenerator(limit);

        TheGame game = new TheGame(looks, happiness, health, smarts, gender, name);
        game.start();

    }

    private int happinessGenerator(int limit){
        return (int) (Math.random()*limit );
    }
    private int happinessGenerator() {
        return (int)(Math.random()*50);
    }
    private int looksGenerator(int limit){
        return (int) (Math.random()*limit );
    }
    private int healthGenerator(int limit){
        return (int) (Math.random()*limit );
    }
    private int smartsGenerator(int limit){
        return (int) (Math.random()*limit );
    }
}

