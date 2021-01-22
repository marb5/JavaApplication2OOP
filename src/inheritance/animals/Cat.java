package inheritance.animals;

/**
 *
 * @author Marcin
 */
public class Cat extends Animal {
    private String race;
    public String getRace() {
        return this.race;
    }
    @Override
    public void whatAnimalIAm() {
        System.out.println("Jestem kotem, ważę " + this.weight + 
                " i mam na imię " + this.name + " moja rasa to " + this.race);
    }
    public Cat() {
        this.weight = 0.0;
        this.name = "";
        this.race = "";
        System.out.println("Domyślny konstruktor z klasy Cat");
    }
    public Cat(double weight, String name) {
        super(weight, name);
        this.race = "";
        System.out.println("Konstruktor z dwoma parametrami z klasy Cat");
    }
    public Cat(double weight, String name, String race) {
        super(weight, name);
        this.race = race;
        System.out.println("Konstruktor z trzema parametrami z klasy Cat");
    }
    public void meow() {
        System.out.println("meow!");
    }
}
