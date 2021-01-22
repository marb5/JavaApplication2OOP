package inheritance;
import inheritance.animals.Animal;
import inheritance.animals.Dog;
/**
 *
 * @author Marcin
 */
public class Inheritance {
    public static void main(String[] args) 
    {
        Animal a1 = new Animal();
        a1.whatAnimalIAm();
        System.out.println("Imię: " + a1.getName());
        Animal a2 = new Animal(21.32, "Zwierzę");
        a2.whatAnimalIAm();
        System.out.println("Imię: " + a2.getName());
        
        Dog d1 = new Dog();
        d1.whatAnimalIAm();
        System.out.println("Imię: " + d1.getName());
        Dog d2 = new Dog(45.43, "Lucky");
        d2.whatAnimalIAm();
        System.out.println("Imię: " + d2.getName());
        Dog d3 = new Dog(51.12, "Johny", "Husky");
        d3.whatAnimalIAm();
        System.out.println("Imię: " + d3.getName());
    }
}
