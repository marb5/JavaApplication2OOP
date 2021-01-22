package inheritance.animals;

/**
 *
 * @author Marcin
 */
public class Animal {
    protected double weight;
    protected String name;
    
    public double getWeight() {
        return this.weight;
    }
    public String getName() {
        return this.name;
    }
    public void whatAnimalIAm() {
        System.out.println("Jestem zwierzęciem, ważę " + this.weight + 
                " i mam na imię " + this.name);
    }
    public Animal() {
        this.weight = 0.0;
        this.name = "";
        System.out.println("Domyślny konstruktor z klasy Animal");
    }
    public Animal(double weight, String name) {
        this.weight = weight;
        this.name = name;
        System.out.println("Konstruktor z dwoma parametrami z klasy Animal");
    }
}
