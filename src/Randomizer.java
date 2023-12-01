// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Randomizer {
    public static void main(String[] args) {
        String name = " ";
        String gender = " ";
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

        int happiness = (int) (Math.random()*100 );
        int looks = (int) (Math.random()*100 );
        int health = (int) (Math.random()*100 );
        int smarts = (int) (Math.random()*100 );
        TheGame game = new TheGame(looks, happiness, health, smarts, gender, name);
        game.startingstats();
    }
}

