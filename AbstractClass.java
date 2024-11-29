abstract class Animal {
    String name;
    Animal(String name){
        this.name = name;
    }

   abstract void makeSound();
}


class Dog extends Animal {
    Dog(String name) {
        super(name);
    }

    void makeSound() {
        System.out.println("Woof");
    }
}


class Cat extends Animal {
    Cat(String name) {
        super(name);
    }

    void makeSound() {
        System.out.println("Meow");
    }
}



public class AbstractClass {
    public static void main(String[] args) {
       Dog dog = new Dog("Buddy");
       System.out.println(dog.name);
       dog.makeSound();

       System.out.println();

       Cat cat = new Cat("Whiskers");
       System.out.println(cat.name);
       cat.makeSound();
    }
}
