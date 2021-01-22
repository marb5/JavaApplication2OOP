package inheritance.animals;

/**
 *
 * @author Marcin
 */
public class Dog extends Animal {
    private String race;
    public String getRace() {
        return this.race;
    }
    @Override
    public void whatAnimalIAm() {
        System.out.println("Jestem psem, ważę " + this.weight + 
                " i mam na imię " + this.name + " moja rasa to " + this.race);
    }
    public Dog() {
        this.weight = 0.0;
        this.name = "";
        this.race = "";
        System.out.println("Domyślny konstruktor z klasy Dog");
    }
    public Dog(double weight, String name) {
        super(weight, name);
        this.race = "";
        System.out.println("Konstruktor z dwoma parametrami z klasy Dog");
    }
    public Dog(double weight, String name, String race) {
        super(weight, name);
        this.race = race;
        System.out.println("Konstruktor z trzema parametrami z klasy Dog");
    }
    public void woo() {
        System.out.println("woo!");
    }
}
