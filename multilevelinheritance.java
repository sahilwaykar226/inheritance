// Base class (Parent Class)
class Animal {
    void eat() {
        System.out.println("Animal is eating");
    }
}

// Derived class (Child class of Animal)
class Dog extends Animal {
    void bark() {
        System.out.println("Dog is barking");
    }
}

// Derived class (Child class of Dog)
class Puppy extends Dog {
    void weep() {
        System.out.println("Puppy is weeping");
    }
}

// Main class
public class Main {
    public static void main(String[] args) {
        Puppy myPuppy = new Puppy();
        
        // Calling me
