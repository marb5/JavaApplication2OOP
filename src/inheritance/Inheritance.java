package inheritance;
import inheritance.animals.Animal;
import inheritance.animals.Dog;
import inheritance.animals.Cat;
/**
 *
 * @author Marcin
 */
public class Inheritance {
    public static void main(String[] args) 
    {
        /*Animal a1 = new Animal();
        a1.whatAnimalIAm();
        System.out.println("Imię: " + a1.getName());
        Animal a2 = new Animal(21.32, "Zwierzę");
        a2.whatAnimalIAm();
        System.out.println("Imię: " + a2.getName());*/
        /*
        Animal d1 = new Dog();
        d1.whatAnimalIAm();
        System.out.println("Imię: " + d1.getName());
        Animal d2 = new Dog(45.43, "Lucky");
        d2.whatAnimalIAm();
        System.out.println("Imię: " + d2.getName());
        Animal d3 = new Dog(51.12, "Johny", "Husky");
        d3.whatAnimalIAm();
        System.out.println("Imię: " + d3.getName());
        */
        Animal[] animals = new Animal[10];
        animals[0] = new Dog(51.12, "Johny", "Husky");
        animals[1] = new Cat(4.35, "Katy", "Maine Coon");
        
        for (Animal ani: animals) {
            if (ani instanceof Animal) {
                ani.whatAnimalIAm();
                if (ani instanceof Dog) {
                    ((Dog) ani).woo();
                }
                else if (ani instanceof Cat) {
                    ((Cat) ani).meow();
                }
            }
            else
                break;
        }
    }
}
