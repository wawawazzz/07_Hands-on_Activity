import java.util.Scanner;
public abstract class Animal {
    public abstract void eat();
    public abstract void sleep();
    public abstract void makeSound();
}
public class Bird extends Animal {
    @Override
    public void eat() {
        System.out.println("The bird is eating seeds.");
    }
    @Override
    public void sleep() {
        System.out.println("The bird is sleeping in its nest.");
    }
    @Override
    public void makeSound() {
        System.out.println("The bird is chirping.");
    }
}
public class Cat extends Animal {
    @Override
    public void eat() {
        System.out.println("The cat is eating fish.");
    }
    @Override
    public void sleep() {
        System.out.println("The cat is sleeping on the couch.");
    }
    @Override
    public void makeSound() {
        System.out.println("The cat is meowing.");
    }
}
public class Dog extends Animal {
    @Override
    public void eat() {
        System.out.println("The dog is eating bones.");
    }

    @Override
    public void sleep() {
        System.out.println("The dog is sleeping in its doghouse.");
    }

    @Override
    public void makeSound() {
        System.out.println("The dog is barking.");
    }
}
public class RunAnimal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name of an animal (Bird, Cat, or Dog): ");
        String animalChoice = sc.nextLine().trim().toLowerCase(); 

        Animal animal = null;
        
        if (animalChoice.equalsIgnoreCase("bird")) {
            animal = new Bird();
        } else if (animalChoice.equalsIgnoreCase("cat")) {
            animal = new Cat();
        } else if (animalChoice.equalsIgnoreCase("dog")) {
            animal = new Dog();
        } else {
            System.out.println("Invalid animal choice.");
            sc.close();
            return;
        }
        System.out.println("You have selected: " + animalChoice);
        animal.eat();
        animal.sleep();
        animal.makeSound();

        sc.close();
    }
}
